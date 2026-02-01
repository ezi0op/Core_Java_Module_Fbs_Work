package assignment0;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 5;
		Square(a,b);
		Cube(a,b);
	}
	static void Square(int a,int b) {
		int Square = a*a;
		
		System.out.println("Square of the given number is "+ Square);
	}
	static void Cube(int a,int b) {
		int Cube= b*b*b;
		
		System.out.println("Cube of the given number is %d " + Cube);
		
	}
}
