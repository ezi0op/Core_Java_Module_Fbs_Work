package com.emp.module;

import java.sql.*;
import java.util.Scanner;

public class EmployeeManagement {

	int eId;
	String eName;
	double sal;
	Scanner sc = new Scanner(System.in);

	public void addEmp() {

		System.out.println("Enter eid : ");
		eId = sc.nextInt();
		System.out.println("Enter name : ");
		eName = sc.next();
		System.out.println("Enter Salary : ");
		sal = sc.nextDouble();

		try {
			Connection con = DBUtility.getSQLConnection();
			String insertQuery = "Insert into Employee values(?,?,?)";

			PreparedStatement psmt = con.prepareStatement(insertQuery);
			psmt.setInt(1, eId);
			psmt.setString(2, eName);
			psmt.setDouble(3, sal);

			int rows = psmt.executeUpdate();

			if (rows > 0) {
				System.out.println("----Data Inserted!");
			}
			DBUtility.resourcesRelease(psmt, con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void searchEmp() {
		System.out.println("Enter Employee ID To Search :");
		eId = sc.nextInt();
		try {
			Connection con = DBUtility.getSQLConnection();

			String insertQuery = "SELECT *  FROM employee WHERE id = ?";

			PreparedStatement psmt = con.prepareStatement(insertQuery);
			psmt.setInt(1, eId);

			ResultSet rst = psmt.executeQuery();

			if (rst.next()) {
				eId = rst.getInt(1);
				eName = rst.getString(2);
				sal = rst.getDouble(3);

				Employee ref = new Employee(eId, eName, sal);
				System.out.println(ref);
			} else {
				System.out.println("Employee with ID " + eId + " not found");
			}

			DBUtility.resourcesRelease(rst, psmt, con);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void updateEmp() {
		System.out.println("Enter Employee ID To Update :");
		eId = sc.nextInt();

		try {
			Connection con = DBUtility.getSQLConnection();

			String searchQuery = "Select * from employee where id=?";

			PreparedStatement spt = con.prepareStatement(searchQuery);
			spt.setInt(1, eId);

			ResultSet rst = spt.executeQuery();

			if (rst.next()) {

				System.out.println("Employee Found");
				System.out.println("Enter New Salary :");
				sal = sc.nextDouble();

				String updateQuery = "Update Employee Set salary =? WHERE id=?";

				PreparedStatement psmt = con.prepareStatement(updateQuery);

				psmt.setDouble(1, sal);
				psmt.setInt(2, eId);

				psmt.executeUpdate();
				System.out.println("----Salary Updated Successfully!");

			} else {
				System.out.println("Employee with ID " + eId + " not found");
			}

			DBUtility.resourcesRelease(rst, spt, con);

		} catch (

		Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void deleteEmp() {

		System.out.println("Enter Employee ID To Update :");
		eId = sc.nextInt();

		try {

			Connection con = DBUtility.getSQLConnection();

			String deleteQuery = "DELETE FROM employee WHERE id = ?";

			PreparedStatement psmt = con.prepareStatement(deleteQuery);
			psmt.setInt(1, eId);

			int rows = psmt.executeUpdate();
			if (rows > 0) {
				System.out.println("----Employee Deleted Successfully!");
			} else {
				System.out.println("--------Employee Not Found!");
			}
			DBUtility.resourcesRelease(psmt, con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void displayAll() {

		try {
			Connection con = DBUtility.getSQLConnection();

			String query = "Select * from employee";

			PreparedStatement psmt = con.prepareStatement(query);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				eId = rs.getInt(1);
				eName = rs.getString(2);
				sal = rs.getDouble(3);

				Employee ref = new Employee(eId, eName, sal);
				System.out.println(ref);

			}
			DBUtility.resourcesRelease(rs, psmt, con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
