package model;

public class Hr extends Employee {

	double commission;
	

	Hr() {// Default Constructor
		super();
//		System.out.println("Default Constructor");
		this.commission = 00;
		

	}

	public Hr(int eid, String name, double salary, double commission) {// Parameterized
		super(eid, name, salary);
//		System.out.println("Parameterized Constructor");
		this.commission = commission;
	
	}

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}

	
	double calsal() {
		return salary + commission;
	}
	@Override
	public String toString() {
		return super.toString() + ", Commission : " + this.commission ;
	}
	void display() {
		super.display();
		System.out.println("HR Commission is " + this.commission);
	
		System.out.println("Total calculated salary is" + calsal());
	}

}// Hr class ends herepackage p1;
