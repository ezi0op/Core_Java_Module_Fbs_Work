import java.util.Scanner;
class SalesManager{
	int id;
	String name;
	double salary;
	double incentive;
	int target;

	SalesManager(){//Default Constuctor
	System.out.println("Constuctor Called");
	this.id=324;
	this.name="Amit";
	this.salary=234234;
	this.incentive=234;
	this.target=12;
	}
		
	SalesManager(int a,String b,double c,float d,int e){//Parameterized Constuctor
	System.out.println("Parameter Constuctor Called");
	this.id=a;
	this.name=b;
	this.salary=c;
	this.incentive=d;
	this.target=e;
	}

	
	void setID(int a){
	id = a;
	}
	void setName(String b){	
	name=b;
	}
	void setSalary(double c){
	salary=c;
	}
	void setIncentive(float d){
	incentive=d;
	}
	void setTarget(int e){
	target=e;
	}
	int getId(){
	return this.id;
	}
	String getName(){
	return this.name;
	}
	double getSalary(){
	return this.salary;
	}
	float getIncentive(){
	return this.incentive;
	}
	int getTarget(){
	return this.target;
	}
	
	void display(){
	System.out.println("ID is "+this.id);
	System.out.println("Name is "+this.name);
	System.out.println("Salary is "+this.salary);
	System.out.println("Incentve is "+this.incentive);
	System.out.println("Target is "+this.target);
	}	
	

	
}//SalesManager class ends here
class TestSalesManager{
	public static void main(String[] a){

	SalesManager s1;
	s1=new SalesManager();
	s1.setID(12);
	s1.setName("Jay");
	s1.setSalary(342.45);
	s1.setTarget(12);
	s1.display();

	
	SalesManager s2;
	s2=new SalesManager();
	s2.setID(14);
	s2.setName("Amit");
	s2.setSalary(200);
	s2.setTarget(2412);
	s2.display();
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter id :");
	int a = nextInt();
	
	System.out.println("Enter Name :");
	String b = nextLie();
	
	System.out.println("Enter Salary :");
	double c = next();
	
	System.out.println("Enter Incentive :");
	double d = nextDouble();

	System.out.println("Enter Target :");
	int e = nextInt();	

	SalesManager s4;
	s4= new SalesManager(a,b,c,d,e);
	s4.display();

	
	SalesManager s3;
	s3= new SalesManager();
	s3.display();
	
	if(s1.getSalary()>s2.getSalary()){
	System.out.println("S1 has Higher Salary");
	}else{
	System.out.println("S2 has Higher Salary");
	}
	

	}//main ends here	
}//testSalesManager class ends here