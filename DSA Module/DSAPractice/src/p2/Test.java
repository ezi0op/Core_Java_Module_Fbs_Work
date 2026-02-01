package p2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[7];

		int target = 6;
		System.out.println("Enter elements : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		sum(a, target);
	}

	public static void sum(int[] a, int target) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[i] + a[j] == target) {
					System.out.println(" " + a[i] + " " + a[j]);
				}
			}

		}
	}
}
