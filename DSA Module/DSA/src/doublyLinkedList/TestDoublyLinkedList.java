package doublyLinkedList;

import java.util.Scanner;

public class TestDoublyLinkedList {

    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);

        int ch, sub;

        do {
            System.out.println("\n=== Doubly Linked List Menu ===");
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
                    System.out.println("1. Insert at Beginning");
                    System.out.println("2. Insert at Position");
                    System.out.println("3. Insert at End");
                    System.out.print("Choice: ");
                    sub = sc.nextInt();

                    System.out.print("Enter element: ");
                    int ele = sc.nextInt();

                    switch (sub) {
                        case 1:
                            System.out.println("Inserting " + ele + " at BEGINNING");
                            dll.insertAtBeg(ele);
                            break;
                        case 2:
                            System.out.print("Enter position: ");
                            int pos = sc.nextInt();
                            System.out.println("Inserting " + ele + " at POSITION " + pos);
                            dll.insert(ele, pos);
                            break;
                        case 3:
                            System.out.println("Inserting " + ele + " at END");
                            dll.insertAtEnd(ele);
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
                    if (dll.getCount() == 0) {
                        System.out.println("List is empty!");
                        break;
                    }
                    System.out.println("\n--- Display Submenu ---");
                    System.out.println("1. Display Forward");
                    System.out.println("2. Display Backward");
                    System.out.print("Choice: ");
                    sub = sc.nextInt();

                    switch (sub) {
                        case 1:
                            System.out.println("Displaying list FORWARD:");
                            dll.displayForward();
                            break;
                        case 2:
                            System.out.println("Displaying list BACKWARD:");
                            dll.displayBackward();
                            break;
                        default:
                            System.out.println("Invalid display choice");
                    }
                    break;

                case 4: // COUNT
                    System.out.println("Total nodes = " + dll.getCount());
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