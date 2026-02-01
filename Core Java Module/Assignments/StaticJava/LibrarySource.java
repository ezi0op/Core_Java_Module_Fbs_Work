class Library{
	
	String name;
	String bname;
	double price;
	int daysLate;
	static double finePerDay;
		
	static
	{
	finePerDay=45;
	}
	
	double calculateFine(){
	return daysLate*finePerDay;
	}
	
	Library(){//default construtor	
	System.out.println("Default Constructor");
	this.name="AAA";
	this.bname="BBB";
	this.price=000;
	this.daysLate=00;
	}
	Library(String a,String b,double c,int d){//Parameterised construtor	
	System.out.println("Parameterised Constructor");
	this.name=a;
	this.bname=b;
	this.price=c;
	this.daysLate=d;
	}

	
	void setName(String a){
	this.name=a;
	}
	void setBname(String b){
	this.bname=b;
	}
	void setPrice(double c){
	this.price=c;
	}
	void setDaysLate(int d){
	this.daysLate=d;
	}
	static void setFinePerday(double e){
	finePerDay=e;
	}
	String getName(){
	return this.name;
	}
	String getBname(){
	return this.bname;
	}
	double getPrice(){
	return this.price;
	}
	int getDaysLate(){
	return this.daysLate;
	}
	double getFinePerday(){
	return this.finePerDay;
	}
	
	void display(){
	System.out.println("Lib UserName :"+this.name);
	System.out.println("Lib BookName :"+this.bname);
	System.out.println("Lib BookPrice :"+this.price);
	System.out.println("Lib Book DaysLate :"+this.daysLate);
	System.out.println("Lib FinePerDay :"+calculateFine());	
	}	
}

class TestLibrary{	
	
	public static void main(String[] args){	
	
	Library.setFinePerday(5);	

	Library l= new Library("sdfg","Action",45,34);
	l.display();
	
	
	}	
	
	
	
}














