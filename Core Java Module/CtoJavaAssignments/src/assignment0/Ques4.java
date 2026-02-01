package assignment0;

public class Ques4 {

	public static void main(String[] args) {
		//4. Write a C program to swap two numbers using a temporary third variable.
		int a=10;
		int b=20;
		swap(a,b);
		
	}
	static void swap(int a,int b) {
		int temp=a;
		 a=b;
		 b=temp;
		System.out.println("Swapped values are of a is "+a+"and b is "+b);
	}

}
