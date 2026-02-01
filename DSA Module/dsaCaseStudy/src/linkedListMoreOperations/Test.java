package linkedListMoreOperations;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();

		int choice, ele;

		do {
			System.out.println("\n====================================");
			System.out.println("        LINKED LIST OPERATIONS       ");
			System.out.println("====================================");
			System.out.println(" 1. Insert Element");
			System.out.println(" 2. Display List");
			System.out.println(" 3. Display Prime Numbers");
			System.out.println(" 4. Sort in Ascending Order");
			System.out.println(" 5. Sort in Descending Order");
			System.out.println(" 6. Insert Element (Sorted Order)");
			System.out.println(" 7. Maintain Sorted Order");
			System.out.println(" 0. Exit");
			System.out.println("====================================");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter element: ");
				ele = sc.nextInt();
				list.insert(ele);
				break;
			case 2:
				System.out.println("Linked List Elements:");
				list.display();
				break;
			case 3:
				list.isPrimeList();
				break;
			case 4:
				list.ascendingOrder();
				break;
			case 5:
				list.descendingOrder();
				break;

			case 6:
				System.out.println("Enter Element :");
				ele = sc.nextInt();
				list.insertSorted(ele);
				break;
			case 7:
				list.ascendingOrder();
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
