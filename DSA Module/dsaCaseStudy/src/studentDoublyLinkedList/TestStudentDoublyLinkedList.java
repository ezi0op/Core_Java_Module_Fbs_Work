package studentDoublyLinkedList;

import java.util.Scanner;

public class TestStudentDoublyLinkedList {

	public static void main(String[] args) {

		DoublyLinkedList dll = new DoublyLinkedList();
		Scanner sc = new Scanner(System.in);

		int ch, sub;

		do {
			System.out.println("\n=== Doubly Student Linked List Menu ===");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Count");
			System.out.println("0. Exit");
			System.out.print("Choice: ");
			ch = sc.nextInt();

			switch (ch) {

			case 1: // INSERT
				System.out.println("\n--- Insert Submenu ---");
				System.out.println("1. Insert Student at Beginning");
				System.out.println("2. Insert Student at Position");
				System.out.println("3. Insert  Student at End");
				System.out.print("Choice: ");
				sub = sc.nextInt();

				switch (sub) {
				case 1:
					System.out.println("Enter ID: ");
					int id1 = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Name: ");
					String name1 = sc.nextLine();
					System.out.println("Enter Age: ");
					int age1 = sc.nextInt();

					Student emp1 = new Student(id1, name1, age1);

					dll.insertAtBeg(emp1);
					break;
				case 2: {

					System.out.println("Enter ID: ");
					int id2 = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Name: ");
					String name2 = sc.nextLine();
					System.out.println("Enter Base Age: ");
					int age2 = sc.nextInt();

					Student emp2 = new Student(id2, name2, age2);

					System.out.print("Enter position: ");
					int pos = sc.nextInt();
					dll.insert(emp2, pos);
				}

					break;
				case 3:
					System.out.println("Enter ID: ");
					int id3 = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Name: ");
					String name3 = sc.nextLine();
					System.out.println("Enter Base Age: ");
					int age3 = sc.nextInt();

					Student emp3 = new Student(id3, name3, age3);
					dll.insertAtEnd(emp3);
					break;
				default:
					System.out.println("Invalid insert choice");
				}
				break;

			case 2: // DELETE
				if (dll.getCount() == 0) {
					System.out.println("List is empty! Nothing to delete.");
					break;
				}
				System.out.println("\n--- Delete Submenu ---");
				System.out.println("1. Delete from Beginning");
				System.out.println("2. Delete from Position");
				System.out.println("3. Delete from End");
				System.out.print("Choice: ");
				sub = sc.nextInt();

				switch (sub) {
				case 1:
					System.out.println("Deleting from BEGINNING");
					dll.deletePos(1);
					break;
				case 2:
					System.out.print("Enter position: ");
					int pos = sc.nextInt();
					System.out.println("Deleting from POSITION " + pos);
					dll.deletePos(pos);
					break;
				case 3:
					System.out.println("Deleting from END");
					dll.deletePos(dll.getCount());
					break;
				default:
					System.out.println("Invalid delete choice");
				}
				break;

			case 3: // DISPLAY
				System.out.println("\n--- Display Submenu ---");
				System.out.println("1. Display Forward");
				System.out.println("2. Display Backward");
				System.out.print("Choice: ");
				sub = sc.nextInt();

				switch (sub) {
				case 1:
					System.out.println("Displaying Student list FORWARD:");
					dll.displayForward();
					break;
				case 2:
					System.out.println("Displaying Student list BACKWARD:");
					dll.displayBackward();
					break;
				default:
					System.out.println("Invalid display choice");
				}
				break;

			case 4: // COUNT
				System.out.println("Total Student : " + dll.getCount());
				break;

			case 0:
				System.out.println("Program Ended. Goodbye!");
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
			}

		} while (ch != 0);

		sc.close();
	}
}