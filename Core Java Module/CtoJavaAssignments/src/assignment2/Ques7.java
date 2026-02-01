package assignment2;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 10;
		
		person(age);
	}
	static void person(int age) {
		if(age < 12){
			System.out.println("The person is Child");
		}else if(age >= 12 && age <= 19){
			System.out.println("The person is Teenager");
		}else if(age >= 20 && age<= 59){
			System.out.println("The person is Adult");
		}else if(age >= 60){
			System.out.println("The person is Senior");
		}else{
			System.out.println("Invalid age");
		}
	}

}
