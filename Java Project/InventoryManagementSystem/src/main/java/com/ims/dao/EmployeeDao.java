package com.ims.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ims.entity.Employee;

public class EmployeeDao {
	
	Connection con;
	ResultSet rs;
	PreparedStatement ps;
	
	public EmployeeDao() {
	
		try {
			//step-1 load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");
			
			//step-2 connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IMS","root","28112003");
			System.out.println("connection created");
			
			boolean status = fetchNCreateTable("employee");
			if(status)
			{
				System.out.println("Table created Successfully");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean fetchNCreateTable(String tableName) {
		PreparedStatement ps;
		
		String sql = "CREATE TABLE " + tableName + " ("
					+ "empid INT PRIMARY KEY AUTO_INCREMENT, " 
					+ "empname VARCHAR(50), "
					+ "age int,"
					+ "gender varchar(6),"
					+ "phone VARCHAR(50), "
					+ "salary FLOAT, "
					+ "password VARCHAR(50))";
		
		try {
			Statement st = con.createStatement();
			rs = st.executeQuery("show tables like '"+tableName+"'");
			
			if(rs.next()) {
				System.out.println("Table exist Already");
			}
			else {
				System.out.println("Need to create the table");
				ps = con.prepareStatement(sql);
				
				int status = ps.executeUpdate();
				if(status  == 1) {
					System.out.println("Table created successfully");
				}
				return true;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
		
	}
	
	public boolean checkLogin(String username , String password) {
		
		PreparedStatement ps;
		
		String q = "select * from employee where empid = ? and password = ?";
		
		try {
			ps = con.prepareStatement(q);
			ps.setString(1 , username);
			ps.setString(2 , password);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public int registerEmployee(Employee emp)
	{
		String query = "insert into employee values(?,?,?,?,?,?,?)";
		
		try 
		{
			ps=con.prepareStatement(query);
			ps.setInt(1, emp.getEmpcode());
			ps.setString(2, emp.getEmpname());
			ps.setInt(3, emp.getAge());
			ps.setString(4, emp.getGender());
			ps.setString(5, emp.getPhone());
			ps.setFloat(6, emp.getSalary());
			ps.setString(7, emp.getPassword());
			
			int status = ps.executeUpdate();
			System.out.println("Record Inserted : "+status);
			return status;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public Employee fetchEmployee(int empcode)
	{
		String query = "select * from employee where empid = ?";
		try 
		{
			ps= con.prepareStatement(query);
			ps.setInt(1, empcode);
			
			rs = ps.executeQuery();
			
			if(rs.next())
			{
				Employee e= new Employee();
				
				e.setEmpcode(rs.getInt(1));
				e.setEmpname(rs.getString(2));
				e.setAge(rs.getInt(3));
				e.setGender(rs.getString(4));
				e.setPhone(rs.getString(5));
				e.setSalary(rs.getFloat(6));
				e.setPassword(rs.getString(7));
				
				return e;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) {
		EmployeeDao ed = new EmployeeDao();
		
		
		String tableName = "employee";
		ed.fetchNCreateTable(tableName);
	}
}