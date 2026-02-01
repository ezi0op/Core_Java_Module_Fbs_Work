package controller;

import model.MockDetail;
import model.MockStatus;
import model.Student;
import model.StudentDaoService;
import model.StudentDaoServiceImp;

import java.time.LocalDate;

public class StudentManagementController {

	private StudentDaoService studentDao = new StudentDaoServiceImp();

	public void addStudent(Student s) {
		studentDao.addStudent(s);
	}

	public void getAllStudents() {
		studentDao.retrieveStudent();
	}

	public Student getStudentByEmail(String email) {
		return studentDao.getStudentByEmail(email);
	}

	public Student getStudentByFrn(String frn) {
		return studentDao.getStudentByFrn(frn);
	}

	public Student getStudentByName(String name) {
		return studentDao.getStudentsByName(name);
	}

	public Student getStudentByDob(LocalDate dob) {
		return studentDao.getStudentsByDob(dob);
	}

	public boolean deleteStudentByFrn(String frn) {
		return studentDao.deleteStudentByFrn(frn);
	}

	public void updateStudentEmail(String frn, String email) {
		studentDao.updateStudentEmail(frn, email);
	}

	public void updateStudentMobno(String frn, String mobNo) {
		studentDao.updateStudentMobno(frn, mobNo);
	}

	public void sortStudentsByFrn() {
		studentDao.retrieveStudentsSortedByFrn();
	}

	public void sortStudentsByName() {
		studentDao.retrieveStudentsSortedByName();
	}

	public boolean isValidStudent(String frn) {
		return studentDao.isStudentExist(frn);
	}

	public void getAllMockDetails() {
		studentDao.getAllMockDetails();
	}

	public void getMockDetailsByFRN(String frn) {
		studentDao.getMockDetailsByFRN(frn);
	}

	public void getClearedMockStudents() {
		studentDao.retrieveStudentSortedByMockClearStatus();
	}

	public void getUnclearedMockStudents() {
		studentDao.retrieveStudentSortedByMockUnClearStatus();
	}

	public void addMockDetails(String frn, String moduleName, MockStatus status, LocalDate date) {
		MockDetail m = new MockDetail(moduleName, status, date);
		studentDao.addMockDetails(frn, m);
	}

	public void updateMockStatus(String frn, String moduleName, MockStatus status) {
		studentDao.updateMockStatus(frn, moduleName, status);
	}

	public void deleteMockDetails(String frn) {
		studentDao.deleteMockDetails(frn);
	}

}
