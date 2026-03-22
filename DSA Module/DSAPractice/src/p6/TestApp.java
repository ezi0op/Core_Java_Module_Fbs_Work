package p6;

public class TestApp {
	public static void main(String[] args) {
		int[] a = { 5, 2, 33, 1, 4 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] < a[j + 1]) {
					int temp = a[j];

					a[j] = a[j + 1];

					a[j + 1] = temp;

			S	}
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(a[1]);
	}
}
