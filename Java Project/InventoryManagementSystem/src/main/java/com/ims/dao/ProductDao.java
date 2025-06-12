package com.ims.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDao 
{
	Connection con;
	Statement st;
	ResultSet rs;
	String dbname;
	String tablename;
	
	public ProductDao() 
	{
		dbname="IMS";
		tablename = "Product";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Found...");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","28112003");
			System.out.println("Connection established...");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// find if we have the upper database or not
	// find if we have the given table or not
	// to create a database using jdbc
	// to create a table using jdbc
	
	public void fetchDB()
	{
		PreparedStatement ps;
		String query = "select SCHEMA_NAME from INFORMATION_SCHEMA.SCHEMATA where SCHEMA_NAME=?";
		try 
		{
			ps=con.prepareStatement(query);
			ps.setString(1, dbname);
			rs = ps.executeQuery();
			
			if(rs.next())
			{
				System.out.println("Database exists...");
			
			}
			else
			{
				String q1 = "create database "+dbname;
				ps=con.prepareStatement(q1);
				int status = ps.executeUpdate();
				System.out.println("Data base created : "+status);
				
			}
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,"root","28112003");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
//	fetch if table with name(Entity class name) already exists or not
	public boolean fetchnCreateTable()
	{
		String q1 = "create table "+tablename+"(pid int primary key auto_increment, pname varchar(50), "
				+ "qty int, costprice float, sellingprice float, description varchar(100))";
		
//		create object of DatabaseMetaData and get the list of all the tables using function
//		con.getMetaData() of Connection class.
		
		try
		{
			st=con.createStatement();
			rs= st.executeQuery("show tables like '"+tablename+"'");
			
			if(rs.next())
				System.out.println("Table already exists!!");
			else
			{
				System.out.println("Need to create the table");
				PreparedStatement ps =con.prepareStatement(q1);
				int status = ps.executeUpdate();
				System.out.println("table created status : "+status);
				if(status==1)
					System.out.println("Table created Successfully!!");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public boolean checkLogin(String username, String password)
	{
		String query = "select * from product where userid='"+username+"' and password='"+password+"'";
		
		try 
		{
			st = con.createStatement();
			rs = st.executeQuery(query);
			
			if(rs.next())
				return true;
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public static void main(String[] args) {
		ProductDao pd=new ProductDao();
		pd.fetchDB();
		
		
		boolean status = pd.fetchnCreateTable();
		System.out.println("Table status : "+status);
	}
	
}
