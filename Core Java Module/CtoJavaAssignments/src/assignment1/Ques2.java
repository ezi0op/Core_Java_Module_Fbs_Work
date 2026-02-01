package assignment1;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=141;
		pallindrome(n);
	}
	static void pallindrome(int n) {
		int fd=n/100;
		int ld=n%10;
		if(fd==ld){
			System.out.println(fd+" and "+ld+" Pallindrome");
		}else{
			System.out.println(fd+" and "+ld+" not Pallindrome");
		}
	}

}
