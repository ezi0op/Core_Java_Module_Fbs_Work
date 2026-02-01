package model;

public class SalesManager extends Employee {

	double incentive;
	int target;

	SalesManager() {// Default Constructor
		super();
//		System.out.println("Default Constructor");
		this.incentive = 00;
		this.target = 00;
	}

	public SalesManager(int eid, String name, double salary, double incentive, int target) {// Parameterized Constructor
		super(eid, name, salary);
//		System.out.println("Parameterized Constructor");
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
	@Override
	public String toString() {
		return super.toString() + ", Incentive : " + this.incentive + ", Target : "
				+ this.target;
	}
	void display() {
		super.display();
		System.out.println("SalesManager Incentive is " + this.incentive);
		System.out.println("SalesManager Target is " + this.target);
		System.out.println("Total calculated salary is"+calsal());
	}

}// SalesManager ends here