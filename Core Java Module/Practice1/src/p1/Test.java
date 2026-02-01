package p1;

public class Test {
	
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		swap(a);
	}
	static void swap(int[] a) {
		int b=2;
	
		int n=a.length;
		int[] temp=new int[n];
		int index=0;
		for (int i =n-b; i < n; i++) {
			temp[index++]=a[i];
			
		}
		for (int i = 0; i < n-b; i++) {
			temp[index++]=a[i];
		}
		for (int i = 0; i < n; i++) {
			a[i]=temp[i];
		}
		for (int x: a) {
			System.out.println(x+" ");
		}
	}
}
