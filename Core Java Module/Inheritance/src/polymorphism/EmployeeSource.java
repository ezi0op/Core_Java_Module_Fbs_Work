package polymorphism;

class Employee {
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
		System.out.println("Parameterized Constructor");
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	int getEid() {
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

	void setSalary(double salary) {
		this.salary = salary;
	}
	double calsal() {
		return salary;
	}

	void display() {
		System.out.println("Employee id is " + this.eid);
		System.out.println("Employee name is " + this.name);
		System.out.println("Employee salary is " + this.salary);
		System.out.println("Total calculated salary is"+calsal());
	}
}// employee class ends here

class Hr extends Employee {

	double commission;
	int teamSize;

	Hr() {// Default Constructor
		super();
		System.out.println("Default Constructor");
		this.commission = 00;
		this.teamSize = 00;

	}

	Hr(int eid, String name, double salary, double commission, int teamSize) {// Parameterized
		super(eid, name, salary);
		System.out.println("Parameterized Constructor");
		this.commission = commission;
		this.teamSize = teamSize;
	}

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}

	int getTeamSize() {
		return teamSize;
	}

	void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	double calsal() {
		return salary+commission;
	}

	void display() {
		super.display();
		System.out.println("HR Commission is " + this.commission);
		System.out.println("HR TeamSize is " + this.teamSize);
		System.out.println("Total calculated salary is"+calsal());
	}

}// Hr class ends here

class SalesManager extends Employee {

	double incentive;
	int target;

	SalesManager() {// Default Constructor
		super();
		System.out.println("Default Constructor");
		this.incentive = 00;
		this.target = 00;
	}

	SalesManager(int eid, String name, double salary, double incentive, int target) {// Parameterized Constructor
		super(eid, name, salary);
		System.out.println("Parameterized Constructor");
		this.incentive = incentive;
		this.target = target;
	}

	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	int getTarget() {
		return target;
	}

	void setTarget(int target) {
		this.target = target;
	}
	double calsal() {
		return salary+incentive;
	}

	void display() {
		super.display();
		System.out.println("SalesManager Incentive is " + this.incentive);
		System.out.println("SalesManager Target is " + this.target);
		System.out.println("Total calculated salary is"+calsal());
	}

}// SalesManager ends here

class Admin extends Employee {

	int allowance;

	Admin() {// default constuctor
		super();
		System.out.println("Constuctor Called");
		this.allowance = 324;
	}

	Admin(int eid, String name, double salary, int allowance) {
		super(eid, name, salary);
		this.allowance = allowance;
	}

	void setAllowance(int b) {
		allowance = b;
	}

	int getAllowance() {
		return this.allowance;
	}
	double calsal() {
		return salary+allowance;
	}

	void display() {
		super.display();
		System.out.println("Allowance is " + this.allowance);
		System.out.println("Total calculated salary is"+calsal());
	}
}// Admin class ends here

class TestEmployee {
	public static void main(String[] args) {

		Employee e1;
		e1 = new Employee(102, "aMIT", 3424);
		e1.calsal();
		e1.display();
		System.out.println("\n\n");
		
		e1 = new Hr(102, "aMIT", 3424, 34, 43);
		e1.calsal();
		e1.display();
		
		System.out.println("\n\n");

		e1 = new Admin(102, "aMIT", 3424, 34);
		e1.calsal();
		e1.display();
		System.out.println("\n\n");

		e1 = new SalesManager(102, "aMIT", 3424, 45, 5);
		e1.calsal();
		e1.display();

	}
}// TestEmployee ends here
