class TaxiFare{

	String customerName;
	static double baseFare;
	static double ratePerKm;
	double distanceTravelled;
		
	static 
	{
	baseFare=48;
	ratePerKm=7;
	}
	
	double calculateFare(){	
	return baseFare + (distanceTravelled * ratePerKm);
	}
	
	TaxiFare(){//Default Constructor
	System.out.println("Default Constructor");
	this.customerName="AAA";
	this.distanceTravelled=00;
	}
	TaxiFare(String a,double b){//Parameterized Constructor
	System.out.println("Parameterized Constructor");
	this.customerName=a;
	this.distanceTravelled=b;
	}	
	
	void setcustomerName(String a){
	this.customerName=a;
	}
	static void setbaseFare(double b){
	baseFare=b;
	}
	static void setratePerKm(double c){
	ratePerKm=c;
	}
	void setdistanceTravelled(double d){
	this.distanceTravelled=d;
	}
	
	String getcustomerName(){
	return this.customerName;
	}
	double getbaseFare(){
	return this.baseFare;
	}
	double getratePerKm(){
	return this.ratePerKm;
	}
	double getdistanceTravelled(){
	return this.distanceTravelled;
	}

	void display(){	
	System.out.println("Customer Name : "+this.customerName);
	System.out.println("Cab baseFare : "+this.baseFare);
	System.out.println("Cab ratePerKm : "+this.ratePerKm);
	System.out.println("Total fare :"+calculateFare());
	}	
}

class TestTaxi{
	
	public static void main(String[] a){	
	
	TaxiFare.setbaseFare(5);
	TaxiFare.setratePerKm(6);
	
	TaxiFare[] t = new TaxiFare[2];
	t[0] = new TaxiFare();
	t[1] = new TaxiFare("Amit",3);

	for(int i=0;i<t.length;i++){
	t[i].display();
	}
	
	}		
}

















