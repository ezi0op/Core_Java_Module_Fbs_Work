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
		
	Book(int a,String b,String c,double d){//Parameterized constuctor
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
	double getPrice(){
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


	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter ISBN :");
	int p = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Enter Name :");
	String q = sc.nextLine();
	
	System.out.println("Enter Category :");
	String r = sc.nextLine();

	System.out.println("Enter Price :");
	double t = sc.nextDouble();

	
	Book arr[]= new Book[2];
	arr[0]=new Book();
	arr[1] = new Book(p,q,r,t);	

	for(int i=0;i<arr.length;i++){
	arr[i].display();	
	}
	}


}//testBook ends here