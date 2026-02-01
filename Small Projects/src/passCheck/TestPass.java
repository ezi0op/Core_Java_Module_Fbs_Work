package passCheck;

import java.util.Scanner;

public class TestPass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		UserInfo u = new UserInfo();
		
		try {
			System.out.println("Enter User Name ");
			String a =  sc.nextLine();
			
			
			u.validateUname(a);
			int a1=3;
			
			while(a1>0) {
				System.out.println("Enter PassWord");
				int p = sc.nextInt();
				try {
					
					u.validatePass(p);
					System.out.println("Login Succesfull");
					return;
				}catch(InvalidPassWorsException e) {
					a1--;
					if(a1==0) {
						System.out.println("Acc Locked!");
						return;
					}
					System.out.println("Attempt Left : "+a1);
				}
			}
		}catch(InvalidUserNameException e) {
			System.out.println(e);
		}
		sc.close();

	}

}
