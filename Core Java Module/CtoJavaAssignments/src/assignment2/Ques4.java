package assignment2;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks=65;
		
		if(marks>=75)
		{
			System.out.println("Distinction");
		}
		else
		{
			if(marks>=65)
			{
				System.out.println("First Class");
			}
			else
			{
				if(marks>=55)
				{
					System.out.println("Second Class");
				}
				else 
				{
					if(marks>=40)
					{
						System.out.println("Pass");
					}
					else
					{
						System.out.println("Fail");
					}
				}
			}
		}
	}

}
