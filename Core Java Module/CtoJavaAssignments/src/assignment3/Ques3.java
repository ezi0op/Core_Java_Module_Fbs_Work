package assignment3;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=12345;
		int r1,sum=0;
		
		while(no>0){
			r1=no%10;
			sum=sum+r1;
			no=no/10;
		}
		System.out.println("Sum of the digit is "+sum);
	}

}
