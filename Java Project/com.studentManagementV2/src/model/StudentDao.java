package model;

import java.time.LocalDate;
import java.util.ArrayList;

public interface StudentDao {

	public ArrayList<Student> getAllStudents();

	public Student getStudentByEmail(String email);

	public ArrayList<Student> getStudentsByDob(LocalDate dob);

	public boolean deleteStudentByFrn(String frn);

	public Student getStudentsByName(String name);

	public Student getStudentByFrn(String frn);

	public void saveStudents(ArrayList<Student> students);

	public void updateStudent(Student students);

	public ArrayList<MockDetail> getMockDetailsByFRN(String frn);
}
