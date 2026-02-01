package assignment1;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';
		lowup(ch);
	}
	static void lowup(char ch) {
	 	if(ch >= 'A'&& ch <= 'Z')
	 	{
	 		System.out.println("Its is uppercase character");	
		}
		else
		{
			System.out.println("Its is lowercase character");
		}	
	}

}
