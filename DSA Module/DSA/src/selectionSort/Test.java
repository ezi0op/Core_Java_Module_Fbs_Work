package selectionSort;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[7];

		System.out.println("Enter elements : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		selectionSort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.println(" " + a[i]);
		}
	}

	static void selectionSort(int[] a) {

		
		for (int i = 0; i < a.length - 1; i++) {
			int min=a[i];
			int min_index=i;
			for (int j = i+1; j < a.length; j++) {

				if (min < a[j]) {
					min= a[j];
					min_index=j;
					
				}
				
			}
			a[min_index] = a[i];
			a[i] = min;
		
		}
	

	}
}
