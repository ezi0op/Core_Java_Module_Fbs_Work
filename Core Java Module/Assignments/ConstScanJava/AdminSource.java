import java.util.Scanner;
class  Admin{
	
	int id;
	String name;
	double salary;
	int allowance;
	
	Admin(){//default constuctor
	System.out.println("Constuctor Called");
	this.id=45;
	this.name="Ajay";
	this.salary=23424;
	this.allowance=324;
	}

	Admin(int a,String b,double s,int c){//parameterized constuctor
	System.out.println("Parameter Constuctor Called");
	this.id=a;
	this.name=b;
	this.salary=s;
	this.allowance=c;
	}


	
	void setID(int x){
	id = x;
	}
	void setName(String s){
	name=s;
	}
	void setSalary(double a){
	salary=a;	
	}
	void setAllowance(int b){	
	allowance=b;
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
	int getAllowance(){
	return this.allowance;
	}

	void display(){
	System.out.println("ID is "+this.id);
	System.out.println("Name is "+this.name);
	System.out.println("Salary is "+this.salary);
	System.out.println("Allowance is "+this.allowance);
	}
}//Admin class ends here
class TestAdmin{
	public static void main(String[] a){	
	Admin a1;
	a1= new Admin();
	a1.setID(11);
	a1.setName("Amit");
	a1.setSalary(5637);
	a1.setAllowance(4325);
	a1.display();
	
	Admin  a2;
	a2 = new Admin();
	a2.display();


	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter Id :");
	int a = nextInt();
	
	System.out.println("Enter Name :");
	String b = nextLine();	
	
	System.out.println("Enter Salary :");	
	double c = nextDouble();
	
	System.out.println("Enter Allowance :");
	int d = nextInt();	
	

	Admin a3;
	a3= new Admin(a,b,c,d);
	a3.display();		

	}//main ends here
}//testAdmin class ends here