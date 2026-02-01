package assignment1;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'b';
		vowconst(ch);
	}
	static void vowconst(int ch) {
		
		if(ch== 'a'||ch== 'e'||ch== 'i'||ch== 'o'||ch== 'u' ||ch== 'A'||ch== 'E'||ch== 'I'||ch== 'O'||ch== 'U')
		{
			System.out.println("The character is vowel");
		}
		else
		{
			System.out.println("The character is consonant");
		}
	}

}
