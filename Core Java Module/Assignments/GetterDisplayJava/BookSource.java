class Book{
	int ISBN;
	String bname;
	String category;
	int price;

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

	if(b1.getPrice()>b2.getPrice()){
	System.out.println("B1 has Higher Price");
	}else{
	System.out.println("B2 has Higher Price");
	}
	}//main ends here

}//testBook ends here