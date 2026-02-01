package comparator;

import java.util.*;

import comparator.Employee;

public class Test {

	public static void main(String[] args) {

		// create obj of employee
		Employee e1 = new Employee(101, "Amit", 23123);
		Employee e2 = new Employee(107, "Ajay", 22323);
		Employee e3 = new Employee(107, "Ajay", 22323);
		Employee e4 = new Employee(107, "Ajay", 22323);
		Employee e5 = new Employee(103, "sad", 654);

//				Array List
		HashSet<Employee> l1 = new HashSet<Employee>();

		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);
		l1.add(e5);
		
		
//		if (l1.contains(new Employee(107, "Ajay", 22323))) {
//			System.out.println("Found");
//		} else {
//			System.out.println("Not found");
//		}

	}// main ends here
//
//	public static void main(String[] args) {
//
//		// create obj of employee
//		Employee e1 = new Employee(101, "Amit", 23123);
//		Employee e2 = new Employee(107, "Ajay", 22323);
//		Employee e3 = new Employee(103, "sad", 654);
//
////				Array List
//		TreeSet<Employee> l1 = new TreeSet<Employee>();
//
//		l1.add(e1);
//		l1.add(e2);
//		l1.add(e3);
//
//		if (l1.contains(new Employee(107, "Ajay", 22323))) {
//			System.out.println("Found");
//		} else {
//			System.out.println("Not found");
//		}
//		int flag=0;
//		for(Employee e: l1) {
//			if(e.getEid()==101) {
//				System.out.println("Found");
//				flag=1;
//				break;
//		}
//			if(flag==0)
//				System.out.println("Not found");
//
//	}// main ends here
//////
//	public static void main3(String[] args) {
//
//		// create obj of employee
//		Employee e1 = new Employee(101, "Amit", 23123);
//		Employee e2 = new Employee(107, "Ajay", 22323);
//		Employee e3 = new Employee(103, "sad", 654);
//
////		Array List
//		ArrayList<Employee> l1 = new ArrayList<Employee>();
//
//		l1.add(e1);
//		l1.add(e2);
//		l1.add(e3);
//
////		if (l1.contains(new Employee(107, "Ajay", 22323))) {
////			System.out.println("Found");
////		} else {
////			System.out.println("Not found");
////		}
//
//		Scanner sc = new Scanner(System.in);
//		int choice = 0;
//		do {
//			System.out.println("Enter Choice To Sort");
//			System.out.println("1.Sort by Id");
//			System.out.println("2.Sort by Salary");
//			System.out.println("3.Sort by Name");
//			System.out.println("0.Exit");
//
//			choice = sc.nextInt();
//
//			switch (choice) {
//
//			case 1:
//				myIdComparator mid = new myIdComparator();
//
//				Collections.sort(l1, mid);
//
//				System.out.println("After" + l1);
//				break;
//			case 2:
//				mySalaryComparator msc = new mySalaryComparator();
//				Collections.sort(l1, msc);
//				System.out.println(l1);
//				break;
//			case 3:
//				myNameComparator mnc = new myNameComparator();
//				Collections.sort(l1, mnc);
//				System.out.println(l1);
//			
//
//			}
//		} while (choice != 0);
//
//
//	}// main ends here
//	
//	public static void main(String[] args) {
//
//		// create obj of employee
//		Employee e1 = new Employee(101, "Amit", 23123);
//		Employee e2 = new Employee(107, "Ajay", 22323);
//		Employee e3 = new Employee(103, "sad", 654);
//
////		Array List
//		ArrayList<Employee> l1 = new ArrayList<Employee>();
//
//		l1.add(e1);
//		l1.add(e2);
//		l1.add(e3);
//
////		if (l1.contains(new Employee(107, "Ajay", 22323))) {
////			System.out.println("Found");
////		} else {
////			System.out.println("Not found");
////		}
//
//		Scanner sc = new Scanner(System.in);
//		int choice = 0;
//		do {
//			System.out.println("Enter Choice To Sort");
//			System.out.println("1.Sort by Id");
//			System.out.println("2.Sort by Salary");
//			System.out.println("3.Sort by Name");
//			System.out.println("0.Exit");
//
//			choice = sc.nextInt();
//
//			switch (choice) {
//
//			case 1:
//				Collections.sort(l1);
//
//				Collections.sort(l1);
//
//				System.out.println("After" + l1);
//				break;
//			case 2:
//				mySalaryComparator msc = new mySalaryComparator();
//				Collections.sort(l1, msc);
//				System.out.println(l1);
//				break;
//			case 3:
//				myNameComparator mnc = new myNameComparator();
//				Collections.sort(l1, mnc);
//				System.out.println(l1);
//			
//
//			}
//		} while (choice != 0);
//
//
//	}// main ends here
////


//	public static void main(String[] args) {
//
//		// create obj of employee
//		Employee e1 = new Employee(101, "Amit", 23123);
//		Employee e2 = new Employee(107, "Ajay", 22323);
//		Employee e3 = new Employee(103, "sad", 654);
//
////		Array List
//		LinkedList<Employee> l1 = new LinkedList<Employee>();
//
//		l1.add(e1);
//		l1.add(e2);
//		l1.add(e3);
//
//		if (l1.contains(new Employee(107, "Ajay", 22323))) {
//			System.out.println("Found");
//		} else {
//			System.out.println("Not found");
//		}
//
//		System.out.println("Before " + l1);
//
//		Scanner sc = new Scanner(System.in);
//		int choice = 0;
//		do {
//			System.out.println("Enter Choice To Sort");
//			System.out.println("1.Sort by Id");
//			System.out.println("2.Sort by Salary");
//			System.out.println("3.Sort by Name");
//			System.out.println("0.Exit");
//
//			choice = sc.nextInt();
//
//			switch (choice) {
//
//			case 1:
//				myIdComparator mid = new myIdComparator();
//
//				Collections.sort(l1, mid);
//
//				System.out.println("After" + l1);
//				break;
//			case 2:
//				mySalaryComparator msc = new mySalaryComparator();
//				Collections.sort(l1, msc);
//				System.out.println(l1);
//				break;
//			case 3:
//				myNameComparator mnc = new myNameComparator();
//				Collections.sort(l1, mnc);
//				System.out.println(l1);
//			
//
//			}
//		} while (choice != 0);

	
	
//	public static void main(String[] args) {
//
//		// create obj of employee
//		Employee e1 = new Employee(101, "Amit", 23123);
//		Employee e2 = new Employee(107, "Ajay", 22323);
//		Employee e3 = new Employee(103, "sad", 654);
//
////		Array List
//		LinkedList<Employee> l1 = new LinkedList<Employee>();
//
//		l1.add(e1);
//		l1.add(e2);
//		l1.add(e3);

//		int flag=0;
//		for(int i=0;i<l1.size();i++) {
//			if(l1.get(i).getEid()==101) {
//				System.out.println("Found");
//				flag=1;
//				break;
//		}
//			if(flag==0)
//				System.out.println("Not found");
		
//		for(Employee e: l1) {
//			System.out.println(e);
//		}//Advance loops
		
//		int flag=0;//Advance loops
//		for(Employee e: l1) {
//			if(e.getEid()==101) {
//				System.out.println("Found");
//				flag=1;
//				break;
//			}
//		}if(flag==0)
//			System.out.println("Not found");

	
	}// main ends here
//}// TestEmp ends here