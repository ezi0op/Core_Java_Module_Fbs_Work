class Employee{

	int id;
	String name;
	double salary;
	void setID(int x){
	this.id=x;
	}
	void setName(String a){
	this.name=a;
	}
	void setSalary(double b){
	this.salary=b;
	}


}//Employee class ends here

class testEmployee{
	public static void main(String[] a){
	
	Employee e1;
	e1 = new Employee();
	e1.setID(31);
	e1.setName("Amit");
	e1.setSalary(23000);
	System.out.println("Employee Details: ID "+e1.id+"Name"+e1.name+"Salary :"+e1.salary);


	
	}//main ends here

}//testEmployee ends here

