import java.util.Scanner;
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
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter id :");
	int k = sc.nextInt();
	sc.nextLine();

	System.out.println("Enter Name :");
	String m = sc.nextLine();
	
	System.out.println("Enter Salary :");
	double n = sc.nextDouble();
	
	
		
	
	Employee arr[]= new Employee[2];
	arr[0]=new Employee();
	arr[1] = new Employee(k,m,n);
	
	for(int i=0;i<arr.length;i++){
	arr[0].display();
	arr[1].display();
	
	}

	
	}//main ends here

}//testEmployee ends here

