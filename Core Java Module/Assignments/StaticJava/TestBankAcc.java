import java.util.Scanner;

class BankAcc {

	int accountNumber;
	String accountName;
	double currentBalance;
	static double interrestRate;
	
	static
	 {	
	interrestRate = 7.3;
	}
	
	
	BankAcc(){//Default constructor
	System.out.println("Default Contructor");
	this.accountNumber=123;
	this.accountName="AAA";
	this.currentBalance=10000;
	}
	
	BankAcc(int a,String b,double c){//Parameterized constructor
	System.out.println("Parameterized Contructor");
	this.accountNumber=a;
	this.accountName=b;
	this.currentBalance=c;
	}
	
	
	void setaccountNumber(int a){
	this.accountNumber=a;
	}
	void setaccountName(String b){
	this.accountName=b;
	}	
	void setcurrentBalance(double c){
	this.currentBalance=c;
	}

	static void setinterrestRate(double d){
	interrestRate=d;
	}
	
	void getaccountNumber(int a){
	this.accountNumber=a;
	}
	void getaccountName(String b){
	this.accountName=b;
	}	
	void getcurrentBalance(double c){
	this.currentBalance=c;
	}

	void getinterrestRate(double d){
	this.interrestRate=d;
	}

	
	void display(){
	System.out.println("Acc no : "+accountNumber);
	System.out.println("Acc name : "+accountName);
	System.out.println("Acc bal : "+currentBalance);
	System.out.println("Interrest rate : "+interrestRate);
	}

}//BankACC Class ends here
class TestAcc{	
	
	public static void main(String[] a){	
	
	BankAcc.setinterrestRate(777);
	
	BankAcc b1 = new BankAcc(2314, "a",324);
	b1.display();
	BankAcc b2 = new BankAcc(324, "v",324);
	b2.display();
	BankAcc b3 = new BankAcc(54, "b",234);
	b3.display();

	
}	

	
	
}