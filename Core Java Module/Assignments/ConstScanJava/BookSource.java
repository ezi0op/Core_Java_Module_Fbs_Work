import java.util.Scanner;

class Book{
	int ISBN;
	String bname;
	String category;
	double price;
		
	Book(){//default constuctor
	System.out.println("Constuctor Called");
	this.ISBN=45;
	this.bname="Alloy";
	this.category="Fiction";
	this.price=234;
	}
		
	Book(int a,String b,String c,int d){//Parameterized constuctor
	System.out.println("Parameterized Constuctor Called");
	this.ISBN=a;
	this.bname=b;
	this.category=c;
	this.price=d;
	}

	
	void setISBN(int a){
	ISBN=a;
	}
	void setBName(String b){
	bname=b;
	}
	void setCategory(String s){
	category=s;
	}
	void setPrice(int c){
	price=c;
	}
	int getISBN(){
	return this.ISBN;	
	}
	String getBname(){
	return this.bname;
	}
	String getCategory(){
	return this.category;
	}
	int getPrice(){
	return this.price;
	}
	void display(){
	System.out.println("ISBN is "+this.ISBN);
	System.out.println("Name is "+this.bname);
	System.out.println("Category is "+this.category);
	System.out.println("Price is "+this.price);
	}

}//Book class ends here
class TestBook{
	public static void main(String[] a){

	Book b1;
	b1 = new Book();
	b1.setISBN(12);
	b1.setBName("Amit");
	b1.setCategory("Action");
	b1.setPrice(2435);
	b1.display();

	Book b2;
	b2 = new Book();
	b2.setISBN(18);
	b2.setBName("Anna");
	b2.setCategory("Drama");
	b2.setPrice(4234);
	b2.display();	
	
	Book b3;
	b3 = new Book();
	b3.display();

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter ISBN :");
	int a = nextInt();
	
	System.out.println("Enter Name :");
	String b = nextLine();
	
	System.out.println("Enter Category :");
	String c = nextLine();

	System.out.println("Enter Price :");
	double d = nextDouble();

	
	Book b4;
	b4 = new Book(a,b,c,d);
	b3.display();	
		
	if(b1.getPrice()>b2.getPrice()){
	System.out.println("B1 has Higher Price");
	}else{
	System.out.println("B2 has Higher Price");
	}
	}//main ends here

}//testBook ends here