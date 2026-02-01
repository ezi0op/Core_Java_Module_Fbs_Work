class Complex{
	double real;
	double img;
	

	
	void setReal(double a){
	real=a;
	}
	void setImaginary(int b){
	img=b;
	}
		
	double getReal(){
	return this.real;
	}
	double getImg(){
	return this.img;
	}
	
	void display(){
	System.out.println("Complex Number is : "+this.real+"+ i"+this.img);
	}
	
}//Complex class ends here
class TestComplex{
	public static void main(String[] a){

	Complex c1;
	c1 = new Complex();	
	c1.setReal(12);
	c1.setImaginary(34);
	c1.display();
	
	Complex c2;
	c2 = new Complex();	
	c2.setReal(23);
	c2.setImaginary(67);
	c2.display();	
	
	Complex c3;
	c3= new Complex();
	c3.display();
	
	


			
	}//main ends here

}//testComplex class ends here