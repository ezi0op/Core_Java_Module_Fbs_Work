package abstractSource;

import java.util.Scanner;

abstract class InsurancePreCal {
	
	
	
	String pHolderName;
	double basePremium;

	InsurancePreCal() {
		this.pHolderName = "Not Given";
		this.basePremium = 00;
	}// Default Constructor

	InsurancePreCal(String pHolderName, double basePremium) {
		this.pHolderName = pHolderName;
		this.basePremium = basePremium;
	}// Parameterised Constructor

	
	//Setters and Getters
	String getpHolderName() {
		return pHolderName;
	}

	void setpHolderName(String pHolderName) {
		this.pHolderName = pHolderName;
	}

	double getBasePremium() {
		return basePremium;
	}

	void setBasePremium(double basePremium) {
		this.basePremium = basePremium;
	}

	abstract double calculatePremium();

	@Override
	public String toString() {
		return "Insurance Holder Name is " + this.pHolderName + "\nBase Premium is" + this.basePremium;
	}

	void policyDetails() {
		System.out.println("--------------------------------------------");
		System.out.println("Insurance Holder Name : " + this.pHolderName);
		System.out.println("Base Premium : " + this.basePremium);
		System.out.println("Final Premium : " + calculatePremium());
		System.out.println("--------------------------------------------");
	}

}//InsurancePreCal ENDS HERE

class CarInsurance extends InsurancePreCal {
	int carAgeInYears;
	boolean hadAccidentalInLastYear;
	double carValue;

	CarInsurance() {
		super();
		this.carAgeInYears = 00;
		this.carValue = 00;
	}// default constructor

	CarInsurance(String pHolderName, double basePremium, int carAgeInYears, boolean hadAccidentalInLastYear,
			double carValue) {
		super(pHolderName, basePremium);
		this.carAgeInYears = carAgeInYears;
		this.hadAccidentalInLastYear = hadAccidentalInLastYear;
		this.carValue = carValue;
	}// Parameterised constructor

	
	
	//Setter and gETTERS
	int getCarAgeInYears() {
		return carAgeInYears;
	}

	void setCarAgeInYears(int carAgeInYears) {
		this.carAgeInYears = carAgeInYears;
	}

	boolean isHadAccidentalInLastYear() {
		return hadAccidentalInLastYear;
	}

	void setHadAccidentalInLastYear(boolean hadAccidentalInLastYear) {
		this.hadAccidentalInLastYear = hadAccidentalInLastYear;
	}

	double getCarValue() {
		return carValue;
	}

	void setCarValue(double carValue) {
		this.carValue = carValue;
	}

	double calculatePremium() {
		double premium = basePremium;
		if (carAgeInYears <= 3) {
			premium = premium + (basePremium * 0.10);
		} else if (carAgeInYears >= 4 && carAgeInYears <= 7) {
			premium = premium + (basePremium * 0.20);
		} else {
			premium = premium + (basePremium * 0.30);
		}

		if (hadAccidentalInLastYear) {
			premium = premium + (basePremium * 0.25);
		} else {
			premium = premium - (basePremium * 0.10);
		}

		if (carValue > 1000000) {
			premium = premium + 2000;
		}
		return premium;
	}

}// CarInsurance ends here

class HealthInsurance extends InsurancePreCal {
	int age;
	boolean isSmoke;
	boolean hasPreExistingDisease;

	HealthInsurance() {
		super();
		this.age = 00;
	}//Default Constructor

	HealthInsurance(String pHolderName, double basePremium, int age, boolean isSmoke, boolean hasPreExistingDisease) {
		super(pHolderName, basePremium);
		this.age = age;
		this.isSmoke = isSmoke;
		this.hasPreExistingDisease = hasPreExistingDisease;
	}//Parameterised Constructor
	
	
	//Setters and Getters
	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	boolean isSmoke() {
		return isSmoke;
	}

	void setSmoke(boolean isSmoke) {
		this.isSmoke = isSmoke;
	}

	boolean isHasPreExistingDisease() {
		return hasPreExistingDisease;
	}

	void setHasPreExistingDisease(boolean hasPreExistingDisease) {
		this.hasPreExistingDisease = hasPreExistingDisease;
	}

	double calculatePremium() {
		double premium = basePremium;

		if (age < 30) {
			premium = premium + (basePremium * 0.10);
		} else if (age < 45) {
			premium = premium + (basePremium * 0.25);
		} else {
			premium = premium + (basePremium * 0.40);
		}

		if (isSmoke) {
			premium = premium + (basePremium * 0.30);
		} else {
			premium = premium + (basePremium * 0.05);
		}

		if (hasPreExistingDisease) {
			premium = premium + (basePremium * 0.20);
		}

		return premium;
	}

}// HealthCareInsurance ends here

class TestIns {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		System.out.println("-------------------------");
		System.out.println("Select Insurance Type is ");
		System.out.println("1. CarInsurance ");
		System.out.println("2. HealthInsurance");
		System.out.println("-------------------------");
		
		System.out.println("-------------------------");
		System.out.println("Enter choice :");
		int choice = sc.nextInt();
		sc.nextLine();
		System.out.println("-------------------------");

		
		
		switch(choice) {
		case 1 :
			System.out.print("Enter Policy Holder Name: ");
			String name = sc.nextLine();

			System.out.print("Enter Base Premium: ");
			double base = sc.nextDouble();

			System.out.print("Enter Car Age in Years: ");
			int age = sc.nextInt();

			System.out.print("Had Accident in Last Year (true/false): ");
			boolean accident = sc.nextBoolean();

			System.out.print("Enter Car Value (Rs.): ");
			double value = sc.nextDouble();

			CarInsurance b = new CarInsurance(name, base, age, accident, value);
			b.policyDetails();
			
			break;
			
		
		case 2 :
			
			System.out.print("Enter Policy Holder Name: ");
			String n1 = sc.nextLine();

			System.out.print("Enter Base Premium: ");
			double b2 = sc.nextDouble();

			System.out.print("Enter Age: ");
			int a3 = sc.nextInt();

			System.out.print("Are you a smoker (true/false): ");
			boolean smoker = sc.nextBoolean();

			System.out.print("Do you have pre-existing disease (true/false): ");
			boolean disease = sc.nextBoolean();

			HealthInsurance c = new HealthInsurance(n1, b2, a3, smoker, disease);
			c.policyDetails();
			
			break;
			
		default :
			System.out.println("Invalid choice!");
		
		}
		
		
		sc.close();
	}//main ends here
}//TestIns ends here
