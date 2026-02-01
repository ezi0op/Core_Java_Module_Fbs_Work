package view;

import model.*;

import java.time.LocalDate;
import java.util.*;

import controller.StudentManagementController;

public class StudentManagementView {

	public static void main(String[] args) {
		StudentManagementController smc = new StudentManagementController();
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Student> students = null;
			Student student = null;
			while (true) {

				System.out.println("1.To add a Student");
				System.out.println("2.To DisplayAll Student");
				System.out.println("3.Update Student");
				System.out.println("4.Delete Student");
				System.out.println("5.Search Student");
				System.out.println("6.Sort Student");
				System.out.println("7.Wish Birthday Today");
				System.out.println("8. update mock details");
				System.out.println("9.Get Mock Result by FRN");
				System.out.println("10.exit");
				System.out.println("11. Mock cleared students");

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
					System.out.println("Student added and saved successfully!");
					break;
				case 2:

					students = smc.getAllStudents();
					System.out.printf("%-8s %-25s %-12s %-20s %-30s %-12s%n", "FRN", "EMAIL", "MOBILE", "NAME", "GIT REPO",
							"DOB");
					System.out.println(
							"-----------------------------------------------------------------------------------------------");
					for (Student s1 : students) {
						System.out.printf("%-8s %-25s %-12d %-20s %-30s %-12s%n", s1.getFrn(), s1.getEmail(), s1.getMobNo(),
								s1.getName(), s1.getGithubRepo(), s1.getDob() // LocalDate prints as yyyy-MM-dd by default
						);
					}
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
						smc.updateStudent(st);
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
						student = smc.getStudentByFrn(frn1);
						if (student != null)
							System.out.println(student.getName() + " found ");
						else
							System.out.println("Not found");
						break;

					case 2:
						System.out.println("Enter emial");
						String email1 = sc.next();
						student = smc.getStudentByEmail(email1);
						if (student != null)
							System.out.println(student.getEmail() + " found ");
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
						students = smc.getStudentsByDob(dob);
						for (Student s1 : students) {
							String message = "Happy birthday " + s1.getName();
							SmsOperations.sendSms(message, s1.getMobNo());
						}

						break;

					default:
						break;

					}
				}
					break;
				case 6:
					System.out.println("Enter 1 to sort by frn\n2 to sort by name");
					ArrayList<Student> std = smc.getAllStudents();
					switch (sc.nextInt()) {
					case 1:
						Collections.sort(std, new FRNCompartor());
						break;
					case 2:
						Collections.sort(std, new NameCompartor());
					}

					break;
				case 7:
					smc.sendTodaysBdayWish();
					break;

				case 8:
					System.out.println("Enter frn");
					frn = sc.next();
					student = smc.getStudentByFrn(frn);
					if (student != null) {
						System.out.println("Enter module \n 1 for C \n 2 for java");
						int choice = sc.nextInt();
						ArrayList<MockDetail> mockdetails = smc.getMockDetailsByFRN(frn);
						if (choice == 1) {
							if (mockdetails.isEmpty()) {
								System.out.println("Enter 1 if clear 2 if not clear");
								int mockstatuschoice = sc.nextInt();
								if (mockstatuschoice == 1)
									mockdetails.add(new MockDetail("C", MockStatus.CLEAR, LocalDate.now()));
								else
									mockdetails.add(new MockDetail("C", MockStatus.NOT_CLEAR, LocalDate.now()));
							} else {
								System.out.println("in else");
								for (MockDetail md : mockdetails) {
									if (md.getModuleName().equals("C")) {
										if (md.getMockStatus() == MockStatus.CLEAR) {
											System.out.println("Mock already cleared");
										} else {
											md.setMockdate(LocalDate.now());
											System.out.println("Enter 1 if clear 2 if not clear");
											int mockstatuschoice = sc.nextInt();
											if (mockstatuschoice == 1)
												md.setResult(MockStatus.CLEAR);
											else
												md.setResult(MockStatus.NOT_CLEAR);
										}
										break;
									}
								}
							}
						} else if (choice == 2) {
							if (mockdetails == null) {
								System.out.println("Enter 1 if clear 2 if not clear");
								int mockstatuschoice = sc.nextInt();
								if (mockstatuschoice == 1)
									mockdetails.add(new MockDetail("Java", MockStatus.CLEAR, LocalDate.now()));
								else
									mockdetails.add(new MockDetail("Java", MockStatus.NOT_CLEAR, LocalDate.now()));
							} else {
								for (MockDetail md : mockdetails) {
									if (md.getModuleName().equals("Java")) {
										if (md.getMockStatus() == MockStatus.CLEAR) {
											System.out.println("Mock already cleared");
										} else {
											md.setMockdate(LocalDate.now());
											System.out.println("Enter 1 if clear 2 if not clear");
											int mockstatuschoice = sc.nextInt();
											if (mockstatuschoice == 1)
												md.setResult(MockStatus.CLEAR);
											else
												md.setResult(MockStatus.NOT_CLEAR);
										}
										break;
									}
								}
							}
						}
					}
					break;
				case 9:
					System.out.println("Enter frn");
					frn = sc.next();
					ArrayList<MockDetail> result = smc.getMockDetailsByFRN(frn);
					if (result != null) {
						System.out.println("mock details recevied");
						System.out.println(result);
					} else {
						System.out.println("Not found");
					}
					break;

				case 10:
					smc.saveStudents(students);
					System.out.println("Exiting...");
				case 11:
					students = smc.getAllStudents();
					System.out.println(students);
					for (Student s1 : students) {
						System.out.println(s1);
						ArrayList<MockDetail> mockdetails = s1.getMockdetails();
						System.out.println(mockdetails);
						for (MockDetail md : mockdetails) {
							md.getModuleName().equals("C");
							System.out.println(s1.getFrn() + " " + s1.getName());
							break;
						}
					}
					break;
				case 12:
					System.out.println("Exiting...");
					System.exit(0);

				}
			}
		}
	}
}
