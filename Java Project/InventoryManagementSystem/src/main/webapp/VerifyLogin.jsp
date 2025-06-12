<%@page import="com.ims.dao.EmployeeDao"%>
<%@page import="com.ims.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    // Disable caching to prevent users from going back to the login page after logout
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
    response.setHeader("Pragma", "no-cache"); // HTTP 1.0
    response.setDateHeader("Expires", 0); // Proxies
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Verification</title>
</head>
<body>
<%
    // Get username and password from the form submission
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String loginType = request.getParameter("loginType"); // Added this to distinguish admin/employee login

    // Basic validation to prevent null pointer exceptions
    if (username == null || password == null || username.trim().isEmpty() || password.trim().isEmpty()) {
        if ("admin".equalsIgnoreCase(loginType)) {
            response.sendRedirect("AdminLogin.html?error=emptyfields");
        } else { // Assume employee login if not explicitly admin
            response.sendRedirect("EmployeeLogin.html?error=emptyfields");
        }
        return; // Stop further processing
    }

    EmployeeDao employeeDao = new EmployeeDao();
    // The checkLogin method should now return an Employee object or null
    // And ideally, it should also handle the role check internally
    Employee employee = employeeDao.checkLogin(username, password);

    if (employee != null) {
        // Login successful!
        // Store user information in the session
        HttpSession currentSession = request.getSession();
        currentSession.setAttribute("loggedInUser", employee); // Store the Employee object
        currentSession.setAttribute("username", employee.getUsername()); // Store username
        currentSession.setAttribute("role", employee.getRole());       // Store role

        System.out.println("Login successful for user: " + employee.getUsername() + " (Role: " + employee.getRole() + ")");

        // Redirect based on role
        if ("Admin".equalsIgnoreCase(employee.getRole())) {
            response.sendRedirect("admin-portal.html"); // Redirect to Admin Portal
        } else if ("Employee".equalsIgnoreCase(employee.getRole())) {
            response.sendRedirect("employee-portal.html"); // Redirect to Employee Portal
        } else {
            // Fallback for unknown roles or if role is null
            currentSession.invalidate(); // Invalidate session for security
            response.sendRedirect("homepage.html?error=unknownrole");
        }
    } else {
        // Login failed
        String errorMessage = "Invalid username or password. Please try again.";
        System.out.println("Login failed for username: " + username);

        // Redirect back to the appropriate login page with an error parameter
        if ("admin".equalsIgnoreCase(loginType)) {
            response.sendRedirect("AdminLogin.html?error=" + java.net.URLEncoder.encode(errorMessage, "UTF-8"));
        } else {
            response.sendRedirect("EmployeeLogin.html?error=" + java.net.URLEncoder.encode(errorMessage, "UTF-8"));
        }
    }
%>
</body>
</html>
