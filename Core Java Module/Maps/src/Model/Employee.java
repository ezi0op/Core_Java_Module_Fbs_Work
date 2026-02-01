package Model;

import java.util.*;

public class Employee implements Comparable{
	int eid;
	String name;
	double salary;

	Employee() {// Default Constructor
//		System.out.println("Default Constructor");
		this.eid = 00;
		this.name = "Not Provided";
		this.salary = 00;

	}

	public Employee(int eid, String name, double salary) {// Parameterized Constructor
//		System.out.println("Parameterized Constructor");
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\nEmployee id is " + this.eid + "\nEmployee name is " + this.name + " \nEmployee salary is "
				+ this.salary + "\n------------------";
	}
	
	public int compareTo(Object o) {
		Employee e1 = (Employee) o;
//		return this.eid - e1.eid;//To compare by id
		return Double.compare(this.salary, e1.salary);//To compare by salary
	
	}

//	void display() {
//		System.out.println("Employee id is " + this.eid);
//		System.out.println("Employee name is " + this.name);
//		System.out.println("Employee salary is " + this.salary);
//		
//	}
}// employee class ends here

//class TestEmp1 {
//	public static void main(String[] args) {
//
//		// create obj of employee
//		Employee e1 = new Employee(101,"Amit",23123);
//		Employee e2 = new Employee(107,"Ajay",22323);
//		Employee e3 = new Employee(103,"sad",654);
//
//		//Array List
////		List l1 = new ArrayList();
////		
////		l1.add(e1);
////		l1.add(e2);
////		l1.add(e3);
////		
////	
////		System.out.println(l1);
//
//		//LinkedList
//		List l1 = new LinkedList();
//
//		l1.add(e1);
//		l1.add(e2);
//		l1.add(e3);
//
//		System.out.println(l1);
//
//	}// main ends here
//}// TestEmp ends here

class TestEmp2 {
	public static void main(String[] args) {

		// create obj of employee
		Employee e1 = new Employee(110,"Amit",23123);
		Employee e2 = new Employee(107,"Ajay",22323);
		Employee e3 = new Employee(103,"sad",654);

		//Tree set
		Set s1 =  new TreeSet();
		
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
		
		System.out.println(s1);
		
		

		
	
		

	}// main ends here
}// TestEmp ends here
