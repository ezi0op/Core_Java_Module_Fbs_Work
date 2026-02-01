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

	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter id :");
	int l = sc.nextInt();
	sc.nextLine();

	System.out.println("Enter Name :");
	String m = sc.nextLine();
	
	System.out.println("Enter Salary :");
	double n = sc.nextDouble();	
		
	System.out.println("Enter Commision :");
	double o = sc.nextDouble();

	Hr arr[]= new Hr[2];
	arr[0]=new Hr();
	arr[1] = new Hr(l,m,n,o);
	
	for(int i=0;i<arr.length;i++){
	arr[0].display();
	arr[1].display();
	
	}
	
	
	}//main ends here	
}//testHr class ends here