package linkedList;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();

		int choice, ele, pos;

		do {
			System.out.println("\n--- Linked List Menu ---");
			System.out.println("1. Insert");
			System.out.println("2. Insert at Beginning");
			System.out.println("3. Display");
			System.out.println("4. Check Empty");
			System.out.println("5.Enter Position and ele to insert");
			System.out.println("6. Enter Position to delete ");
			System.out.println("7. Remove First Element");
			System.out.println("8. Remove Last Element");
			System.out.println("9.Get Size");
			System.out.println("10. Reverse Display");
			System.out.println("11.Display Prime Number List");
			System.out.println("12.Display Bubble Sort List");
			System.out.println("13.Insert in Sorted Order");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter element: ");
				ele = sc.nextInt();
				list.insert(ele);
				break;

			case 2:
				System.out.print("Enter element: ");
				ele = sc.nextInt();
				list.insertBeg(ele);
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
				System.out.println("Enter Positon : ");
				pos = sc.nextInt();
				System.out.println("Enter ele to insert");

				ele = sc.nextInt();
				list.insertPos(ele, pos);
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
				list.isPrimeList();
				break;

			case 12:
				list.bubbleSort();
				break;

			case 13:
				System.out.println("Enter Element to Sort :");
				ele = sc.nextInt();
				list.insertSorted(ele);

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
