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
	
	

}//Book class ends here
class testBook{
	public static void main(String[] a){
	Book b1;
	b1 = new Book();
	b1.setISBN(12);
	b1.setBName("Amit");
	b1.setCategory("Action");
	b1.setPrice(2435);
	System.out.println("Book Details : ISBN "+b1.ISBN+"BName :"+b1.bname+" Category :"+b1.category+" Price :"+b1.price);
	}//main ends here

}//testBook ends here