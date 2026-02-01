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

	Admin(int l,String m,double n,int o){//parameterized constuctor
	System.out.println("Parameter Constuctor Called");
	this.id=l;
	this.name=m;
	this.salary=n;
	this.allowance=o;
	}


	
	void setID(int x){
	id = x;
	}
	void setName(String s){
	name=s;
	}
	void setSalary(double z){
	salary=z;	
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

	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter Id :");
	int f = sc.nextInt();
	sc.nextLine();	

	System.out.println("Enter Name :");
	String b = sc.nextLine();	
	
	System.out.println("Enter Salary :");	
	double c = sc.nextDouble();
	
	System.out.println("Enter Allowance :");
	int d = sc.nextInt();	
	

	Admin arr[]= new Admin[2];
	arr[0]=new Admin();
	arr[1] = new Admin(f,b,c,d);	
	
	
	for(int i=0;i<arr.length;i++){
	arr[i].display();	
	}
		

	}//main ends here
}//testAdmin class ends here