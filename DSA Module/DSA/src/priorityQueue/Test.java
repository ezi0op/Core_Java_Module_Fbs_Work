package priorityQueue;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue q = new PriorityQueue(5);
		int choice, value;

		do {
			System.out.println("\n--- Queue Menu ---");
			System.out.println("1. EnQueue");
			System.out.println("2. DeQueue");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter value: ");
				value = sc.nextInt();
				sc.nextLine();
				q.enQueue(value);
				break;

			case 2:
				int removed = q.deQueue();
				if (removed != -1) {
					System.out.println("Dequeued: " + removed);
				}
				break;

			case 3:
				q.display();
				break;

			case 4:
				System.out.println("Exit");
				break;

			default:
				System.out.println("Invalid choice");
			}

		} while (choice != 4);

	}
}
