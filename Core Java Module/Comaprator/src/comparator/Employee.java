package comparator;

public class Employee implements Comparable<Employee> {
	int eid;
	String name;
	double salary;

	Employee() {// Default Constructor
//		System.out.println("Default Constructor");
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
		return "\nEmployee id is " + this.eid + "Employee name is " + this.name + " Employee salary is " + this.salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		System.out.println("Inside compareTo");
		return this.eid - o.eid;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("Inside hashcode");
		return this.eid;
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		System.out.println("Inside  same dataequals");
		Employee e = (Employee) o;
		if (this.eid == e.eid) {
			return true;
		} else {
			return false;
		}
	}

}// employee class ends here
