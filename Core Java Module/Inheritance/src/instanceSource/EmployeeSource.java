package instanceSource;



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

	@Override
	public String toString() {
		return "Employee id is " + this.eid + "\nEmployee name is " + this.name + "\nEmployee salary is " + this.salary;
	}

//	void display() {
//		System.out.println("Employee id is " + this.eid);
//		System.out.println("Employee name is " + this.name);
//		System.out.println("Employee salary is " + this.salary);
//	}
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

	@Override
	public String toString() {
		return super.toString() + "\nHR Commission is " + this.commission + "\nHR TeamSize is " + this.teamSize;
	}

//	void display() {
//		super.display();
//		System.out.println("HR Commission is " + this.commission);
//		System.out.println("HR TeamSize is " + this.teamSize);
//	}

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

	@Override
	public String toString() {
		return super.toString() + "\nSalesManager Incentive is " + this.incentive + "\nSalesManager Target is "
				+ this.target;
	}

//	void display() {
//		super.display();
//		System.out.println("SalesManager Incentive is " + this.incentive);
//		System.out.println("SalesManager Target is " + this.target);
//	}

}// SalesManager ends here

class AreaSalesManager extends SalesManager {
	String areaName;

	AreaSalesManager() {
		super();
		this.areaName = "Not Given";
	}

	AreaSalesManager(int eid, String name, double salary, double incentive, int target, String areaName) {
		super(eid, name, salary, incentive, target);
		this.areaName = areaName;
	}

	String getAreaName() {
		return areaName;
	}

	void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	@Override
	public String toString() {
		return "\nArea Name is " + this.areaName;
	}

//	 void display() {
//		 super.display();
//		 System.out.println("Area Name is "+this.areaName);
//	}

}

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
		return salary + allowance;
	}

	@Override
	public String toString() {
		return super.toString() + "\nAllowance is " + this.allowance + "\nTotal calculated salary is" + calsal();
	}

//	void display() {
//		super.display();
//		System.out.println("Allowance is " + this.allowance);
//		System.out.println("Total calculated salary is" + calsal());
//	}
}// Admin class ends here

class TestEmployee {
	public static void main(String[] args) {

		TestEmployee.giveBonus(new SalesManager(101, "Amit", 4500, 7777, 12));
		TestEmployee.giveBonus(new Hr(101, "Amit", 4500, 3423, 12));

	}

	static void giveBonus(Employee e1) {

		if (e1 instanceof SalesManager) {
			SalesManager s1 = (SalesManager) e1;
			s1.setIncentive(234);
			System.out.println(s1);
		}
		if (e1 instanceof Hr) {
			Hr h1 = (Hr) e1;
			h1.setCommission(234);
			System.out.println(h1);
		}
	}

}// TestEmployee ends here
