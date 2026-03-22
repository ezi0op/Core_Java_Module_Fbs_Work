package p1;

class Employee {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void calSal() {
		System.out.println("Salary is : " + this.salary);
	}

}

class Hr extends Employee {
	double bonus;

	public Hr(int id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}

	void calSal() {
		System.out.println("Salary is : " + (this.salary + this.bonus));
	}

}

class TestApp {
	public static void main(String[] args) {
		Employee e = new Hr(101, "Amit", 4500, 500);
		e.calSal();

	}
}
