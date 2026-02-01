package view;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import controller.EmployeeController;
import controller.EmployeeDAO;
import model.Admin;
import model.Employee;
import model.Hr;
import model.SalesManager;

public class EmployeeView {
	EmployeeController ec;
	Scanner sc = new Scanner(System.in);
	EmployeeDAO ed;

	public EmployeeView(EmployeeController ec) {
		this.ec = ec;
		this.ed = ec.getDAO();
	}

	public void showOptions() throws InputMismatchException {

		int choice = 0;

		do {
			try {
				System.out.println("1. Add an Employee");
				System.out.println("2. Search an Employee");
				System.out.println("3. Update an Employee");
				System.out.println("4. Delete an Employee");
				System.out.println("5. Display all Employee");
				System.out.println("6.Sort Employee");
				System.out.println("7 Save employee");
				System.out.println("8. DISPLAY");
				System.out.println("0. Exit");
				System.out.println("Enter your choice: ");

				choice = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please enter a number.");
				sc.nextLine();   
			    continue;  
			}
			switch (choice) {
			case 1:
				try {
					System.out.println("Enter Employee Type(1-HR, 2-Admin,3-SalesManager)");
					int type = sc.nextInt();

					System.out.println("Enter ID: ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Name: ");
					String name = sc.nextLine();
					System.out.println("Enter Base Salary: ");
					double salary = sc.nextDouble();

					if (type == 1) {

						System.out.println("Enter Commission: ");
						double comm = sc.nextDouble();
						ec.addEmployee(new Hr(id, name, salary, comm));
						System.out.println("HR  added SuccessFully!");

					} else if (type == 2) {

						System.out.println("Enter Allowance: ");
						double allowance = sc.nextDouble();
						ec.addEmployee(new Admin(id, name, salary, allowance));
						System.out.println("Admin  added SuccessFully!");

					} else if (type == 3) {

						System.out.println("Enter Incentive per Target: ");
						double incentive = sc.nextDouble();
						System.out.println("Enter Target: ");
						int target = sc.nextInt();

						ec.addEmployee(new SalesManager(id, name, salary, incentive, target));
						System.out.println("SalesManager added SuccessFully!");

					} else {

						System.out.println("Invalid Employee Type! ");

					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid date type  entered! Try again.");
					sc.nextLine();
				}
				break;
			case 2:
				try {
					System.out.println("Enter ID to search: ");
					int id = sc.nextInt();
					Employee e = ec.searchEmployeeByID(id);
					if (e != null) {
						System.out.println("Found: " + e);
					} else {
						System.out.println("Employee not Found.");
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid ID input!");
					sc.nextLine();
				}

				break;
			case 3:
				try {
					System.out.println("Enter ID to Update: ");
					int id = sc.nextInt();
					System.out.println("Enter New Salary: ");
					Double salary = sc.nextDouble();
					if (ec.updateEmployee(id, salary)) {
						System.out.println("Updated SuccessFully!");
					} else {
						System.out.println("Employee not found.");
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid ID input!");
					sc.nextLine();
				}

				break;
			case 4:
				try {
					System.out.println("Enter ID to delete");
					int id = sc.nextInt();
					if (ec.deleteEmployee(id)) {
						System.out.println("Deleted Successfully!");
					} else {
						System.out.println("Employee not found.");
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid ID input!");
					sc.nextLine();
				}

				break;
			case 5:
				ec.displayAll();
				break;
			case 6:
				try {
					System.out.println("1.Sort by Id");
					System.out.println("2.Sort by Name");
					System.out.println("3.Sort by Salary");
					System.out.println("0.Exit");
					int Schoice = sc.nextInt();
					switch (Schoice) {
					case 1:
						myIdComparator mid = new myIdComparator();
						Collections.sort(ed.l, mid);
						System.out.println(ed.l);
						break;
					case 2:
						myNameComparator mnc = new myNameComparator();
						Collections.sort(ed.l, mnc);
						System.out.println(ed.l);
						break;
					case 3:
						mySalaryComparator msc = new mySalaryComparator();
						Collections.sort(ed.l, msc);
						System.out.println(ed.l);
						break;
					default:
						System.out.println("Invalid Sorting option!");
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid Sorting Input!");
					sc.nextLine();
				}
				break;

			case 7:
				ed.saveEmployee();
				break;
			case 8:
				ed.displayEmployee();
				break;
			case 0:
				System.out.println("Program Exited!");
				break;
			default:
				System.out.println("Invalid menu choice!");

			}

		} while (choice != 0);

	}

}
