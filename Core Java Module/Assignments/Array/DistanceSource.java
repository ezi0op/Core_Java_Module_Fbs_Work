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

	Scanner sc = new Scanner(System.in); 	
	
	System.out.println("Enter KM :"); 
	double r = sc.nextDouble(); 
	
	System.out.println("Enter M :"); 
	double i = sc.nextDouble();
	
	Distance[] d= new Distance[2];

	d[0]= new Distance();
	d[1]= new Distance(i,r);

	for(int j=0;j<d.length;j++){
	d[j].display();
	}

	}//main ends here	

}//testDistance ends here