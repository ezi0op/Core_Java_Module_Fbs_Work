package textEditorStack;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Stack s = new Stack(100);
		
//		s.push("Amit is god");
//		s.push("Asdsa");
//		s.push("safddas");
//		s.push("sdfadsgg");
//		s.display();
//		
//		System.out.println(s.peek());
//		System.out.println(s.pop());
//		System.out.println(s.peek());
		
		
		System.out.println("--------Stack Operations Menu-----------");
		int a=0;
		while(a!=4) {
			System.out.println("1.Write a line");
			System.out.println("2.Undo");
			System.out.println("3.Display current text");
			System.out.println("4.Exit");
			System.out.println("Enter Choice :");
			 a=sc.nextInt();
			 sc.nextLine();
			
			switch (a) {
			case 1: 
				System.out.println("Enter a Sentence : ");
				String sent=sc.nextLine();
				s.push(sent);
				break;
			case 2: 
				
				s.pop();
				System.out.println(s.pop());
				break;
			case 3:
				s.display();
				break;
			case 4:
				System.out.println("Exiting......");
				break;
			default:
				System.out.println("Invalid Options!");
			}
		}
		
		
	}

}
