package polymorphism;

class Device {
	String brand;
	int power;
	double warrantyPeriod;

	Device() {
		System.out.println("Default constructor");
		this.brand = "Not Given";
		this.power = 00;
		this.warrantyPeriod = 00;
	}// Default constructor

	Device(String brand, int power, double warrantyPeriod) {
		System.out.println("Parameterized constructor");
		this.brand = brand;
		this.power = power;
		this.warrantyPeriod = warrantyPeriod;
	}// Parameterized constructor

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	int getPower() {
		return power;
	}

	void setPower(int power) {
		this.power = power;
	}

	double getWarrantyPeriod() {
		return warrantyPeriod;
	}

	void setWarrantyPeriod(double warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}
	void charge() {
		System.out.println("Charges the Phone");
	}

	void display() {
		System.out.println("Brand is " + this.brand);
		System.out.println("Power is " + this.power);
		System.out.println("WarrantyPeriod is " + this.warrantyPeriod);
	}
}

class Laptop extends Device {
	int ram;
	double storage;
	String processor;

	Laptop() {
		super();
		System.out.println("Default constructor");
		this.ram = 00;
		this.storage = 00;
		this.processor = "Not Given";
	}// Default constructor

	Laptop(String brand, int power, double warrantyPeriod, int ram, double storage, String processor) {
		super(brand, power, warrantyPeriod);
		System.out.println("Parameterized constructor");
		this.ram = ram;
		this.storage = storage;
		this.processor = processor;
	}// Parameterized constructor

	int getRam() {
		return ram;
	}

	void setRam(int ram) {
		this.ram = ram;
	}

	double getStorage() {
		return storage;
	}

	void setStorage(double storage) {
		this.storage = storage;
	}

	String getProcessor() {
		return processor;
	}

	void setProcessor(String processor) {
		this.processor = processor;
	}
	void charge() {
		System.out.println("Boots operating system, lights up keyboard");
	}


	void display() {
		super.display();
		System.out.println("Ram is " + this.ram);
		System.out.println("Storage is " + this.storage);
		System.out.println("Processor is " + this.processor);
	}

}// Laptop ends here

class MobilePhone extends Device {
	int screenSize;
	int batteryCapacity;
	int cameraMP;

	MobilePhone() {
		super();
		System.out.println("Default constructor");
		this.screenSize = 00;
		this.batteryCapacity = 00;
		this.cameraMP = 00;
	}// Default constructor

	MobilePhone(String brand, int power, double warrantyPeriod, int screenSize, int batteryCapacity, int cameraMP) {
		super(brand, power, warrantyPeriod);
		System.out.println("Parameterized constructor");
		this.screenSize = screenSize;
		this.batteryCapacity = batteryCapacity;
		this.cameraMP = cameraMP;
	}// Parameterized constructor

	int getScreenSize() {
		return screenSize;
	}

	void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	int getBatteryCapacity() {
		return batteryCapacity;
	}

	void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	int getCameraMP() {
		return cameraMP;
	}

	void setCameraMP(int cameraMP) {
		this.cameraMP = cameraMP;
	}
	void charge() {
		System.out.println("Displays lock screen, vibrates on startup");
	}

	void display() {
		super.display();
		System.out.println("screenSize is " + this.screenSize);
		System.out.println("BatteryCapacity is " + this.batteryCapacity);
		System.out.println("CameraMP is " + this.cameraMP);
	}
}// MobilePhone ends here

class TestDevice {
	public static void main(String[] args) {
		Device a1 = new Device();
		a1.display();
		a1.charge();
		System.out.println("\n\n");
		Laptop b1 = new Laptop("Volvo", 780, 2004, 4, 67, "Diesel");
		b1.display();
		b1.charge();
		System.out.println("\n\n");
		MobilePhone t1 = new MobilePhone("Tesla", 87, 2025, 5, 324, 4);
		t1.display();
		t1.charge();
	}
}// TestDevice ends here
