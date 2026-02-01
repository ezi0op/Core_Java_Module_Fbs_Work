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
	
}//Hr class ends here
class testHr{
	public static void main(String[] a){
	Hr h1;
	h1=new Hr();
	h1.setId(12);
	h1.setName("Amit");
	h1.setSalary(1231.023);
	h1.setCommission(342234);
	System.out.println("Hr details : ID"+h1.id+"Name :"+h1.name+"Salary"+h1.salary+"Commision"+h1.commission);
	}//main ends here	
}//testHr class ends here