package mergeSort;

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

		int start = 0;
		int end = a.length - 1;
		mergeSort(a, start, end);
		
		System.out.println(Arrays.toString(a));
	}

	private static void mergeSort(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		if (start != end) {
			int mid = (start+end) / 2;
			mergeSort(a, start, mid);
			mergeSort(a, mid + 1, end);
			combine(a, start, mid, end);
		}
	}

	private static void combine(int[] a, int start, int mid, int end) {
		// TODO Auto-generated method stub
		int i = start, j = mid + 1, k = 0;
		int[] na = new int[end - start + 1];
		while (i <= mid && j <= end) {
			if (a[i] < a[j]) {
				na[k] = a[i];
				k++;
				i++;
			} else {
				na[k] = a[j];
				j++;
				k++;
			}
		}
		while (i <= mid) {
			na[k] = a[i];
			k++;
			i++;
		}
		while (j <= end) {
			na[k] = a[j];
			j++;
			k++;
		}
		int y = start;
		for (int l = 0; l < na.length; l++) {
			a[y] = na[l];
			y++;

		}
	}
}
