package assignment2;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		double result;
		char operator;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first numbers: ");
		a = sc.nextInt();

		System.out.println("Enter a operator (+,-,/,*,%): ");
		operator = sc.next().charAt(0);

		System.out.println("Enter second numbers: ");
		b = sc.nextInt();
		

		if(operator == '+') {
			result=a+b;
			System.out.println("Result: "+result);
		} else if(operator == '-') {
			result=a-b;
			System.out.println("Result: "+result);
		} else if (operator == '/') {
			if(b!=0) {
				result=a/b;
				System.out.println("Result: "+result);
			} else {
				System.out.println("Division by zero is not allowed.\n");
			}
		} else if(operator == '%') {
			if(b !=0) {
				result = a%b;
				System.out.println("Result:"+result);
			} else {
				System.out.println("Modulo  is not allowed.\n");
			}
		} else {
			System.out.println("Invalid syntax is Entered:\n");
		}
	sc.close();
	}

}
