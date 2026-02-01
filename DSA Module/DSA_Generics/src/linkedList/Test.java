package linkedList;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedList<Employee> list = new LinkedList<>();

		int choice, ele, pos;

		do {
			System.out.println("\n--- Linked List  Menu ---");
			System.out.println("1. Insert");
			System.out.println("2. Insert at Beginning");
			System.out.println("3. Display");
			System.out.println("4. Check Empty");
			System.out.println("5. Insert at Position");
			System.out.println("6. Delete at Position");
			System.out.println("7. Remove First Element");
			System.out.println("8. Remove Last Element");
			System.out.println("9. Get Size");
			System.out.println("10. Reverse Display");
			System.out.println("11. Bubble Sort");
			System.out.println("12. Insert in Sorted Order");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Name: ");
				String name = sc.nextLine();
				System.out.println("Enter Base Salary: ");
				double salary = sc.nextDouble();

				Employee emp = new Employee(id, name, salary);
				list.insert(emp);
				break;

			case 2:
				System.out.println("Enter ID: ");
				int id1 = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Name: ");
				String name1 = sc.nextLine();
				System.out.println("Enter Base Salary: ");
				double salary1 = sc.nextDouble();

				Employee emp1 = new Employee(id1, name1, salary1);
				list.insertBeg(emp1);
				break;

			case 3:
				System.out.println("Linked List Elements:");
				list.display();
				break;

			case 4:
				if (list.isEmpty()) {
					System.out.println("Linked List is Empty");
				} else {
					System.out.println("Linked List is NOT Empty");
				}
				break;

			case 5:

				System.out.println("Enter ID: ");
				int id2 = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Name: ");
				String name2 = sc.nextLine();
				System.out.println("Enter Base Salary: ");
				double sal2 = sc.nextDouble();

				Employee emp3 = new Employee(id2, name2, sal2);
				System.out.println("Enter Positon : ");
				pos = sc.nextInt();
				list.insertPos(emp3, pos);
				break;
			case 6:
				System.out.println("Enter postion to delete");
				pos = sc.nextInt();
				list.deletePos(pos);
				break;
			case 7:
				list.removeFirst();
				break;
			case 8:
				list.removeEnd();
				break;
			case 9:
				int a = list.getCount();
				System.out.println("Actual Count Element is :" + a);
				break;
			case 10:
				list.reverseDisplay();
				break;
			case 11:
				list.bubbleSort();
				break;

			case 12:
				System.out.println("Enter ID: ");
				int id3 = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Name: ");
				String name3 = sc.nextLine();
				System.out.println("Enter Base Salary: ");
				double sal3 = sc.nextDouble();

				Employee emp4 = new Employee(id3, name3, sal3);
				list.insertSorted(emp4);
				break;

			case 0:
				System.out.println("Program Ended");
				break;

			default:
				System.out.println("Invalid Choice");
			}

		} while (choice != 0);

		sc.close();
	}
}
