package bubbleSort;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[7];

		System.out.println("Enter elements : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		bubbleSort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.println("" + a[i]);
		}
	}

	static void bubbleSort(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {

				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}
	}

}
