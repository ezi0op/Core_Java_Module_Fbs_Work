import java.util.Scanner;

class BankAccount {

	int accountNumber;
	String accountName;
	double currentBalance;
	double interrestRate;
	
	
	BankAccount(){//Default constructor
	System.out.println("Default Contructor");
	this.accountNumber=123;
	this.accountName="AAA";
	this.currentBalance=10000;
	this.interrestRate=12.5;
	}
	
	BankAccount(int a,String b,double c,double d){//Parameterized constructor
	System.out.println("Parameterized Contructor");
	this.accountNumber=a;
	this.accountName=b;
	this.currentBalance=c;
	this.interrestRate=d;
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

	void setinterrestRate(double d){
	this.interrestRate=d;
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
	
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Enter Acc No :");
	int x = sc.nextInt();
	sc.nextLine();

	System.out.println("Enter Acc Name :");
	String b = sc.nextLine();
		
	System.out.println("Enter Acc Bal :");
	double c = sc.nextDouble();
	
	System.out.println("Enter Acc Rate :");
	double d = sc.nextDouble();
	
	BankAccount b1 = new BankAccount(x, b,c, d);
	b1.display();
}	
	
	
}