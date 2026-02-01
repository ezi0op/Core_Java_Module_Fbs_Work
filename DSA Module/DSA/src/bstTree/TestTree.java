package bstTree;

import java.util.Scanner;

public class TestTree {
    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n----- BST MENU -----");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Traversal");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to insert: ");
                    bst.insertData(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter value to delete: ");
                    bst.deleteNode(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter value to search: ");
                    int key = sc.nextInt();
                    System.out.println(
                        bst.search(key) ? "Value Found" : "Value Not Found"
                    );
                    break;

                case 4:
                    System.out.println("1. Inorder");
                    System.out.println("2. Preorder");
                    System.out.println("3. Postorder");
                    System.out.print("Enter traversal choice: ");
                    bst.display(sc.nextInt());
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
