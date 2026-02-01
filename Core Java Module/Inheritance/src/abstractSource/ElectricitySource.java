package abstractSource;

import java.util.Scanner;

abstract class ElectricityBillCal {
	double unit;
	String cName;

	ElectricityBillCal() {
		this.unit = 00;
		this.cName = "Not Given";
	}// Default Constructor

	ElectricityBillCal(double unit, String cName) {
		this.unit = unit;
		this.cName = cName;
	}// Parameterized Constructor

	double getUnit() {
		return unit;
	}

	void setUnit(double unit) {
		this.unit = unit;
	}

	String getcName() {
		return cName;
	}

	void setcName(String cName) {
		this.cName = cName;
	}

	abstract double calculateBill();

	final void generateBill() {
		double amt = calculateBill();
		double tax = amt * 0.05;
		amt = amt + tax + 50;
		System.out.println("Total Final Bill is " + amt);
	}

	void showUsage() {
		System.out.println("---------------------------");
		System.out.println("Customer Nmae :" + this.cName);
		System.out.println("Units : " + this.unit);
		System.out.println("---------------------------");
	}

	@Override
	public String toString() {
		return "Units :" + this.unit + "\nCustomer Name is " + this.cName;
	}

}// ElectricityBillCal ends here

class ResidentialBill extends ElectricityBillCal {

	ResidentialBill(double unit, String cName) {
		super(unit, cName);
	}

	double calculateBill() {
		double billAmt = 0;
		if (unit >= 0 && unit <= 100) {
			billAmt = 2.5 * unit;
		} else if (unit >= 101 && unit <= 300) {
			billAmt = 3.5 * unit;
		} else if (unit > 300) {
			billAmt = 5 * unit;
		}

		if (unit > 500) {
			billAmt = billAmt + 150;
		}
		return billAmt;
	}

}// ResidentalBill ends here

class CommercialBill extends ElectricityBillCal {
	CommercialBill(double unit, String cName) {
		super(unit, cName);
	}

	double calculateBill() {
		double billAmt = 6.5 * unit;
		if (unit < 200) {
			billAmt = 1500;
		} else if (unit > 1000) {
			double surcharge = billAmt * 0.08;
			billAmt = billAmt + surcharge;
		}
		return billAmt;

	}

}// CommercialBill ends here

class TestBill {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("---------------------------");
		System.out.println("Select Customer Type is ");
		System.out.println("1. Residential ");
		System.out.println("2. Commercial");
		System.out.println("---------------------------");

		System.out.println("---------------------------");
		System.out.println("Enter choice :");

		int choice = sc.nextInt();
		sc.nextLine();
		System.out.println("---------------------------");

		switch (choice) {
		case 1:
			System.out.println("---------------------------");
			System.out.println("Enter Customer Name :");
			String Name = sc.nextLine();

			System.out.println("Enter Units Consumed :");
			int units = sc.nextInt();

			System.out.println("---------------------------");

			ResidentialBill b = new ResidentialBill(units, Name);
			b.generateBill();

			System.out.println("---------------------------");

			break;
		case 2:
			System.out.println("---------------------------");
			System.out.println("Enter Customer Name :");
			String N1 = sc.nextLine();

			System.out.println("Enter Units Consumed :");
			int u2 = sc.nextInt();
			System.out.println("---------------------------");
			CommercialBill c = new CommercialBill(u2, N1);
			c.generateBill();
			System.out.println("---------------------------");
			break;
		default:
			System.out.println("Invalid choice!");
			break;
		}
		sc.close();

	}// main ends here

}
// TestBill ends here