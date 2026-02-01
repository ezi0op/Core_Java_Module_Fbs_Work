package assignment0;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=130;
		 hours(min);
	}
	static void hours(int min) {
		int hours = min/60;
		min=min%60;
		
		System.out.println("Remaining hours are "+hours+ " and minutes are "+min);
	}

}
