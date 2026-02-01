package hospitalAppoinmentSystemQueue;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue q = new Queue(100);
		int choice;
		String patient;

		do {
			System.out.println("\n--- Queue Menu ---");
			System.out.println("1. Add patient(EnQueue)");
			System.out.println("2. Call Next Patient(DeQueue)");
			System.out.println("3. Display Waiting List");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter value: ");
				patient = sc.nextLine();
				q.enQueue(patient);
				break;

			case 2:
				String removed = q.deQueue();
				System.out.println("Dequeued: " + removed);
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
