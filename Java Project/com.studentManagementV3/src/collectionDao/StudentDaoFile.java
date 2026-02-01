package collectionDao;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import model.MockDetail;
import model.Student;

public class StudentDaoFile implements StudentDao {

	static ArrayList<Student> students = null;

	@Override
	public ArrayList<Student> getAllStudents() {
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;

		try {
			fileInputStream = new FileInputStream("D:\\studentdata.txt");
			objectInputStream = new ObjectInputStream(fileInputStream);

			students = (ArrayList<Student>) objectInputStream.readObject();

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;
	}

	@Override
	public Student getStudentByEmail(String email) {
		// TODO Auto-generated method stub
		for (Student s : students) {
			if (s.getEmail().equals(email)) {
				return s;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Student> getStudentsByDob(LocalDate dob) {
		// TODO Auto-generated method stub

		ArrayList<Student> temp = new ArrayList<Student>();

		for (Student s : students) {
			if (s.dob.isEqual(dob))
				temp.add(s);
		}

		return temp;
	}

	public Student getStudentByFrn(String frn) {
		// TODO Auto-generated method stub
		for (Student s : students) {
			if (s.getFrn().equalsIgnoreCase(frn)) {
				return s;
			}
		}

		return null;
	}

	@Override
	public Student getStudentsByName(String name) {
		// TODO Auto-generated method stub
		for (Student s : students) {
			if (s.getName().equals(name))
				return s;
		}
		return null;
	}

	@Override
	public boolean deleteStudentByFrn(String frn) {
		// TODO Auto-generated method stub
		for (Student s : students) {
			if (s.getFrn().equals(frn)) {

				return students.remove(s);
			}

		}
		return false;
	}

	@Override
	public void saveStudents(ArrayList<Student> students) {

		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream("studentdata.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeObject(students);

			objectOutputStream.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateStudent(Student students) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<MockDetail> getMockDetailsByFRN(String frn) {
		// TODO Auto-generated method stub
		for (Student s : students) {
			if (s.getName().equals(frn))
				return s.getMockdetails();
		}
		return new ArrayList<>();
	}

}
