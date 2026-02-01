package quickSort;

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
		int end = a.length-1;
		quickSort(a, start, end);
		
		System.out.println(Arrays.toString(a));
	}

	private static void quickSort(int[] a, int start, int end) {
		// TODO Auto-generated method stub
	
		if(start<end) {
			int d = dividingPoint(a,start,end);
			quickSort(a,start,d-1);
			quickSort(a,d+1,end);
		}
	}

	private static int dividingPoint(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		int pivot=a[start];
		int i=start+1;
		int j=end;
		while(i<j) {
			while(i<end&&a[i]<pivot) {
				i++;
			}
			while(j>start&&a[j]>pivot) {
				j--;
			}
			if(i<j) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		a[start]=a[j];
		a[j]=pivot;
		return j;
	}

}
