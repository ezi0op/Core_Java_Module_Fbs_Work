package assignment1;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int year =  2020;
		leaf(year);
	}
	static void leaf(int year) {
		if(year%4==0&&year%100!=0||year%400==0)
		{
			System.out.println("It is leaf Year");
		}
		else
		{
			System.out.println("It is not leaf Year");
		}
	}

}
