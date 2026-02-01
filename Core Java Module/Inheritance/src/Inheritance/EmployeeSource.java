package Inheritance;

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

	void display() {
		System.out.println("Employee id is " + this.eid);
		System.out.println("Employee name is " + this.name);
		System.out.println("Employee salary is " + this.salary);
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

	void display() {
		super.display();
		System.out.println("HR Commission is " + this.commission);
		System.out.println("HR TeamSize is " + this.teamSize);
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

	void display() {
		super.display();
		System.out.println("SalesManager Incentive is " + this.incentive);
		System.out.println("SalesManager Target is " + this.target);
	}

}// SalesManager ends here
class AreaSalesManager extends   SalesManager{
	String areaName;
	
	 AreaSalesManager() {
		super();
		this.areaName = "Not Given";
	}

	 AreaSalesManager(int eid, String name, double salary, double incentive, int target,String areaName) {
		super(eid,name,salary,incentive,target);
		this.areaName = areaName;
	}

	 String getAreaName() {
		return areaName;
	}

	 void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	 void display() {
		 super.display();
		 System.out.println("Area Name is "+this.areaName);
	}
	
}
class TestEmployee {
	public static void main(String[] args) {

		Employee e1 = new Employee(102, "aMIT", 3424);
		e1.display();
		System.out.println("\n\n");
		Hr h1 = new Hr(101, "AJAY", 4325, 45, 435);
		h1.display();
		System.out.println("\n\n");
		SalesManager s1 = new SalesManager(104, "sfga", 4325, 145135, 123451);
		s1.display();
		System.out.println("\n\n");
		AreaSalesManager a1 = new AreaSalesManager(109,"Akay",234,234,2341,"Jath");
		a1.display();

	}
}// TestEmployee ends here
