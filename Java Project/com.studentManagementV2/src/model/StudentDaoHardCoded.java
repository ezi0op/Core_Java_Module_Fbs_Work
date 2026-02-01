package model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class StudentDaoHardCoded implements StudentDao {

	static ArrayList<Student> students = new ArrayList<Student>();

	static {

		{

			students.add(new Student("FRN001", "amit.sharma@gmail.com", 9876543210L, "Amit Sharma",
					"https://github.com/amitsharma", LocalDate.of(2000, 1, 15)));
			students.add(new Student("FRN002", "priya.patel@gmail.com", 9898989898L, "Priya Patel",
					"https://github.com/priyapatel", LocalDate.of(1999, 5, 22)));
			students.add(new Student("FRN003", "rohit.verma@gmail.com", 9123456789L, "Rohit Verma",
					"https://github.com/rohitverma", LocalDate.of(2001, 3, 10)));
			students.add(new Student("FRN004", "neha.joshi@gmail.com", 9988776655L, "Neha Joshi",
					"https://github.com/nehajoshi", LocalDate.of(2000, 11, 2)));
			students.add(new Student("FRN005", "sachin.kale@gmail.com", 9090909090L, "Sachin Kale",
					"https://github.com/sachinkale", LocalDate.of(1998, 12, 19)));

			students.add(new Student("FRN006", "pooja.nair@gmail.com", 9765432109L, "Pooja Nair",
					"https://github.com/poojanair", LocalDate.of(2001, 12, 19)));
			students.add(new Student("FRN007", "vikas.singh@gmail.com", 9345678901L, "Vikas Singh",
					"https://github.com/vikassingh", LocalDate.of(1999, 9, 14)));
			students.add(new Student("FRN008", "kiran.mane@gmail.com", 9887766554L, "Kiran Mane",
					"https://github.com/kiranmane", LocalDate.of(2000, 4, 8)));
			students.add(new Student("FRN0016", "anita.desai@gmail.com", 9012345678L, "Anita Desai",
					"https://github.com/anitadesai", LocalDate.of(1999, 9, 14)));
			students.add(new Student("FRN010", "rahul.mehta@gmail.com", 9998887776L, "Rahul Mehta",
					"https://github.com/rahulmehta", LocalDate.of(2001, 6, 30)));

			students.add(new Student("FRN021", "sonal.jain@gmail.com", 9876123456L, "Sonal Jain",
					"https://github.com/sonaljain", LocalDate.of(1999, 9, 14)));
			students.add(new Student("FRN012", "deepak.pawar@gmail.com", 9753124680L, "Deepak Pawar",
					"https://github.com/deepakpawar", LocalDate.of(2000, 8, 5)));
			students.add(new Student("FRN013", "mehul.gupta@gmail.com", 9647382910L, "Mehul Gupta",
					"https://github.com/mehulgupta", LocalDate.of(1998, 12, 1)));
			students.add(new Student("FRN014", "sneha.kulkarni@gmail.com", 9823012345L, "Sneha Kulkarni",
					"https://github.com/snehakulkarni", LocalDate.of(2001, 1, 18)));

		}
	}

	public ArrayList<Student> getAllStudents() {

		return students;

	}

	public Student getStudentByEmail(String email) {
		for (Student s : students) {
			if (s.getEmail().equals(email))
				return s;
		}
		return null;
	}

	public ArrayList<Student> getStudentsByDob(LocalDate dob) {

		ArrayList<Student> temp = new ArrayList<Student>();

		for (Student s : students) {
			if (s.dob.isEqual(dob))
				temp.add(s);
		}

		return temp;
	}

	public boolean deleteStudentByFrn(String frn) {

		for (Student s : students)
			if (s.getFrn().equals(frn))
				return students.remove(s);

		return false;

	}

	public Student getStudentsByName(String name) {
		for (Student s : students) {
			if (s.getName().equals(name))
				return s;
		}
		return null;
	}

	public Student getStudentByFrn(String frn) {
		for (Student s : students) {
			if (s.getFrn().equals(frn))
				return s;
		}
		return null;
	}

	@Override
	public void saveStudents(ArrayList<Student> students1) {

		// students.addAll(students);
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
		Student student = getStudentByFrn(frn);
		if (student != null) {
			return student.getMockdetails();
		}
		return new ArrayList<>();
	}
}
