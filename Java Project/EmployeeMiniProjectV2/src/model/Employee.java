package model;

public abstract class Employee {
	int eid;
	String name;
	double salary;

	Employee() {// Default Constructor
		System.out.println("Default Constructor");
		this.eid = 00;
		this.name = "Not Provided";
		this.salary = 00;

	}

	Employee(int eid, String name, double salary) {// Parameterized Constructor
//		System.out.println("Parameterized Constructor");
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	abstract double calsal();

	@Override
	public String toString() {
		return "ID: " + this.eid + ", Name: " + this.name + ", Salary: " + this.salary;
	}

	void display() {
		System.out.println("Employee id is " + this.eid);
		System.out.println("Employee name is " + this.name);
		System.out.println("Employee salary is " + this.salary);
		System.out.println("Total calculated salary is" + calsal());
	}
}// employee class ends here
