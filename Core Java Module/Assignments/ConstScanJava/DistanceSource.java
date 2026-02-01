import java.util.Scanner;
class Distance{
	double km;
	double m;
	
	Distance(){//default constuctor
	System.out.println("Constuctor Called");
	this.km=45;
	this.m=3;
	}
	
	Distance(double k,double m){//Parameterized constuctor
	System.out.println("Parameterized Constuctor Called");
	this.km=k;
	this.m=m;
	}

	void setKm(int a){
	km=a;
	}
	void setM(int b){
	m=b;
	}
	
	double getKM(){
	return this.km;
	}
	double getM(){
	return this.m;
	}
	
	void display(){
	System.out.println("KM are "+this.km);
	System.out.println("M are "+this.m);
	}
	
}//Distance class ends here
class TestDistance{
	public static void main(String[] a){

	Distance d1;
	d1 = new Distance();	
	d1.setKm(12);
	d1.setM(34);
	d1.display();

	
	Distance d2;
	d2 = new Distance();	
	d2.setKm(12);
	d2.setM(34);
	d2.display();
	
	Distance d3;
	d3= new Distance();
	d3.display();

	Scanner sc = new Scanner(System.in); 	
	
	System.out.println("Enter km No :"); 
	double r = sc.nextDouble(); 
	
	System.out.println("Enter m No :"); 
	double i = sc.nextDouble();
	
	Distance d4;
	d4= new Distance(r,i);
	d4.display();
	
	if(d1.getKM()>d2.getKM()){
	System.out.println("D1 has higher km");
	}else{
	System.out.println("D2 has higher km");
	}
	}//main ends here	

}//testDistance ends here