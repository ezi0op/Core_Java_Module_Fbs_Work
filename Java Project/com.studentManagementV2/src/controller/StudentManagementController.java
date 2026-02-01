package controller;

import model.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


import model.StudentDao;
import model.StudentDaoHardCoded;

public class StudentManagementController {
	StudentDao studentDao = new StudentDaoHardCoded();

	ArrayList<Student> students = studentDao.getAllStudents();

	private ArrayList<Student> getLatestStudents() {
		return studentDao.getAllStudents();
	}

	private void saveAllStudents() {
		studentDao.saveStudents(getLatestStudents());
	}

	public void addStudent(Student stud) {
		ArrayList<Student> students = getLatestStudents();
		students.add(stud);
		saveAllStudents();
	}

	public Student getStudentByFrn(String frn) {

		return studentDao.getStudentByFrn(frn);
	}

	public boolean deleteStudentByFrn(String frn) {

		boolean deleted = studentDao.deleteStudentByFrn(frn);
		if (deleted) {
			saveAllStudents();
		}
		return deleted;
	}

	public Student getStudentByEmail(String email) {

		return studentDao.getStudentByEmail(email);
	}

	public ArrayList<Student> getStudentsByDob(String dob) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate dob1 = LocalDate.parse(dob, formatter);

		return studentDao.getStudentsByDob(dob1);
	}

	public ArrayList<Student> getAllStudents() {

		return getLatestStudents();

	}

	public void saveStudents(ArrayList<Student> students) {

		studentDao.saveStudents(students);

	}

	public void sendTodaysBdayWish() {

		ArrayList<Student> students = getLatestStudents();
		LocalDate date = LocalDate.now();
		for (Student s1 : students) {
			if (s1.getDob().getMonth() == date.getMonth() && s1.getDob().getDayOfMonth() == date.getDayOfMonth()) {
				String message = "Happy birthday " + s1.getName();
				SmsOperations.sendSms(message, s1.getMobNo());
			}
		}

	}

	public Student getStudentByMobno(long mobno1) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<MockDetail> getMockDetailsByFRN(String frn) {

		return studentDao.getMockDetailsByFRN(frn);

	}

	public void updateStudent(Student st) {
		// TODO Auto-generated method stub
		saveAllStudents();
	}

}
