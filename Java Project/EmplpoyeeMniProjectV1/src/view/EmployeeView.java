package view;

import java.util.Scanner;

import controller.EmployeeController;
import model.Admin;
import model.Employee;
import model.Hr;
import model.SalesManager;

public class EmployeeView {
	EmployeeController ec;
	Scanner sc = new Scanner(System.in);

	public EmployeeView(EmployeeController ec) {
		this.ec = ec;
	}


	public void showOptions() {

		int choice = 0;

		do {
			System.out.println("1. Add an Employee");
			System.out.println("2. Search an Employee");
			System.out.println("3. Update an Employee");
			System.out.println("4. Delete an Employee");
			System.out.println("5. Display all Employee");
			System.out.println("0. Exit");
			System.out.println("Enter your choice: ");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
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
					System.out.println("SalaesManager added SuccessFully!");
				} else {
					System.out.println("Invalid Type! ");

				}
				break;
			case 2:
				System.out.println("Enter ID to search: ");
				id = sc.nextInt();
				Employee e = ec.searchEmployeeByID(id);
				if (e != null) {
					System.out.println("Found: " + e);
				} else {
					System.out.println("Employee not Found.");
				}
				break;
			case 3:
				System.out.println("Enter ID to Update: ");
				id = sc.nextInt();
				System.out.println("Enter New Salary: ");
				salary = sc.nextDouble();
				if (ec.updateEmployee(id, salary)) {
					System.out.println("Updated SuccessFully!");
				} else {
					System.out.println("Employee not found.");
				}
				break;
			case 4:
				System.out.println("Enter ID to delete");
				id = sc.nextInt();
				if (ec.deleteEmployee(id)) {
					System.out.println("Deleted Successfully!");
				} else {
					System.out.println("Employee not found.");
				}
				break;
			case 5:
				ec.displayAll();
				break;

			}

		} while (choice != 0);
		System.out.println("Program Exited!");
	}

}
