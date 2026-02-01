package p1;

public class T3 {

	public static void main(String[] args) {

		int[] a = { 2, 0, 5, 0, 6, 0 };
		int j = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] != 0) {
				a[j++] = a[i];
				System.out.println("INsde for" + j);
			}
			System.out.println("INsde pass" + j);
		}
		while (j < a.length) {
			System.out.println(j);
			a[j] = 0;
			System.out.println("befire inc" + j);
			j++;
			System.out.println("after inc" + j);
		}

		for (int x : a) {
			System.out.println(x + " ");
		}
	}
}
