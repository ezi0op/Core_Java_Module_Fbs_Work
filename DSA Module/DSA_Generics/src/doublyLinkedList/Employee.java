package doublyLinkedList;

public  class Employee {
	int eid;
	String name;
	double salary;

	Employee() {// Default Constructor
		System.out.println("Default Constructor");
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

	void setEid(int eid) {
		this.eid = eid;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}



	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
}// employee class ends here


