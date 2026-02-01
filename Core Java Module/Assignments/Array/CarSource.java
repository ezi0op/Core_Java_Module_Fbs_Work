import java.util.Scanner;
class Car{
	String model;
	int  price;
	String brand;
	String color;
	int fuelcapacity;
	
	Car(){//default constuctor
	System.out.println("Constructor Called");
	this.model="XUV700";
	this.price=9383;
	this.brand="Innoava";
	this.color="Black";
	this.fuelcapacity=87;
	}

	Car(String l,int m,String n,String o,int p){//default constuctor
	System.out.println("Constructor Called");
	this.model=l;
	this.price=m;
	this.brand=n;
	this.color=o;
	this.fuelcapacity=p;
	}

	

	void setModel(String a){
	model=a;
	}
	void setPrice(int b){
	price=b;
	}
	void setBrand(String s){
	brand=s;
	}
	void setColor(String c){
	color=c;
	}
	void setFuelCapacity(int d){	
	fuelcapacity=d;
	}
	String getModel(){
	return this.model;
	}
	int getPrice(){
	return this.price;
	}
	String getBrand(){
	return this.brand;
	}
	String getColor(){
	return this.color;	
	}
	int getFuelCapacity(){	
	return this.fuelcapacity;
	}
	void display(){
	System.out.println("Model is "+this.model);
	System.out.println("Price is "+this.price);
	System.out.println("Brand is "+this.brand);
	System.out.println("Color is "+this.color);
	System.out.println("Fuelcapacity is "+this.fuelcapacity);
	}


}//car ends here
class TestCar{
	public static void main(String[] a){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Model :");
	String x = sc.nextLine();
	
	System.out.println("Enter Price :");
	int y = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Enter Brand :");
	String z = sc.nextLine();
	
	System.out.println("Enter color :");
	String i = sc.nextLine();
	
	System.out.println("Enter fuelCapacity :");
	int k = sc.nextInt();

	
	Car[] arr=new Car[2];
	arr[0] = new Car();
	arr[1] = new Car(x,y,z,i,k);
	

	for(int j=0;j<arr.length;j++){
	arr[j].display();
	}
	
	
	}//main ends here

}//testCar ends here