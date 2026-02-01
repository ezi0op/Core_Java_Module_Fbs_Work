package linkedList;

public class Employee implements Comparable<Employee> {
	int eid;
	String name;
	double salary;

	public Employee(int eid, String name, double salary) {
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

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.eid - o.eid;
	}
}// employee class ends here
