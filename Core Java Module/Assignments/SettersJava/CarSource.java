class Car{
	String model;
	int  price;
	String brand;
	String colour;
	int fuelcapacity;

	void setModel(String a){
	model=a;
	}
	void setPrice(int b){
	price=b;
	}
	void setBrand(String s){
	brand=s;
	}
	void setColour(String c){
	colour=c;
	}
	void setFuelCapacity(int d){	
	fuelcapacity=d;
	}

}//car ends here
class testCar{
	public static void main(String[] a){
	Car c1;
	c1 = new Car();
	c1.setModel("XC90");
	c1.setPrice(34523);
	c1.setBrand("Volvo");
	c1.setColour("Yellow");
	c1.setFuelCapacity(4);
	System.out.println("Car Details : Model "+c1.model+"Price :"+c1.price+" Brand :"+c1.brand+" Colour :"+c1.colour+" Fuel Capacity :"+c1.fuelcapacity);
	}//main ends here

}//testCar ends here