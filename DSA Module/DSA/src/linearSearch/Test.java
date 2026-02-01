package linearSearch;


import java.util.*;


public class Test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] a = new int[5];
	
	System.out.println("Enter elements : ");
	for (int i = 0; i < a.length; i++) {
	 a[i]=sc.nextInt();
	}
	
	System.out.println("Search element : ");
	int x= sc.nextInt();
	
	int result =  linearSearch(a, x);
	if (result!=1) {
		System.out.println(" found");
	}else {
		System.out.println("Not found");
	}
	
		
}
	
	static int linearSearch(int[] a,int x) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]==x) {
				return i;
			}
			
		}
		return 1;
	}
}
