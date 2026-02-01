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
		
	SalesManager(int a,String b,double c,double d,int e){//Parameterized Constuctor
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
	void setIncentive(double d){
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
	double getIncentive(){
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
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter id :");
	int r = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Enter Name :");
	String t = sc.nextLine();
	
	System.out.println("Enter Salary :");
	double y = sc.nextDouble();
	
	System.out.println("Enter Incentive :");
	double f = sc.nextDouble();

	System.out.println("Enter Target :");
	int i = sc.nextInt();	

	
	SalesManager arr[]= new SalesManager[2];
	arr[0]=new SalesManager();
	arr[1] = new SalesManager(r,t,y,f,i);	

	for(int j=0;j<arr.length;j++){
	arr[j].display();
	
	}
	

	}//main ends here	
}//testSalesManager class ends here