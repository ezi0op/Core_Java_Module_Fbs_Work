package com.studentManagementModel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StudentManagementController {
	Scanner sc = new Scanner(System.in);

	static int count = 100;
	static int index = 0;
	static Student[] students = new Student[count];
	{

		students[index++] = new Student("FRN001", "amit@gmail.com", 9876543201L, "Amit", "https://github.com/amit1",
				LocalDate.of(2001, 1, 10));
		students[index++] = new Student("FRN002", "rahul@gmail.com", 9876543202L, "Rahul", "https://github.com/rahul2",
				LocalDate.of(2000, 2, 15));
		students[index++] = new Student("FRN003", "rohit@gmail.com", 9876543203L, "Rohit", "https://github.com/rohit3",
				LocalDate.of(2001, 3, 20));
		students[index++] = new Student("FRN004", "sneha@gmail.com", 9876543204L, "Sneha", "https://github.com/sneha4",
				LocalDate.of(2002, 4, 25));
		students[index++] = new Student("FRN005", "pooja@gmail.com", 9876543205L, "Pooja", "https://github.com/pooja5",
				LocalDate.of(2001, 5, 12));

		students[index++] = new Student("FRN006", "vikas@gmail.com", 9876543206L, "Vikas", "https://github.com/vikas6",
				LocalDate.of(2000, 6, 18));
		students[index++] = new Student("FRN007", "neha@gmail.com", 9876543207L, "Neha", "https://github.com/neha7",
				LocalDate.of(2002, 7, 22));
		students[index++] = new Student("FRN008", "sagar@gmail.com", 9876543208L, "Sagar", "https://github.com/sagar8",
				LocalDate.of(2001, 8, 30));
		students[index++] = new Student("FRN009", "komal@gmail.com", 9876543209L, "Komal", "https://github.com/komal9",
				LocalDate.of(2000, 9, 14));
		students[index++] = new Student("FRN010", "nikhil@gmail.com", 9876543210L, "Nikhil",
				"https://github.com/nikhil10", LocalDate.of(2001, 10, 5));

		students[index++] = new Student("FRN011", "ankita@gmail.com", 9876543211L, "Ankita",
				"https://github.com/ankita11", LocalDate.of(2002, 11, 19));
		students[index++] = new Student("FRN012", "gaurav@gmail.com", 9876543212L, "Gaurav",
				"https://github.com/gaurav12", LocalDate.of(2001, 12, 1));
		students[index++] = new Student("FRN013", "tanvi@gmail.com", 9876543213L, "Tanvi", "https://github.com/tanvi13",
				LocalDate.of(2000, 3, 8));
		students[index++] = new Student("FRN014", "pratik@gmail.com", 9876543214L, "Pratik",
				"https://github.com/pratik14", LocalDate.of(2002, 6, 27));
		students[index++] = new Student("FRN015", "sonali@gmail.com", 9876543215L, "Sonali",
				"https://github.com/sonali15", LocalDate.of(2001, 7, 9));

		students[index++] = new Student("FRN016", "akshay@gmail.com", 9876543216L, "Akshay",
				"https://github.com/akshay16", LocalDate.of(2000, 8, 16));
		students[index++] = new Student("FRN017", "mayur@gmail.com", 9876543217L, "Mayur", "https://github.com/mayur17",
				LocalDate.of(2001, 9, 21));
		students[index++] = new Student("FRN018", "kiran@gmail.com", 9876543218L, "Kiran", "https://github.com/kiran18",
				LocalDate.of(2002, 10, 11));
		students[index++] = new Student("FRN019", "dipak@gmail.com", 9876543219L, "Dipak", "https://github.com/dipak19",
				LocalDate.of(2000, 11, 3));
		students[index++] = new Student("FRN020", "shubham@gmail.com", 9876543220L, "Shubham",
				"https://github.com/shubham20", LocalDate.of(2001, 12, 29));

	}

	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		students[index++] = s;

	}

	public void displayAllStudent() {
		// TODO Auto-generated method stub
		if (index == 0) {
			System.out.println("No student found!");
			return;
		}
		for (int i = 0; i < index; i++) {
			System.out.println(students[i]);
		}
	}

	public static Student getStudentByFrn(String frn) {
		// TODO Auto-generated method stub
		for (int i = 0; i < students.length; i++) {
			if (students[i].getFrn().equalsIgnoreCase(frn)) {
				return students[i];
			}
		}

		return null;
	}

	public boolean deleteStudentByFrn(String frn) {
		// TODO Auto-generated method stub
		for (int i = 0; i < students.length; i++) {
			if (students[i].getFrn().equals(frn)) {
				for (int j = i; j < students.length; j++) {
					students[j] = students[j + 1];
				}
				students[--index] = null;
				return true;
			}

		}
		return false;
	}

	public static Student getStudentByEmail(String email) {
		// TODO Auto-generated method stub
		for (int i = 0; i < students.length; i++) {
			if (students[i].getEmail().equalsIgnoreCase(email)) {
				return students[i];
			}
		}
		return null;
	}

	public static Student[] getStudentByDOB(String dob) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate dob1 = LocalDate.parse(dob, formatter);

		Student temp[] = new Student[index];
		int k = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].dob.isEqual(dob1))
				k++;
		}

		Student temp2[] = new Student[k];
		for (int i = 0; i < k; i++)
			temp2[i] = temp[i];
		return temp2;
	}

	public static Student getStudentByMobno(long mobno) {
		// TODO Auto-generated method stub
		for (int i = 0; i < students.length; i++) {
			if (students[i].getMobNo() == mobno) {
				return students[i];
			}
		}
		return null;
	}

}
