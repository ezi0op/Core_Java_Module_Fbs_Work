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
}//Admin class ends here
class testAdmin{
	public static void main(String[] a){	
	Admin a1;
	a1= new Admin();
	a1.setID(11);
	a1.setName("Amit");
	a1.setSalary(5637);
	a1.setAllowance(4325);
	System.out.println("Admin details are : ID"+a1.id+"Name :"+a1.name+"Salary :"+a1.salary+"Allowance :"+a1.allowance);
	}//main ends here
}//testAdmin class ends here