package model;

import java.time.LocalDate;
import java.util.List;

public interface StudentDaoService {

	public void retrieveStudent();

	public void addStudent(Student s);

	public Student getStudentByEmail(String email);

	public Student getStudentsByDob(LocalDate dob);

	public boolean deleteStudentByFrn(String frn);

	public Student getStudentsByName(String name);

	public Student getStudentByFrn(String frn);

	public void updateStudentEmail(String email, String frn);

	public void updateStudentMobno(String mobNo, String frn);

	public void retrieveStudentsSortedByFrn();

	public void retrieveStudentsSortedByName();

	public boolean isStudentExist(String frn);

	public void getAllMockDetails();

	public void getMockDetailsByFRN(String frn);

	public void getMockClearStatus();

	public void retrieveStudentSortedByMockClearStatus();

	public void retrieveStudentSortedByMockUnClearStatus();

	public void addMockDetails(String frn, MockDetail m);

	public void deleteMockDetails(String frn);

	public void updateMockStatus(String frn, String moduleName, MockStatus status);
}
