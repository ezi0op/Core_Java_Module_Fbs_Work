import java.util.scanner;
class Employee{

	int id;
	String name;
	double salary;


	Employee(){//Default constructor
	System.out.println("Constuctor Called");
	this.id=32;
	this.name="Annasaheb";
	this.salary=243223;
	}
	Employee(int i,String a,double b){//Parameterized constructor
	System.out.println("Parameterized Constuctor Called");
	this.id=i;
	this.name=a;
	this.salary=b;
	}

	void setID(int x){
	this.id=x;
	}
	void setName(String a){
	this.name=a;
	}
	void setSalary(double b){
	this.salary=b;
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
	
	void display(){
	System.out.println("ID is "+this.id);
	System.out.println("Name is "+this.name);
	System.out.println("Salary is "+this.salary);
	
	}
	

}//Employee class ends here

class TestEmployee{
	public static void main(String[] a){
	
	Employee e1;
	e1 = new Employee();
	e1.setID(31);
	e1.setName("Amit");
	e1.setSalary(23000);
	e1.display();

	Employee e2;
	e2 = new Employee();
	e2.setID(31);
	e2.setName("Amit");
	e2.setSalary(23000);
	e2.display();
	
	Employee e3;
	e3 = new Employee();
	e3.display();
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter id :");
	int a = nextInt();
	
	System.out.println("Enter Name :");
	String b = nextLie();
	
	System.out.println("Enter Salary :");
	double c = nextDouble();
	
	
		
	Employee e4;
	e4 = new Employee(a,b,c);
	e4.display();
	
	if(e1.salary>e2.salary){
	System.out.println("E1 has salary");
	}else{
	System.out.println("E2 has salary");
	}

	
	}//main ends here

}//testEmployee ends here

