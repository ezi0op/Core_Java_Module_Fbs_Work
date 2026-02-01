package assignment2;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		
		a=80;
		b=20;
		c=30;
		greater(a,b,c);
	}
	static void greater(int a,int b,int c) {
		if(a>b)
		{
			if(a>c)
			{
				 System.out.println("a is greater");
			}
			else
			{
				 System.out.println("c is greater");
			}
		}
		else
		{
			if(b>c)
			{
				 System.out.println("a is greater");
			}
			else
			{
				 System.out.println("c is greater");
			}
		}	
	}

}
