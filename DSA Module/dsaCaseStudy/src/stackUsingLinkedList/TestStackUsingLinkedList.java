package stackUsingLinkedList;

import java.util.Scanner;

public class TestStackUsingLinkedList {

	public static void main(String[] args) {

		StackUsingLinkedList stack = new StackUsingLinkedList();
		Scanner sc = new Scanner(System.in);

		int ch, ele;

		do {
			System.out.println("\n---- STACK USING LINKED LIST ----");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Is Empty");
			System.out.println("5. Count");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");

			ch = sc.nextInt();

			switch (ch) {

			case 1:
				System.out.print("Enter element to push: ");
				ele = sc.nextInt();
				stack.push(ele);
				System.out.println("Element pushed");
				break;

			case 2:
				stack.pop();
				System.out.println("Element popped");
				break;

			case 3:
				stack.peek();
				break;

			case 4:
				if (stack.isEmpty())
					System.out.println("Stack is Empty");
				else
					System.out.println("Stack is NOT Empty");
				break;

			case 5:
				System.out.println("Total elements: " + stack.count);
				break;

			case 0:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice");
			}

		} while (ch != 0);

		sc.close();
	}
}
