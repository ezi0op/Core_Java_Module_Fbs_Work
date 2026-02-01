package com.loginService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.dbutil.DBUtility;
import com.login.Login;
import com.loginServiceImplementation.LoginServiceImpl;

public class LoginService implements LoginServiceImpl {

	String user;
	String pass;
	Scanner sc = new Scanner(System.in);

	@Override
	public void createUser() {
		// TODO Auto-generated method stub

		System.out.println("Enter User Name :");
		user = sc.next();
		System.out.println("Enter Password :");
		pass = sc.next();

		try {
			Connection con = DBUtility.getSQLConnection();
			String createQuery = "INSERT INTO login (username, password)VALUES (?, ?)";

			PreparedStatement psmt = con.prepareStatement(createQuery);
			psmt.setString(1, user);
			psmt.setString(2, pass);

			int row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("----Data Inserted!");
			}
			DBUtility.resourcesRelease(psmt, con);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	@Override
	public boolean validateUser() {
		// TODO Auto-generated method stub
		System.out.println("Enter User Name :");
		user = sc.next();
		System.out.println("Enter Password :");
		pass = sc.next();
		try {
			Connection con = DBUtility.getSQLConnection();
			String valQuery = "SELECT * FROM login WHERE username = ? AND password = ?";

			PreparedStatement psmt = con.prepareStatement(valQuery);
			psmt.setString(1, user);
			psmt.setString(2, pass);

			ResultSet rs = psmt.executeQuery();

			if (rs.next()) {
				DBUtility.resourcesRelease(rs, psmt, con);
				return true;
			}
			DBUtility.resourcesRelease(rs, psmt, con);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	public void displayUsers() {

	    try {
	        Connection con = DBUtility.getSQLConnection();

	        String displayQuery = "SELECT username, password FROM login";

	        PreparedStatement psmt = con.prepareStatement(displayQuery);
	        ResultSet rs = psmt.executeQuery();

	        System.out.println("\n---- USER LIST ----");
	        System.out.println("USERNAME\tPASSWORD");
	        System.out.println("---------------------------");

	        while (rs.next()) {
	            System.out.println(
	                    rs.getString("username") + "\t\t" +
	                    rs.getString("password")
	            );
	        }

	        DBUtility.resourcesRelease(rs, psmt, con);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}


}
