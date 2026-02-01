class  Admin{
	
	int id;
	String name;
	double salary;
	int allowance;
	
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
	}//main ends here
}//testAdmin class ends here