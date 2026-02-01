package assignment3;

public class Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=188;
		int i =n,fact=1,sum;
		int temp=0;
		while(i>n){
			fact = fact * i;
			temp = fact;
			i--;
			
		}
		sum = fact + temp;
		if(sum == n)
			System.out.println("It is strong");
		else
			System.out.println("It is not strong");
		
	}

}
