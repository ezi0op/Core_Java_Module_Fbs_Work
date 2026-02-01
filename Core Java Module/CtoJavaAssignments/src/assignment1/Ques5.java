package assignment1;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 20;
		vote(age);
		
	}
	static void vote(int age) {
		if(age >= 18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("Not Eligible to vote");
		}
	}

}
