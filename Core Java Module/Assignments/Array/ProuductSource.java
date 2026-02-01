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
	

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter id :");
	int z= sc.nextInt();
	sc.nextLine();
	
	System.out.println("Enter Name :");
	String b = sc.nextLine();
	
	System.out.println("Enter Price :");
	int c = sc.nextInt();

	System.out.println("Enter Quantity :");
	int d = sc.nextInt();
	
	Product[] p= new Product[2];
	p[0]= new Product();
	p[1]= new Product(z,b,c,d);
	
	for(int i=0;i<p.length;i++){	
	p[i].display();
	}
	

	}//main ends here

}//testProduct class ends here