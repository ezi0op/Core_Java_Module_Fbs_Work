package com.dbutil;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DBUtility {

	private static String classname;
	private static String url;
	private static String user;
	private static String password;

	public static void dbConfig() {
		try {
			FileInputStream fis = new FileInputStream("./Resources/DBInfo.properties");
			Properties p = new Properties();
			p.load(fis);
			classname = p.getProperty("className");
			url = p.getProperty("url");
			user = p.getProperty("username");
			password = p.getProperty("password");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static Connection getSQLConnection() {
		dbConfig();
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

	public static void resourcesRelease(PreparedStatement psmt, Connection con) {
		// TODO Auto-generated method stub

		try {
			psmt.close();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void resourcesRelease(ResultSet rs, PreparedStatement psmt, Connection con) {
		// TODO Auto-generated method stub
		try {
			rs.close();
			psmt.close();
			con.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
