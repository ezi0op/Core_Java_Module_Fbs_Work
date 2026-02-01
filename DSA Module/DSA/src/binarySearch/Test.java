package binarySearch;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		
		System.out.println("Enter elements : ");
		for (int i = 0; i < a.length; i++) {
		 a[i]=sc.nextInt();
		}
		
		System.out.println("Enter number to search : ");
		int x = sc.nextInt();

		int ans = binarySearch(a, x);
		if(ans==-1) {
			System.out.println("Not found");
		}else {
			System.out.println("Found");
		}
	}

	static int binarySearch(int[] a, int x) {
		int start = 0;
		int end = a.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (a[mid] == x) {
				return mid;

			}
			if (a[mid] > x) {
				end = mid - 1;
			}
			if (a[mid] < x) {
				start = mid + 1;
			}
			
		}
		return -1;
	}
}
