package uniAdmission;

public class UniversityAdmission {

	String name;
	int age;
	double percentage;
	double courseFees;
	double feesPaid;
	UniversityAdmission(String name, int age, double percentage, double courseFees, double feesPaid) {
		this.name = name;
		this.age = age;
		this.percentage = percentage;
		this.courseFees = courseFees;
		this.feesPaid = feesPaid;
	}
	
	
	void validateForm() throws EmptyNameException,UnderageException,InvalidPercentageException,FeesNotPaidException,InsufficientFeesException,NotFitForAdmission {
		if(name==null) {
			throw new EmptyNameException();
		}else {
			System.out.println("name is ok");
		}
		
		if(age<17) {
			throw new UnderageException();
		}else {
			System.out.println("Age is ok");
		}
		
		if(percentage < 0 && percentage >100) {
			throw new InvalidPercentageException();
		}else {
			System.out.println("percentage is ok");
		}
		if(percentage<35) {
			throw new NotFitForAdmission();
		}else {
			System.out.println("Good Percentage");
		}
		
		if(courseFees==0) {
			throw new FeesNotPaidException();
		}else {
			System.out.println("Fees Paid");
		}
		
		if(feesPaid<(0.30*courseFees)) {
			throw new InsufficientFeesException();
		}else {
			System.out.println("Fees paid");
		}
	}
}
