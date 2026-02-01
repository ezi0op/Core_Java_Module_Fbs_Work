package p2;

import java.io.*;
import java.sql.*;
import java.util.*;

public class Test {

	Connection con;
	Statement stmt;;
	ResultSet rst;

	public void getConnection() {
		try {
			FileInputStream fis = new FileInputStream("./Properties/DbInfo.properties");

			Properties p = new Properties();
			p.load(fis);

			String driver = p.getProperty("classname");
			String url = p.getProperty("url");
			String username = p.getProperty("username");
			String password = p.getProperty("password");

			Class.forName(driver);

			con = DriverManager.getConnection(url, username, password);

			System.out.println("Connection established");

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}

	}

	public void retriveData() {
		try {

			stmt = con.createStatement();

			rst = stmt.executeQuery("Select * from Login");
			
			while (rst.next()) {
				System.out.println(rst.getString(1) + "" + rst.getString(2));
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void insertData() {
		try {
			stmt = con.createStatement();
			int updateCount = stmt.executeUpdate("Insert into login(username,password) values('kshitij','987')");
			System.out.println(updateCount + "Row added");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test a = new Test();

		a.getConnection();
		a.retriveData();
		a.insertData();

	}

}
