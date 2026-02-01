package graph;

import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Graph g = new Graph();

		int choice;

		do {
			System.out.println("\n====== GRAPH MENU ======");
			System.out.println("1. Add Edge");
			System.out.println("2. Display Graph");
			System.out.println("3. DFS Traversal");
			System.out.println("4. BFS Traversal");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter first vertex: ");
				int v1 = sc.nextInt();
				System.out.print("Enter second vertex: ");
				int v2 = sc.nextInt();
				g.addEdge(v1, v2);
				System.out.println("Edge added successfully.");
				break;

			case 2:
				System.out.println("Graph edges:");
				g.display();
				break;

			case 3:
				System.out.print("Enter starting vertex for DFS: ");
				int dfsStart = sc.nextInt();
				System.out.println("DFS Traversal:");
				g.dfs(dfsStart);
				break;

			case 4:
				System.out.print("Enter starting vertex for BFS: ");
				int bfsStart = sc.nextInt();
				System.out.println("BFS Traversal:");
				g.bfs(bfsStart);
				break;

			case 0:
				System.out.println("Exiting program...");
				break;

			default:
				System.out.println("Invalid choice! Try again.");
			}

		} while (choice != 0);

		sc.close();
	}
}
