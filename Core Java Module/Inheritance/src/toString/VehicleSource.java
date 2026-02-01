package toString;

class Vehicle {

	String brand;
	String model;
	int year;
	String color;
	double speed;

	Vehicle() {
		super();
		System.out.println("Default constructor");
		this.brand = "Not Given";
		this.model = "Not Given";
		this.year = 00;
		this.color = "Not Given";
		this.speed = 00;
	}// Default constructor

	Vehicle(String brand, String model, int year, String color, double speed) {
		super();
		System.out.println("Parameterized constructor");
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.speed = speed;
	}// Parameterized constructor

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	double getSpeed() {
		return speed;
	}

	void setSpeed(double speed) {
		this.speed = speed;
	}

	void brake() {
		System.out.println("Vehicle is stopped");
	}

	@Override
	public String toString() {
		return "Vehicle Brand is " + this.brand + "\nVehicle Model is " + this.model + "\nVehicle Year is " + this.year
				+ "\nVehicle Color is " + this.color + "\nVehicle Speed is " + this.speed;
	}

//	void display() {
//		System.out.println("Vehicle Brand is " + this.brand);
//		System.out.println("Vehicle Model is " + this.model);
//		System.out.println("Vehicle Year is " + this.year);
//		System.out.println("Vehicle Color is " + this.color);
//		System.out.println("Vehicle Speed is " + this.speed);
//	}

}// Vehicle class ends here

class Car extends Vehicle {
	int noOfDoors;
	String fuelType;

	Car() {
		super();
		System.out.println("Default constructor");
		this.noOfDoors = 00;
		this.fuelType = "Not Given";
	}// Default constructor

	Car(String brand, String model, int year, String color, double speed, int noOfDoors, String fuelType) {
		super(brand, model, year, color, speed);
		System.out.println("Parameterized constructor");
		this.noOfDoors = noOfDoors;
		this.fuelType = fuelType;
	}// paramterised constructor

	int getNoOfDoors() {
		return noOfDoors;
	}

	void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	String getFuelType() {
		return fuelType;
	}

	void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	void brake() {
		System.out.println("Car is stopped");
	}

	@Override
	public String toString() {
		return super.toString() + "\nCar noOfDoors is " + this.noOfDoors + "\nCar fuelType is " + this.fuelType;
	}
//	void display() {
//		super.display();
//		System.out.println("Car noOfDoors is " + this.noOfDoors);
//		System.out.println("Car fuelType is " + this.fuelType);
//	}

}// Car class ends here

class Truck extends Vehicle {
	int loadCapacity;
	int noOfAxles;

	Truck() {
		super();
		System.out.println("Parameterized constructor");
		this.loadCapacity = 00;
		this.noOfAxles = 00;
	}

	Truck(String brand, String model, int year, String color, double speed, int loadCapacity, int noOfAxles) {
		super(brand, model, year, color, speed);
		System.out.println("Parameterized constructor");
		this.loadCapacity = loadCapacity;
		this.noOfAxles = noOfAxles;
	}

	int getLoadCapacity() {
		return loadCapacity;
	}

	void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	int getNoOfAxles() {
		return noOfAxles;
	}

	void setNoOfAxles(int noOfAxles) {
		this.noOfAxles = noOfAxles;

	}

	void brake() {
		System.out.println("Truck is stopped");
	}

	@Override
	public String toString() {
		return super.toString() + "\nTruck  loadCapacity is " + this.loadCapacity + "\nTruck  noOfAxles is "
				+ this.noOfAxles;
	}
//	void display() {
//		super.display();
//		System.out.println("Truck  loadCapacity is " + this.loadCapacity);
//		System.out.println("Truck  noOfAxles is " + this.noOfAxles);
//	}
}// Truck class ends here

class TestVehicle {
	public static void main(String[] args) {
		Vehicle a1 = new Vehicle();
		a1.brake();
		System.out.println(a1);
		System.out.println("\n\n");
		Car b1 = new Car("Volvo", "XC60", 2004, "Yellow", 4, 67, "Diesel");
		b1.brake();
		System.out.println(b1);
		System.out.println("\n\n");
		Truck t1 = new Truck("Tesla", "Roadster", 2025, "Red", 5, 324, 4);
		t1.brake();
		System.out.println(t1);
	}
}
