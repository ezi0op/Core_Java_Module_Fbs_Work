class Employee{
	
	int id;
	String name;
	double basicSalary;
	static double companyBonusRate;
	
	static 
	{
	companyBonusRate=12.5;
	}

	Employee(){//Default constructor
	System.out.println("Default Constructor");
	this.id=00;
	this.name="OOOO";
	this.basicSalary=00;
	}
	
	Employee(int a,String b,double c){//Paramterized constructor
	System.out.println("Parameterized Constructor");
	this.id=a;
	this.name=b;
	this.basicSalary=c;
	}

	double calculateTotalSalary(){
		return basicSalary+(basicSalary*companyBonusRate/100);
	
	
	}
	
	void setId(int a){
	this.id=a;
	}
	void setName(String b){
	this.name=b;
	}
	void setBasicSalary(double c){
	this.basicSalary=c;
	}
	static void setCompanyBonusRate(double d){
	companyBonusRate=d;
	}
	
	int getId(){
	return this.id;
	}
	String getName(){
	return this.name;
	}
	double getBasicSalary(){
	return this.basicSalary;
	}
	double getCompanyBonusRate(){
	return this.companyBonusRate;
	}

	
	void display(){	
	System.out.println("Employee ID :"+this.id);
	System.out.println("Employee Name :"+this.name);	
	System.out.println("Employee BasicSalary :"+this.basicSalary);
	System.out.println("Employee Total Salary :"+calculateTotalSalary());
	}

}
class TestEmployee {
	public static void main(String[] args){
	
	Employee.setCompanyBonusRate(45);
	
	Employee e1 =  new Employee(23,"Amit",34);
	e1.display();
	
	}	
	
	
}