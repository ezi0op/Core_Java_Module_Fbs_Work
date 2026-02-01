import java.util.Scanner;
class Product{
	int productid;
	String pname;
	int price;
	int quantity;
	
	Product(){//Default Constuctor
	System.out.println("Constuctor Called");
	this.productid=324;
	this.pname="Ideal";
	this.price=234234;
	this.quantity=234;
	}

	
	Product(int i,String p,int a,int q){//Parameterized Constuctor
	System.out.println("Parameterized Constuctor Called");
	this.productid=i;
	this.pname=p;
	this.price=a;
	this.quantity=q;
	}


	void setProductid(int a){
	productid=a;
	}
	void setPName(String b){
	pname=b;
	}
	void setPrice(int c){
	price=c;
	}
	void setQuantity(int d){
	quantity=d;
	}

	int getProductid(){
	return this.productid;
	}
	String getPname(){
	return this.pname;
	}
	int getPrice(){
	return this.price;
	}
	int getQuantity(){
	return this.quantity;
	}
	
	void display(){	
	System.out.println("Product id is"+this.productid);
	System.out.println("Product name is"+this.pname);
	System.out.println("Product price is"+this.price);
	System.out.println("Product Quantity is"+this.quantity);
	}

}//Product class ends here
class TestProduct{
	public static void main(String[] a){

	Product p1;
	p1 = new Product();
	p1.setProductid(12);
	p1.setPName("Amit");
	p1.setPrice(23234);
	p1.setQuantity(234);
	p1.display();

	Product p2;
	p2 = new Product();
	p2.setProductid(12);
	p2.setPName("Amit");
	p2.setPrice(23234);
	p2.setQuantity(234);
	p2.display();
	
	Product p3;
	p3 = new Product();
	p3.display();
	

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter id :");
	int a = nextInt();
	
	System.out.println("Enter Name :");
	String b = nextLie();
	
	System.out.println("Enter Price :");
	int c = nextInt();

	System.out.println("Enter Quantity :");
	int d = nextInt();
	
	Product p4;
	p4 = new Product(a,b,c,d);
	p4.display();

	if(p1.price>p2.price){
	System.out.println("P1 has higher price");
	}else{
	System.out.println("P2 has higher price");
	}

	}//main ends here

}//testProduct class ends here