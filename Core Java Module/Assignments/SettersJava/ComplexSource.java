class Complex{
	double real;
	double img;
	void setReal(double a){
	real=a;
	}
	void setImaginary(int b){
	img=b;
	}
}//Complex class ends here
class testComplex{
	public static void main(String[] a){
	Complex c1;
	c1 = new Complex();	
	c1.setReal(12);
	c1.setImaginary(34);
	System.out.println("Complex Number  : "+c1.real+"+ i"+c1.img);
	}//main ends here

}//testComplex class ends here