package assignment3;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=153,rem,sum;
		int temp = sum = 0;
		
		while(no>0){
			rem = no%10;
			no = no / 10;
			sum = sum + rem*rem*rem;

		}
		if(temp == sum){
			System.out.println("This is Armstrong number");
		}else{
			System.out.println("This is not Armstrong number");
		}
	}

}
