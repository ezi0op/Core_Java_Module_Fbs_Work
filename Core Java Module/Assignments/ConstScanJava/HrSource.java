import java.util.Scanner;
class Hr{
	int id;
	String name;
	double salary;
	double commission;
		
	Hr(){//Default constructor
	System.out.println("Constuctor Called");
	this.id=32;
	this.name="Annasaheb";
	this.salary=243223;
	this.commission=234;
	}
	Hr(int i,String a,double b,double c){//Parameterized constructor
	System.out.println("Parameterized Constuctor Called");
	this.id=i;
	this.name=a;
	this.salary=b;
	this.commission=c;
	
	}

	
	void setId(int a){
	id=a;	
	}		
	void setName(String b){
	name=b;	
	}
	void setSalary(double c){
	salary=c;	
	}
	void setCommission(double d){
	commission=d;	
	}

	int getID(){
	return this.id;
	}
	String getName(){
	return this.name;
	}
	double getSalary(){
	return this.salary;
	}
	double getCommission(){
	return this.commission;
	}
	
	void display(){
	System.out.println("Id is "+this.id);
	System.out.println("Name is "+this.name);
	System.out.println("Salary is "+this.salary);
	System.out.println("Commission is "+this.commission);
	}
	
	
}//Hr class ends here
class TestHr{
	public static void main(String[] a){

	Hr h1;
	h1=new Hr();
	h1.setId(12);
	h1.setName("Amit");
	h1.setSalary(1231.023);
	h1.setCommission(342234);
	h1.display();

	Hr h2;
	h2=new Hr();
	h2.setId(12);
	h2.setName("Amit");
	h2.setSalary(1231.023);
	h2.setCommission(342234);
	h2.display();
		
	Hr h3;
	h3=new Hr();
	h3.display();
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter id :");
	int a = nextInt();
	
	System.out.println("Enter Name :");
	String b = nextLie();
	
	System.out.println("Enter Salary :");
	double c = nextDouble();	
		
	System.out.println("Enter Commision :");
	double d = nextDouble();

	Hr h4;
	h4=new Hr(a,b,c,d);
	h4.display();
	
	if(h1.salary>h2.salary){
	System.out.println("H1 has highest Salary");
	}else{
	System.out.println("H2 has highest Salary");
	}
	
	}//main ends here	
}//testHr class ends here