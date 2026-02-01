class Product{
	int productid;
	String pname;
	int price;
	int quantity;

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

}//Product class ends here
class testProduct{
	public static void main(String[] a){
	Product p1;
	p1 = new Product();
	p1.setProductid(12);
	p1.setPName("Amit");
	p1.setPrice(23234);
	p1.setQuantity(234);
	System.out.println("Student Details : Productid "+p1.productid+" PName :"+p1.pname+" Price :"+p1.price+" Quantity :"+p1.quantity);
	}//main ends here

}//testProduct class ends here