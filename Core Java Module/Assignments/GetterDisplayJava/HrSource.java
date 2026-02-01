class Hr{
	int id;
	String name;
	double salary;
	double commission;


	
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
		
	
	
	if(h1.salary>h2.salary){
	System.out.println("H1 has highest Salary");
	}else{
	System.out.println("H2 has highest Salary");
	}
	
	}//main ends here	
}//testHr class ends here