package p3;


import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[7];

		System.out.println("Enter elements : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int n = a.length;
		int max = a[n - 1];

		
		for (int i = n-2; i >=0; i++) {
			if (a[i] > max) {
				max = a[i];
				System.out.println("Max : "+ max);

			}
		}

	
	}
}
