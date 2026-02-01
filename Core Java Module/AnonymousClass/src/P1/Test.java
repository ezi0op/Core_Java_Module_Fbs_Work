package P1;

import java.util.*;

public class Test {

	public static void main(String[] args) {

		// create obj of employee
		Employee e1 = new Employee(101, "Amit", 23123);
		Employee e2 = new Employee(107, "Ajay", 22323);
		Employee e3 = new Employee(103, "sad", 654);

//		Array List
		ArrayList<Employee> l1 = new ArrayList<Employee>();

		l1.add(e1);
		l1.add(e2);
		l1.add(e3);

//		if (l1.contains(new Employee(107, "Ajay", 22323))) {
//			System.out.println("Found");
//		} else {
//			System.out.println("Not found");
//		}

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("Enter Choice To Sort");
			System.out.println("1.Sort by Id");
			System.out.println("2.Sort by Name");
			System.out.println("3.Sort by Salary");
			System.out.println("0.Exit");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				Collections.sort(l1, new Comparator<Employee>() {

					@Override
					public int compare(P1.Employee o1, P1.Employee o2) {
						// TODO Auto-generated method stub
						return o1.getEid() - o2.getEid();
					}
				});

				System.out.println(l1);
				break;
			case 2:
				Collections.sort(l1, new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {
						// TODO Auto-generated method stub
						return o1.name.compareTo(o2.name);

					}
				});
				System.out.println(l1);
				break;
			case 3:
				Collections.sort(l1, new Comparator<Employee>() {

					public int compare(Employee o1, Employee o2) {
						return (int) (o1.salary - o2.salary);
					};

				});
				System.out.println(l1);
				break;

			}
		} while (choice != 0);

	}// main ends here

}// TestEmp ends here