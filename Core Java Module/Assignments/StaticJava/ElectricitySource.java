import java.util.Scanner;
class ElectricityBill {
	int custId;
	String custName;
	int homeNo;
	double unitNo;
	static double ratePerUnit;
	
	static
	{
	ratePerUnit = 35.5;
	}
		
	ElectricityBill(){//default constructor
	System.out.println("Default Constuctor");
	this.custId=00;
	this.custName="NNNN";
	this.unitNo=00;
	}

	ElectricityBill(int a,String b,int c,double d){//Parameterized constructor
	System.out.println("Parameterized Constuctor");
	this.custId=a;
	this.custName=b;
	this.homeNo=c;
	this.unitNo=d;
	}
	
	
	void setcustId(int a){
		this.custId=a;
	}   
	void setcustName(String b){
		this.custName=b;
	} 
	void sethomeNo(int c){
		this.homeNo=c;
	} 
	void setUnitNo(double d){
		this.unitNo=d;
	} 
	static void setRatePerUnit(double e){
		ratePerUnit=e;
	} 

	int getcustId(){
		return custId;
	}   
	String getcustName(){
		return custName;
	} 
	int gethomeNo(){
		return homeNo;
	} 
	double getUnitNo(){
		return unitNo;
	} 
	double getRatePerUnit(){
		return ratePerUnit;
	} 
       
	void display(){	
	System.out.println("Customer ID : "+this.custId);
	System.out.println("Customer Name : "+this.custName);
	System.out.println("Customer HomeNo : "+this.homeNo);
	System.out.println("Electricity UnitNo : "+this.unitNo);
	System.out.println("Electricity RatePerUnit : "+this.ratePerUnit);
	}
	
}
class TestElectricity{
	
	public static void main(String[] args){
	
	//Scanner sc = new Scanner(System.in);
	
	//System.out.println("Enter Customer ID : ");
	//int p = sc.nextInt();
	//sc.nextLine();

	//System.out.println("Enter Customer Name : ");
	//String q = sc.nextLine();

	//System.out.println("Enter Customer HomeNo : ");
	//int r = sc.nextInt();
	
	//System.out.println("Enter Electricity UnitNo : ");
	//double s = sc.nextDouble();

	


	
	
	//ElectricityBill[] b= new ElectricityBill[2];
	//b[0] = new ElectricityBill();
	//b[1] = new ElectricityBill(p,q,r,s);
	
	//for(int i=0;i<b.length;i++){
	//	b[i].display();
	//}
	
	ElectricityBill.setRatePerUnit(77);	
	
	ElectricityBill b1=new ElectricityBill(324,"Amit",234,324);
	ElectricityBill b2=new ElectricityBill(308,"Jay",111,34.4);
	b1.display();
	b2.display();
	
	}		
	
	
}