package assignment3;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,isPrime =1,i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		no = sc.nextInt();
		
		sc.close();
		
		for(i=2; i<=no/2; i++) {
			if(no%i==0) {
				isPrime=0;
				break;
			}	
		}
		if(isPrime==1) {
			System.out.println("This is  prime");
		} else {
			System.out.println("This is not prime");
		}
		
	}

}
