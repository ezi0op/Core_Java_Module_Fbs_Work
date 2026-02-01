package assignment3;

public class Ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 12345;
		int ld,sum;

		ld = no % 10;
		
		while(no>=10){
			no = no /10;

		}
		sum = ld + no;
		System.out.println("Sum of first and last digit of given number is "+sum);
	}

}
