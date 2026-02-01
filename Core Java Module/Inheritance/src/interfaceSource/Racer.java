package interfaceSource;

interface Vehicle {
	void ride();

	void travel();

	void brek();
}// Vehicle ends here

abstract class Animal {
	abstract void eat();

	abstract void walk();

	abstract void ride();
}// Animal ends here

interface Racer {
	void toRace();
}// Racer ends here

interface Product {
	void buy();

	void sell();
}// PRoduct ends here

class lions extends Animal {
	void eat() {
		System.out.println("Eat");
	}

	
	
	void walk() {
		System.out.println("Walk");
	}

	public void ride() {
		System.out.println("Ride");
	}
}// Lion ends here

class Horse extends Animal implements Racer, Vehicle, Product {
	void eat() {
		System.out.println("Eat");
	}

	void walk() {
		System.out.println("Walk");
	}

	public void ride() {
		System.out.println("Ride");
	}

	public void travel() {
		System.out.println("Travel");
	}

	public void brek() {
		System.out.println("Break");
	}

	public void buy() {
		System.out.println("Buy");
	}

	public void sell() {
		System.out.println("Sell");
	}

	public void toRace() {
		System.out.println("Race");
	}
}// Horse ends here

abstract class Vehicle1 {
	abstract void ride();

	abstract void brek();

}

class Supercar extends Vehicle1 implements Racer, Product, Vehicle {

	public void ride() {
		System.out.println("Ride");
	}

	public void brek() {
		System.out.println("break");
	}

	public void buy() {
		System.out.println("Buy");
	}

	public void sell() {
		System.out.println("Sell");
	}

	public void travel() {
		System.out.println("Travel");
	}

	public void toRace() {
		System.out.println("Race");
	}

}

class TestRace {
	public static void main(String[] args) {

		Animal a;
		a = new Horse();
		a.ride();

		Supercar v;
		v = new Supercar();
		v.ride();
		v.brek();
	}
}
