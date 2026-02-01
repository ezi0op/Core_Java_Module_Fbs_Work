package model;

import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.*;

import dbUtil.DBUtility;

public class StudentDaoServiceImp implements StudentDaoService {

	Connection con;
	PreparedStatement psmt;
	ResultSet rst;
	int row;

	@Override
	public void addStudent(Student s) {

		try {
			con = DBUtility.getSQLConnection();

			psmt = con.prepareStatement(
					"INSERT INTO student (frn, name, email, mob_no, github_repo, dob) VALUES (?, ?, ?, ?, ?, ?)");

			psmt.setString(1, s.getFrn());
			psmt.setString(2, s.getName());
			psmt.setString(3, s.getEmail());
			psmt.setLong(4, s.getMobNo());
			psmt.setString(5, s.getGithubRepo());
			psmt.setDate(6, java.sql.Date.valueOf(s.getDob()));

			int rows = psmt.executeUpdate();

			if (rows > 0) {
				System.out.println("Student added successfully.");
				System.out.printf("FRN: %s | Name: %s | Email: %s | Mobile: %d | DOB: %s%n", s.getFrn(), s.getName(),
						s.getEmail(), s.getMobNo(), s.getDob());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtility.resourcesRelease(psmt, con);
		}
	}

	@Override
	public void retrieveStudent() {
		// TODO Auto-generated method stub
		try {
			con = DBUtility.getSQLConnection();
			psmt = con.prepareStatement("Select * from student");
			rst = psmt.executeQuery();
			while (rst.next()) {
				Student s = new Student();
				s.setFrn(rst.getString("frn"));
				s.setName(rst.getString("name"));
				s.setEmail(rst.getString("email"));
				s.setMobNo(rst.getLong("mob_no"));
				s.setGithubRepo(rst.getString("github_repo"));
				s.setDob(rst.getDate("dob").toLocalDate());

				System.out.printf("FRN: %s | Name: %s | Email: %s | Mobile: %d | DOB: %s%n", s.getFrn(), s.getName(),
						s.getEmail(), s.getMobNo(), s.getDob());

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	@Override
	public Student getStudentByEmail(String email) {
		// TODO Auto-generated method stub

		Student s = null;
		try {
			con = DBUtility.getSQLConnection();
			psmt = con.prepareStatement("Select * from student where email=?");
			psmt.setString(1, email);
			rst = psmt.executeQuery();

			if (rst.next()) { // only ONE record expected

				s = new Student();
				s.setFrn(rst.getString("frn"));
				s.setName(rst.getString("name"));
				s.setEmail(rst.getString("email"));
				s.setMobNo(rst.getLong("mob_no"));
				s.setGithubRepo(rst.getString("github_repo"));
				s.setDob(rst.getDate("dob").toLocalDate());

				System.out.printf("FRN: %s | Name: %s | Email: %s | Mobile: %d | DOB: %s%n", s.getFrn(), s.getName(),
						s.getEmail(), s.getMobNo(), s.getDob());

			} else {
				System.out.println("Student not found with email: " + email);
			}
			DBUtility.resourcesRelease(rst, psmt, con);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return s;
	}

	@Override
	public Student getStudentsByDob(LocalDate dob) {
		// TODO Auto-generated method stub
		Student s = null;
		try {
			con = DBUtility.getSQLConnection();
			psmt = con.prepareStatement("Select * from student where dob=?");
			psmt.setDate(1, java.sql.Date.valueOf(dob));
			rst = psmt.executeQuery();

			if (rst.next()) { // only ONE record expected

				s = new Student();
				s.setFrn(rst.getString("frn"));
				s.setName(rst.getString("name"));
				s.setEmail(rst.getString("email"));
				s.setMobNo(rst.getLong("mob_no"));
				s.setGithubRepo(rst.getString("github_repo"));
				s.setDob(rst.getDate("dob").toLocalDate());
				System.out.printf("FRN: %s | Name: %s | Email: %s | Mobile: %d | DOB: %s%n", s.getFrn(), s.getName(),
						s.getEmail(), s.getMobNo(), s.getDob());

			} else {
				System.out.println("Student not found with DOB: " + dob);
			}
			DBUtility.resourcesRelease(rst, psmt, con);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return s;
	}

	@Override
	public Student getStudentsByName(String name) {
		// TODO Auto-generated method stub
		Student s = null;
		try {
			con = DBUtility.getSQLConnection();
			psmt = con.prepareStatement("Select * from student where name=?");
			psmt.setString(1, name);
			rst = psmt.executeQuery();

			if (rst.next()) { // only ONE record expected

				s = new Student();
				s.setFrn(rst.getString("frn"));
				s.setName(rst.getString("name"));
				s.setEmail(rst.getString("email"));
				s.setMobNo(rst.getLong("mob_no"));
				s.setGithubRepo(rst.getString("github_repo"));
				s.setDob(rst.getDate("dob").toLocalDate());
				System.out.printf("FRN: %s | Name: %s | Email: %s | Mobile: %d | DOB: %s%n", s.getFrn(), s.getName(),
						s.getEmail(), s.getMobNo(), s.getDob());

			} else {
				System.out.println("Student not found with name: " + name);
			}
			DBUtility.resourcesRelease(rst, psmt, con);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return s;
	}

	@Override
	public Student getStudentByFrn(String frn) {
		// TODO Auto-generated method stub
		Student s = null;
		try {
			con = DBUtility.getSQLConnection();
			psmt = con.prepareStatement("Select * from student where frn=?");
			psmt.setString(1, frn);
			rst = psmt.executeQuery();

			if (rst.next()) { // only ONE record expected

				s = new Student();
				s.setFrn(rst.getString("frn"));
				s.setName(rst.getString("name"));
				s.setEmail(rst.getString("email"));
				s.setMobNo(rst.getLong("mob_no"));
				s.setGithubRepo(rst.getString("github_repo"));
				s.setDob(rst.getDate("dob").toLocalDate());

				System.out.printf("FRN: %s | Name: %s | Email: %s | Mobile: %d | DOB: %s%n", s.getFrn(), s.getName(),
						s.getEmail(), s.getMobNo(), s.getDob());

			} else {
				System.out.println("Student not found with frn: " + frn);
			}
			DBUtility.resourcesRelease(rst, psmt, con);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return s;
	}

	@Override
	public boolean isStudentExist(String frn) {
		// TODO Auto-generated method stub

		boolean exists = false;

		try {
			con = DBUtility.getSQLConnection();

			psmt = con.prepareStatement("SELECT 1 FROM student WHERE frn = ?");
			psmt.setString(1, frn);

			rst = psmt.executeQuery();

			if (rst.next()) {
				exists = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtility.resourcesRelease(rst, psmt, con);
		}

		return exists;
	}

	@Override
	public boolean deleteStudentByFrn(String frn) {
		// TODO Auto-generated method stub

		boolean flag = false;
		try {
			con = DBUtility.getSQLConnection();
			psmt = con.prepareStatement("Select * from student where frn=?");
			psmt.setString(1, frn);
			rst = psmt.executeQuery();

			if (rst.next()) { // only ONE record expected

				System.out.printf("Deleting Student -> FRN: %s | Name: %s | Email: %s | Mobile: %d | DOB: %s%n",
						rst.getString("frn"), rst.getString("name"), rst.getString("email"), rst.getLong("mob_no"),
						rst.getDate("dob").toLocalDate());
				DBUtility.resourcesRelease(rst, psmt);
				psmt = con.prepareStatement("DELETE FROM student WHERE frn = ?");
				psmt.setString(1, frn);

				int rows = psmt.executeUpdate();

				if (rows > 0) {
					flag = true;
					System.out.println("Student deleted successfully.");
				}

			} else {
				System.out.println("Student not found with frn: " + frn);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtility.resourcesRelease(rst, psmt, con);
		}

		return flag;
	}

	@Override
	public void updateStudentEmail(String frn, String email) {
		// TODO Auto-generated method stub
		try {
			con = DBUtility.getSQLConnection();
			psmt = con.prepareStatement("Update student set email=? where frn=?");
			psmt.setString(1, email);
			psmt.setString(2, frn);
			row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("Email updated Successfully.");

				DBUtility.resourcesRelease(psmt);
				psmt = con.prepareStatement("SELECT * FROM student WHERE frn = ?");
				psmt.setString(1, frn);
				rst = psmt.executeQuery();

				if (rst.next()) {
					System.out.printf("FRN: %s | Name: %s | Email: %s | Mobile: %d | DOB: %s%n", rst.getString("frn"),
							rst.getString("name"), rst.getString("email"), rst.getLong("mob_no"),
							rst.getDate("dob").toLocalDate());
				}

			}

			else {
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtility.resourcesRelease(rst, psmt, con);
		}

	}

	@Override
	public void updateStudentMobno(String frn, String mobNo) {
		// TODO Auto-generated method stub
		try {
			con = DBUtility.getSQLConnection();
			psmt = con.prepareStatement("Update student set mob_no=? where frn=?");
			psmt.setString(1, mobNo);
			psmt.setString(2, frn);
			row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("Mobno updated Successfully.");

				DBUtility.resourcesRelease(psmt);
				psmt = con.prepareStatement("SELECT * FROM student WHERE frn = ?");
				psmt.setString(1, frn);
				rst = psmt.executeQuery();

				if (rst.next()) {
					System.out.printf("FRN: %s | Name: %s | Email: %s | Mobile: %d | DOB: %s%n", rst.getString("frn"),
							rst.getString("name"), rst.getString("email"), rst.getLong("mob_no"),
							rst.getDate("dob").toLocalDate());
				}

			}

			else {
				System.out.println("Student not found with FRN: " + frn);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtility.resourcesRelease(rst, psmt, con);
		}
	}

	@Override
	public void retrieveStudentsSortedByFrn() {
		// TODO Auto-generated method stub
		try {
			con = DBUtility.getSQLConnection();
			psmt = con.prepareStatement("Select * from student order by frn");
			rst = psmt.executeQuery();
			while (rst.next()) {
				Student s = new Student();
				s.setFrn(rst.getString("frn"));
				s.setName(rst.getString("name"));
				s.setEmail(rst.getString("email"));
				s.setMobNo(rst.getLong("mob_no"));
				s.setGithubRepo(rst.getString("github_repo"));
				s.setDob(rst.getDate("dob").toLocalDate());

				System.out.printf("FRN: %s | Name: %s | Email: %s | Mobile: %d | DOB: %s%n", s.getFrn(), s.getName(),
						s.getEmail(), s.getMobNo(), s.getDob());

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void retrieveStudentsSortedByName() {
		// TODO Auto-generated method stub
		try {
			con = DBUtility.getSQLConnection();
			psmt = con.prepareStatement("Select * from student order by name");
			rst = psmt.executeQuery();
			while (rst.next()) {
				Student s = new Student();
				s.setFrn(rst.getString("frn"));
				s.setName(rst.getString("name"));
				s.setEmail(rst.getString("email"));
				s.setMobNo(rst.getLong("mob_no"));
				s.setGithubRepo(rst.getString("github_repo"));
				s.setDob(rst.getDate("dob").toLocalDate());

				System.out.printf("FRN: %s | Name: %s | Email: %s | Mobile: %d | DOB: %s%n", s.getFrn(), s.getName(),
						s.getEmail(), s.getMobNo(), s.getDob());

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void getMockDetailsByFRN(String frn) {
		// TODO Auto-generated method stub
		try {
			con = DBUtility.getSQLConnection();
			psmt = con.prepareStatement("Select * from mock_detail where frn=?");
			psmt.setString(1, frn);
			rst = psmt.executeQuery();
			boolean found = false;

			while (rst.next()) {
				found = true;

				Date d = rst.getDate("mock_date");
				LocalDate date = null;

				if (d != null) {
					date = d.toLocalDate();
				}

				System.out.printf("FRN: %s | Module: %s | Status: %s | Date: %s%n", rst.getString("frn"),
						rst.getString("module_name"), rst.getString("mock_status"), date);
			}

			if (!found) {
				System.out.println("No mock details found for FRN: " + frn);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtility.resourcesRelease(rst, psmt, con);
		}

	}

	@Override
	public void getMockClearStatus() {
		// TODO Auto-generated method stub
		try {
			con = DBUtility.getSQLConnection();
			psmt = con.prepareStatement("Select * from mock_detail WHERE mock_status = 'CLEAR'");

			rst = psmt.executeQuery();
			boolean found = false;

			while (rst.next()) {
				found = true;

				Date d = rst.getDate("mock_date");
				LocalDate date = null;

				if (d != null) {
					date = d.toLocalDate();
				}

				System.out.printf("FRN: %s | Module: %s | Status: %s | Date: %s%n", rst.getString("frn"),
						rst.getString("module_name"), rst.getString("mock_status"), date);
			}

			if (!found) {
				System.out.println("No mock details found for FRN: ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtility.resourcesRelease(rst, psmt, con);
		}

	}

	@Override
	public void retrieveStudentSortedByMockClearStatus() {
		// TODO Auto-generated method stub
		try {
			con = DBUtility.getSQLConnection();
			psmt = con.prepareStatement("Select * from mock_detail WHERE mock_status =  'CLEAR'");

			rst = psmt.executeQuery();
			boolean found = false;

			while (rst.next()) {
				found = true;

				Date d = rst.getDate("mock_date");
				LocalDate date = null;

				if (d != null) {
					date = d.toLocalDate();
				}

				System.out.printf("FRN: %s | Module: %s | Status: %s | Date: %s%n", rst.getString("frn"),
						rst.getString("module_name"), rst.getString("mock_status"), date);
			}

			if (!found) {
				System.out.println("No mock details found for FRN: ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtility.resourcesRelease(rst, psmt, con);
		}
	}

	@Override
	public void retrieveStudentSortedByMockUnClearStatus() {
		// TODO Auto-generated method stub
		try {
			con = DBUtility.getSQLConnection();
			psmt = con.prepareStatement("Select * from mock_detail WHERE mock_status =  'NOT_CLEAR'");

			rst = psmt.executeQuery();
			boolean found = false;

			while (rst.next()) {
				found = true;

				Date d = rst.getDate("mock_date");
				LocalDate date = null;

				if (d != null) {
					date = d.toLocalDate();
				}

				System.out.printf("FRN: %s | Module: %s | Status: %s | Date: %s%n", rst.getString("frn"),
						rst.getString("module_name"), rst.getString("mock_status"), date);
			}

			if (!found) {
				System.out.println("No mock details found for FRN: ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtility.resourcesRelease(rst, psmt, con);
		}
	}

	@Override
	public void getAllMockDetails() {
		// TODO Auto-generated method stub
		try {
			con = DBUtility.getSQLConnection();
			psmt = con.prepareStatement("Select * from mock_detail");

			rst = psmt.executeQuery();
			boolean found = false;

			while (rst.next()) {
				found = true;

				System.out.printf("FRN: %s | Module: %s | Status: %s | Date: %s%n", rst.getString("frn"),
						rst.getString("module_name"), rst.getString("mock_status"), rst.getDate("mock_date"));
			}

			if (!found) {
				System.out.println("No mock details found for FRN: ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtility.resourcesRelease(rst, psmt, con);
		}
	}

	@Override
	public void addMockDetails(String frn, MockDetail m) {
		// TODO Auto-generated method stub
		try {
			con = DBUtility.getSQLConnection();

			psmt = con.prepareStatement(
					"INSERT INTO mock_detail (frn, module_name, mock_status, mock_date) VALUES (?,?, ?, ?)");

			psmt.setString(1, frn);
			psmt.setString(2, m.getModuleName());
			psmt.setString(3, m.getMockStatus().name());

			if (m.getMockdate() != null) {
				psmt.setDate(4, java.sql.Date.valueOf(m.getMockdate()));
			} else {
				psmt.setNull(4, Types.DATE);
			}

			row = psmt.executeUpdate();
			if (row > 0) {
				System.out.println("Mock details added successfully.");
				System.out.printf("FRN: %s | Module: %s | Status: %s | Date: %s%n", frn, m.getModuleName(),
						m.getMockStatus(), m.getMockdate());
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtility.resourcesRelease(psmt, con);
		}

	}

	@Override
	public void deleteMockDetails(String frn) {
		// TODO Auto-generated method stub

		try {
			con = DBUtility.getSQLConnection();

			psmt = con.prepareStatement("DELETE FROM mock_detail WHERE frn = ?");
			psmt.setString(1, frn);

			int rows = psmt.executeUpdate();

			if (rows > 0) {
				System.out.println("Mock details deleted successfully for FRN: " + frn);
			} else {
				System.out.println("No mock details found for FRN: " + frn);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtility.resourcesRelease(psmt, con);
		}

	}

	@Override
	public void updateMockStatus(String frn, String moduleName, MockStatus status) {
		// TODO Auto-generated method stub
		try {
			con = DBUtility.getSQLConnection();

			psmt = con.prepareStatement(
					"UPDATE mock_detail SET mock_status = ?, mock_date = ? WHERE frn = ? AND module_name = ?");

			psmt.setString(1, status.name());

			if (status == MockStatus.ABSENT) {
				psmt.setNull(2, Types.DATE);
			} else {
				psmt.setDate(2, Date.valueOf(LocalDate.now()));
			}

			psmt.setString(3, frn);
			psmt.setString(4, moduleName);

			row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("Mock status updated successfully.");
				System.out.printf("FRN: %s | Module: %s | Status: %s%n", frn, moduleName, status);
			} else {
				System.out.println("No mock record found for given FRN & Module.");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtility.resourcesRelease(psmt, con);
		}

	}

}
