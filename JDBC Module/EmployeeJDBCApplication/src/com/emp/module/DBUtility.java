package com.emp.module;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DBUtility {

	private static String classname;
	private static String url;
	private static String user;
	private static String password;

	public static void databaseConfig() {
		try {
			FileInputStream fis = new FileInputStream("./Resources/DBInfo.properties");

			Properties p = new Properties();

			p.load(fis);

			classname = p.getProperty("className");
			url = p.getProperty("url");
			user = p.getProperty("username");
			password = p.getProperty("password");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getSQLConnection() {
		databaseConfig();
		try {

			Class.forName(classname);

			Connection con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;

	}

	public static void resourcesRelease(ResultSet rs,PreparedStatement psmt,Connection con) {
		try {
			rs.close();
			psmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void resourcesRelease(PreparedStatement psmt,Connection con) {
		try {
		
			psmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
