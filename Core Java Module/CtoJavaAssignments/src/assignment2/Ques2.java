package assignment2;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1,s2,s3;

		s1 = 20;
		s2 = 30;
		s3 = 40;
		
		triangle(s1,s2,s3);
	}
	static void triangle(int sides1,int sides2,int sides3) {
		if(sides1 == sides2 && sides2 == sides3) {
			System.out.println("This is an equilateral triangle");
		} else if(sides1 == sides2 || sides3 == sides1 || sides1==sides3) {
			System.out.println("This is an  isoceles triangle");
		} else {
			System.out.println("This is an  scalene triangle");
		}
	}
	

}
