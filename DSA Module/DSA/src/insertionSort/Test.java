package insertionSort;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[7];

		System.out.println("Enter elements : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Before insertion Sort : ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(" " + a[i]);
		}

		insertionSort(a);
		System.out.println("After insertion Sort : ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(" " + a[i]);
		}
	}

	public static void insertionSort(int[] a) {
		int shifting = 0;
		int rep = 0;
		for (int i = 1; i < a.length; i++) {
			int x = a[i];
			int j = i - 1;
			while (j >= 0) {
				if (a[j] > x) {
					a[j + 1] = a[j];
					j--;
					shifting++;

				} else {
					break;
				}
			}
			a[j + 1] = x;
			rep++;
		}
		System.out.println("Shifting count: " + shifting);
		System.out.println("Replace : " + rep);
	}

}
