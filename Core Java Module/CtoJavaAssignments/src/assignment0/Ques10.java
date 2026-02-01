package assignment0;

public class Ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=80;
		int b=56;
		int c=87;
		int d=82;
		int e=89;
		
		int TotalMarks=a+b+c+d+e;
		 Percentage(TotalMarks);
	}
	static void Percentage(int a) {
		int Percentage = (a/100)*100;
		
		System.out.println("The Total Marks are "+a+" and The Percentage of the whole marks is "+Percentage);
		
	}

}
