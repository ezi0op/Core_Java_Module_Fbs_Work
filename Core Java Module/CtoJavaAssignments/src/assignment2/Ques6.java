package assignment2;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=8;
		div(no);
	}
	static void div(int no) {
		if(no%3==0&&no%5==0)
		{
			System.out.println("Divisible by both");
		}	else if(no%3==0&&no%5!=0)
		{
			System.out.println("Divisible by 3 but not by 5");
		}	else if(no%3!=0&&no%5==0)
		{
			System.out.println("Divisible by 5 but not by 3");
		}else{
			System.out.println("Divisible by None");
		}
	}

}
