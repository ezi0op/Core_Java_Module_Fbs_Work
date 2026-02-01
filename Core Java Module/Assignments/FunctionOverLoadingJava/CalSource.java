class Calculator{	
	
	
	void add(int a,int b){
	System.out.println("Function 1");
	System.out.println(a+b);
	}	
	void add(double a,double c){
	System.out.println("Function 2");
	System.out.println(a+c);
	}
	
	void add(double a,int b){
	System.out.println("Function 3");
	System.out.println(a+b);
	}
	
	void add(int a,double b){
	System.out.println("Function 4");
	System.out.println(a+b);
	}
	
	void add(float a ,double b){
	System.out.println("Function 5");
	System.out.println(a+b);
	}
	
	void add(double a ,float b){
	System.out.println("Function 6");
	System.out.println(a+b);
	}
	
	void add(float a ,float b){
	System.out.println("Function 7");
	System.out.println(a+b);
	}
	
	void sub(int a,int b){
	System.out.println("Function 1");
	System.out.println(a-b);
	}	
	void sub(double a,double c){
	System.out.println("Function 2");
	System.out.println(a-c);
	}
	
	void sub(double a,int b){
	System.out.println("Function 3");
	System.out.println(a-b);
	}
	
	void sub(int a,double b){
	System.out.println("Function 4");
	System.out.println(a-b);
	}
	
	void sub(float a ,double b){
	System.out.println("Function 5");
	System.out.println(a-b);
	}
	
	void sub(double a ,float b){
	System.out.println("Function 6");
	System.out.println(a-b);
	}
	
	void sub(float a ,float b){
	System.out.println("Function 7");
	System.out.println(a-b);
	}

	
	void mul(int a,int b){
	System.out.println("Function 1");
	System.out.println(a*b);
	}	
	void mul(double a,double c){
	System.out.println("Function 2");
	System.out.println(a*c);
	}
	
	void mul(double a,int b){
	System.out.println("Function 3");
	System.out.println(a*b);
	}
	
	void mul(int a,double b){
	System.out.println("Function 4");
	System.out.println(a*b);
	}
	
	void mul(float a ,double b){
	System.out.println("Function 5");
	System.out.println(a*b);
	}

	void mul(double a ,float b){
	System.out.println("Function 6");
	System.out.println(a*b);
	}
	
	void mul(float a ,float b){
	System.out.println("Function 7");
	System.out.println(a*b);
	}
	
	void div(int a,int b){
	System.out.println("Function 1");
	System.out.println(a/b);
	}	
	void div(double a,double c){
	System.out.println("Function 2");
	System.out.println(a/c);
	}
	
	void div(double a,int b){
	System.out.println("Function 3");
	System.out.println(a/b);
	}
	
	void div(int a,double b){
	System.out.println("Function 4");
	System.out.println(a/b);
	}
	
	void div(float a ,double b){
	System.out.println("Function 5");
	System.out.println(a/b);
	}
	
	void div(double a ,float b){
	System.out.println("Function 6");
	System.out.println(a/b);
	}
	
	void div(float a ,float b){
	System.out.println("Function 7");
	System.out.println(a/b);
	}

	
}//Calculator class ends here
class Test{
		
	public static void main(String[] a){
	
	Calculator c1;
	c1 = new Calculator();
	int i = 7;
	double b = 12.4;
	float x = 10.498f;
	c1.add(i,i);
	c1.add(b,b);
	c1.add(b,i);
	c1.add(i,b);
	c1.add(x,b);
	c1.add(b,x);
	c1.add(x,x);
	
	c1.sub(i,i);
	c1.sub(b,b);
	c1.sub(b,i);
	c1.sub(i,b);
	c1.sub(x,b);
	c1.sub(b,x);
	c1.sub(x,x);	
	
	c1.mul(i,i);
	c1.mul(b,b);
	c1.mul(b,i);
	c1.mul(i,b);
	c1.mul(x,b);
	c1.mul(b,x);
	c1.mul(x,x);	
	
	

	c1.div(i,i);
	c1.div(b,b);
	c1.div(b,i);
	c1.div(i,b);
	c1.div(x,b);
	c1.div(b,x);
	c1.div(x,x);	
	
	
	}//main ends here	
	
	
}//Test class ends here