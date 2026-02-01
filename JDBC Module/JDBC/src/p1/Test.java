package p1;

import java.sql.*;

public class Test {

	Connection con;
	Statement stmt;
	ResultSet rst;

	public void getConnection() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/log_in", "root", "amit");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void retriveData() { 
		
		try {

			stmt = con.createStatement();
			rst = stmt.executeQuery("select * from login");

			while (rst.next()) {
				System.out.println(rst.getString(1) + " " + rst.getString(2));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void insertData() {
		try {
			stmt = con.createStatement();
			int updateCount = stmt.executeUpdate("insert into login(username,password) values('jpk',12345)");
			
			System.out.println(updateCount +"Row inserted");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Test a = new Test();
		a.getConnection();

		a.retriveData();
		a.insertData();

	}
}
