package assignment3;

public class Ques9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=689,rem,rev=0;
		int temp = no;
		
		while(no>0){
			rem = no%10;
			no = no / 10;
			rev = rev*10+rem;

		}
		if(temp == rev){
			System.out.println("This is Palindrome number");
		}else{
			System.out.println("This is not Palindrome number");
		}
	}

}
