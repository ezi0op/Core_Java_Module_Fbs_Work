package view;

import controller.StudentManagementController;
import model.MockStatus;
import model.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StudentManagementView {

	public static void main(String[] args) {

		StudentManagementController smc = new StudentManagementController();
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		while (true) {

			System.out.println("\n===== STUDENT MANAGEMENT MENU =====");
			System.out.println("1. Add Student");
			System.out.println("2. Display");
			System.out.println("3. Search Student");
			System.out.println("4. Update Student");
			System.out.println("5. Delete Student By FRN");
			System.out.println("6. Sort Students");
			System.out.println("7. Mock Details");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:
				System.out.print("Enter FRN: ");
				String frn = sc.nextLine();
				System.out.print("Enter Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Email: ");
				String email = sc.nextLine();
				System.out.print("Enter Mobile No: ");
				long mob = sc.nextLong();
				sc.nextLine();
				System.out.print("Enter GitHub Repo: ");
				String github = sc.nextLine();
				System.out.print("Enter DOB (yyyy-MM-dd): ");
				LocalDate dob = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());

				Student s = new Student(frn, email, mob, name, github, dob);
				smc.addStudent(s);
				break;

			case 2:
				System.out.println("\n--- DISPLAY MENU ---");
				System.out.println("1. Display All Students");
				System.out.println("2. Display All Mock Details");
				System.out.print("Enter choice: ");

				int displayChoice = sc.nextInt();
				sc.nextLine();

				if (displayChoice == 1) {
					smc.getAllStudents();
				} else if (displayChoice == 2) {
					smc.getAllMockDetails();
				} else {
					System.out.println("Invalid choice");
				}
				break;

			case 3:
				System.out.println("\n--- SEARCH MENU ---");
				System.out.println("1. By Email");
				System.out.println("2. By FRN");
				System.out.println("3. By Name");
				System.out.println("4. By DOB");
				System.out.print("Enter choice: ");

				int searchChoice = sc.nextInt();
				sc.nextLine();

				switch (searchChoice) {
				case 1:
					System.out.print("Enter Email: ");
					smc.getStudentByEmail(sc.nextLine());
					break;
				case 2:
					System.out.print("Enter FRN: ");
					smc.getStudentByFrn(sc.nextLine());
					break;
				case 3:
					System.out.print("Enter Name: ");
					smc.getStudentByName(sc.nextLine());
					break;
				case 4:
					System.out.print("Enter DOB (yyyy-MM-dd): ");
					LocalDate dob1 = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
					smc.getStudentByDob(dob1);
					break;
				default:
					System.out.println("Invalid choice");
				}
				break;

			case 4:
				System.out.println("\n--- UPDATE MENU ---");
				System.out.println("1. Update Email");
				System.out.println("2. Update Mobile");
				System.out.print("Enter choice: ");

				int updateChoice = sc.nextInt();
				sc.nextLine();

				if (updateChoice == 1) {
					System.out.print("Enter FRN: ");
					String frnEmail = sc.nextLine();
					System.out.print("Enter New Email: ");
					String newEmail = sc.nextLine();
					smc.updateStudentEmail(frnEmail, newEmail);
				} else if (updateChoice == 2) {
					System.out.print("Enter FRN: ");
					String frnMob = sc.nextLine();
					System.out.print("Enter New Mobile: ");
					String newMob = sc.nextLine();
					smc.updateStudentMobno(frnMob, newMob);
				} else {
					System.out.println("Invalid choice");
				}
				break;

			case 5:
				System.out.print("Enter FRN: ");
				smc.deleteStudentByFrn(sc.nextLine());
				break;

			case 6:
				System.out.println("\n--- SORT MENU ---");
				System.out.println("1. Sort by FRN");
				System.out.println("2. Sort by Name");
				System.out.print("Enter choice: ");

				int sortChoice = sc.nextInt();
				sc.nextLine();

				if (sortChoice == 1) {
					smc.sortStudentsByFrn();
				} else if (sortChoice == 2) {
					smc.sortStudentsByName();
				} else {
					System.out.println("Invalid choice");
				}
				break;

			case 7:
				System.out.println("\n--- MOCK MENU ---");
				System.out.println("1. Get Mock Details By FRN");
				System.out.println("2. Get Cleared Mock Students");
				System.out.println("3. Get Uncleared Mock Students");
				System.out.println("4. Add Mock Details");
				System.out.println("5. Update Mock Status");
				System.out.println("6. Delete Mock Details By FRN");
				System.out.print("Enter choice: ");

				int mockChoice = sc.nextInt();
				sc.nextLine();

				switch (mockChoice) {
				case 1:
					System.out.print("Enter FRN: ");
					smc.getMockDetailsByFRN(sc.nextLine());
					break;
				case 2:
					smc.getClearedMockStudents();
					break;
				case 3:
					smc.getUnclearedMockStudents();
					break;
				case 4:
					System.out.print("Enter FRN: ");
					String mFrn = sc.nextLine();

					if (!smc.isValidStudent(mFrn)) {
						System.out.println("Student does not exist for FRN: " + mFrn);
						break;
					}
					System.out.println("Select Module:");
					System.out.println("1. Core C");
					System.out.println("2. Advanced Java");
					System.out.println("3. SQL");
					System.out.println("4. Web Programming");

					int moduleChoice = sc.nextInt();
					sc.nextLine();

					String Module = null;

					if (moduleChoice == 1) {
						Module = "Core C";
					} else if (moduleChoice == 2) {
						Module = "Advanced Java";
					} else if (moduleChoice == 3) {
						Module = "SQL";
					} else if (moduleChoice == 4) {
						Module = "Web Programming";
					} else {
						System.out.println("Invalid module selection");
						break;
					}

					System.out.println("Enter Status");
					System.out.println("1. CLEAR");
					System.out.println("2. NOT_CLEAR");
					System.out.println("3. ABSENT");
					int statusChoice = sc.nextInt();
					sc.nextLine();

					MockStatus status = null;

					if (statusChoice == 1) {
						status = MockStatus.CLEAR;
					} else if (statusChoice == 2) {
						status = MockStatus.NOT_CLEAR;
					} else if (statusChoice == 3) {
						status = MockStatus.ABSENT;
					} else {
						System.out.println("Invalid status choice");
						break;
					}

					System.out.print("Enter Date (yyyy-MM-dd) or press Enter for NULL: ");
					String dateInput = sc.nextLine();

					LocalDate mDate = null;
					if (!dateInput.isEmpty()) {
						mDate = LocalDate.parse(dateInput, formatter);
					}

					smc.addMockDetails(mFrn, Module, status, mDate);
					break;
				case 5:
					System.out.print("Enter FRN: ");
					String uFrn = sc.nextLine();

					if (!smc.isValidStudent(uFrn)) {
						System.out.println("Student does not exist for FRN: " + uFrn);
						break;
					}

					System.out.println("Select Module:");
					System.out.println("1. Core C");
					System.out.println("2. Advanced Java");
					System.out.println("3. SQL");
					System.out.println("4. Web Programming");

					int moduleChoice1 = sc.nextInt();
					sc.nextLine();

					String uModule = null;

					if (moduleChoice1 == 1) {
						uModule = "Core C";
					} else if (moduleChoice1 == 2) {
						uModule = "Advanced Java";
					} else if (moduleChoice1 == 3) {
						uModule = "SQL";
					} else if (moduleChoice1 == 4) {
						uModule = "Web Programming";
					} else {
						System.out.println("Invalid module selection");
						break;
					}

					System.out.println("Enter Status");
					System.out.println("1. CLEAR");
					System.out.println("2. NOT_CLEAR");
					System.out.println("3. ABSENT");

					int statusChoice1 = sc.nextInt();
					sc.nextLine();

					MockStatus uStatus = null;

					if (statusChoice1 == 1) {
						uStatus = MockStatus.CLEAR;
					} else if (statusChoice1 == 2) {
						uStatus = MockStatus.NOT_CLEAR;
					} else if (statusChoice1 == 3) {
						uStatus = MockStatus.ABSENT;
					} else {
						System.out.println("Invalid status choice");
						break;
					}

					smc.updateMockStatus(uFrn, uModule, uStatus);
					break;
				case 6:
					System.out.print("Enter FRN: ");
					smc.deleteMockDetails(sc.nextLine());
					break;
				default:
					System.out.println("Invalid choice");
				}
				break;

			case 0:
				System.out.println("Exiting...");
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
