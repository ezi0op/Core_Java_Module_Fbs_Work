package assignment0;

public class Ques3 {

	public static void main(String[] args) {
		//3. Write a C program to convert temperature from Celsius to Fahrenheit using the
		//formula:
		int c =56;
		double res=temp(c);
		System.out.println("The temp of the farehenheit is "+res);
	}
		static double temp(int c){
			double f =((c *1.4) + 32);
			return f;
		}

}

