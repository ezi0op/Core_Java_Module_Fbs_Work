package p1;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[7];

		System.out.println("Enter elements : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		System.out.println("Enter number to search : ");
		int x = sc.nextInt();

		int f = Search(a, x);
		if (f >0) {
			System.out.println("Count : " + f);
		} else {
			System.out.println("No fund");
		}

	}

	private static int Search(int[] a, int x) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] == x) {
				count++;
			}
		}
		return count;
	}
}
