package stack;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Stack s = new Stack(4);
		
//		s.push(34);
//		s.push(324);
//		s.push(234);
//		s.push(3245);
//		
//		System.out.println(s.peek());
//		System.out.println(s.pop());
//		System.out.println(s.peek());
		
		
		System.out.println("--------Stack Operations Menu-----------");
		int a=0;
		while(a!=4) {
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			
			System.out.println("Enter Choice :");
			 a=sc.nextInt();
			
			switch (a) {
			case 1: 
				System.out.println("Enter Element to Push : ");
				int ele=sc.nextInt();
				s.push(ele);
				break;
			case 2: 
				
				s.pop();
//				System.out.println(s.pop());
				break;
			case 3: 
				s.peek();
//				System.out.println(s.peek());
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
