class SalesManager{
	int id;
	String name;
	double salary;
	float incentive;
	int target;
	void setID(int a){
	id = a;
	}
	void setName(String b){	
	name=b;
	}
	void setSalary(double c){
	salary=c;
	}
	void setIncentive(float d){
	incentive=d;
	}
	void setTarget(int e){
	target=e;
	}
}//SalesManager class ends here
class testSalesManager{
	public static void main(String[] a){
	SalesManager s1;
	s1=new SalesManager();
	s1.setID(12);
	s1.setName("Jay");
	s1.setSalary(342.45);
	s1.setTarget(12);
	System.out.println("SalesManager Details :Id"+s1.id+"Name :"+s1.name+"Salary :"
	+s1.salary+"Incentive :"+s1.incentive+"Target :"+s1.target);

	}//main ends here	
}//testSalesManager class ends here