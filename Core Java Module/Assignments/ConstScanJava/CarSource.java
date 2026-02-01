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
	
	
	Car c1;
	c1 = new Car();
	c1.setModel("XC90");
	c1.setPrice(34523);
	c1.setBrand("Volvo");
	c1.setColor("Yellow");
	c1.setFuelCapacity(4);
	c1.display();
	
	Car c2;
	c2 = new Car();
	c2.setModel("XC80");
	c2.setPrice(34233);
	c2.setBrand("Volkswagen");
	c2.setColor("White");
	c2.setFuelCapacity(6);
	c2.display();
	
	System.out.println("Enter Model :");
	String a = sc.nextLine();
	
	System.out.println("Enter Price :");
	int b = sc.nextInt();
	
	System.out.println("Enter Brand :")
	String c = sc.nextLine();
	
	System.out.println("Enter color :");
	String d = sc.nextLine();
	
	System.out.println("Enter fuelCapacity :");
	int e = sc.nextInt();

	
	Car c3;
	c3=new Car(a,b,c,d,e);
	c3.display();


	if(c1.getPrice()>c2.getPrice()){
	System.out.println("C1 has higher price");
	}else{
	System.out.println("C2 has higher price");
	}
	
	}//main ends here

}//testCar ends here