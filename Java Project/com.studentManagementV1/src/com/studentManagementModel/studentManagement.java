package com.studentManagementModel;

import java.time.LocalDate;
import java.util.Scanner;

public class studentManagement {

	public static void main(String[] args) {
		StudentManagementController smc = new StudentManagementController();
		Scanner sc = new Scanner(System.in);
		while (true) {
			

			System.out.println("1.To add a Student");
			System.out.println("2.To DisplayAll Student");
			System.out.println("3.Update Student");
			System.out.println("4.Delete Student");
			System.out.println("5.Search Student");
			System.out.println("6.Sort Student");
			System.out.println("7.Wish Birthday Today");
			System.out.println("8.exit");

			int ch = sc.nextInt();

			switch (ch) {
			case 1:

				System.out.println("Enter FRN :");
				String frn = sc.next();
				System.out.println("Enter email :");
				String email = sc.next();
				System.out.println("Enter mobNo :");
				long mobno = sc.nextLong();
				System.out.println("Enter Name :");
				String Name = sc.next();
				System.out.println("Enter githubRepo :");
				String github = sc.next();
				System.out.println("Enter YEAR-MONTH-DATE :");
				LocalDate DOB = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
				Student s = new Student(frn, email, mobno, Name, github, DOB);
				smc.addStudent(s);
				break;
			case 2:

				smc.displayAllStudent();
				break;
			case 3: {
				System.out.println("Enter FRN to Update :");
				String frn1 = sc.next();
				Student st = smc.getStudentByFrn(frn1);
				if (st != null) {
					System.out.println("Enter 1 to update email");
					System.out.println("Enter 2 to update mobno");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter new Email :");
						String email1 = sc.next();
						st.setEmail(email1);
						System.out.println("Email updated successfully");
						break;
					case 2:
						System.out.println("Enter new mobno");
						long mobno1 = sc.nextLong();
						st.setMobNo(mobno1);
						System.out.println("Mobno updated successfully");
						break;
					default:
						break;
					}
				} else {
					System.out.println("Student not found!");
					break;
				}
			}
				break;
			case 4: {
				System.out.println("Enter FRN to Delete :");
				String frn1 = sc.next();
				boolean del = smc.deleteStudentByFrn(frn1);
				if (del) {
					System.out.println("Deleted Successfully!");
				} else {
					System.out.println("Not Found!");
				}

			}
				break;
			case 5: {
				System.out.println("Enter 1 to search by frn");
				System.out.println("Enter 2 to search by email");
				System.out.println("Enter 3 to search by mobno");
				System.out.println("Enter 4 to search by dob");

				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter frn");
					String frn1 = sc.next();
					Student student = smc.getStudentByFrn(frn1);
					if (student != null)
						System.out.println(student.getName() + " found ");
					else
						System.out.println("Not found");
					break;

				case 2:
					System.out.println("Enter emial");
					String email1 = sc.next();
					Student student1 = smc.getStudentByEmail(email1);
					if (student1 != null)
						System.out.println(student1.getName() + " found ");
					else
						System.out.println("Not found");
					break;

				case 3:
					System.out.println("Enter frn");
					long mobno1 = sc.nextLong();
					Student student2 = smc.getStudentByMobno(mobno1);
					if (student2 != null)
						System.out.println(student2.getName() + " found ");
					else
						System.out.println("Not found");
					break;

				case 4:
					System.out.println("Enter dob(YYYY-MM-DD)");
					String dob = sc.next();
					Student students[] = smc.getStudentByDOB(dob);
					for (int i = 0; i < students.length; i++) {
						System.out.println(students[i]);
					}
					break;
			
				default:
					break;
				}

				break;
			}
			}
		}
	}

}
