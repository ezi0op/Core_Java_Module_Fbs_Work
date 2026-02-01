class Shape{	
	
	
	void area(double b,double h){	
	System.out.println("Area of triangle"+0.5*b*h);
	}
	void area(int a,double b){	
	System.out.println("Area of Reactangle"+a*b);
	}
	void area(double a){
	System.out.println("Area of Circle"+3.14*a*a);
	}
	
}

class TestShape{

	
	public static void main(String[] a){

	Shape s1;
	s1= new Shape();
	
	int z = 5;
	double b = 3.45;	

	s1.area(b,b);
	s1.area(z,b);
	s1.area(b);
	
	
	}		

	
	
}