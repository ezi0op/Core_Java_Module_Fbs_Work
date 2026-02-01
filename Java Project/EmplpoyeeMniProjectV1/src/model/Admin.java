package model;

public class Admin extends Employee {

	double allowance;

	Admin() {// default constuctor
		super();
		System.out.println("Constuctor Called");
		this.allowance = 324;
	}

	public Admin(int eid, String name, double salary, double allowance) {
		super(eid, name, salary);
		this.allowance = allowance;
	}

	void setAllowance(double b) {
		allowance = b;
	}

	double getAllowance() {
		return this.allowance;
	}
	double calsal() {
		return salary+allowance;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nAllowance is " + this.allowance + "\nTotal calculated salary is" + calsal();
	}


	void display() {
		super.display();
		System.out.println("Allowance is " + this.allowance);
		System.out.println("Total calculated salary is"+calsal());
	}
}// Admin class ends here
