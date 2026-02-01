package polymorphism;

class MusicalInstrument {
	String name;
	String type;
	String origin;
	double price;

	MusicalInstrument() {
		this.name = "Not given";
		this.type = "Not given";
		this.origin = "Not given";
		this.price = 0.0;
	}

	MusicalInstrument(String name, String type, String origin, double price) {
		this.name = name;
		this.type = type;
		this.origin = origin;
		this.price = price;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}

	String getOrigin() {
		return origin;
	}

	void setOrigin(String origin) {
		this.origin = origin;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	void play() {
		System.out.println(this.name + " is playing a generic sound.");
	}

	void display() {
		System.out.println("Instrument Name: " + this.name);
		System.out.println("Type: " + this.type);
		System.out.println("Origin: " + this.origin);
		System.out.println("Price: " + this.price);
	}

}

class StringInstrument extends MusicalInstrument {
	int id;
	int numberOfStrings;

	StringInstrument(String name, String type, String origin, double price,int id, int numberOfStrings) {
		super( name,  type,  origin,  price);
		this.id = id;
		this.numberOfStrings = numberOfStrings;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	int getNumberOfStrings() {
		return numberOfStrings;
	}

	void setNumberOfStrings(int numberOfStrings) {
		this.numberOfStrings = numberOfStrings;
	}

	void play() {
		System.out.println(this.name + " is strumming strings melodiously.");
	}

	void display() {
		super.display();
		System.out.println("NO of strings: " + this.numberOfStrings);
		System.out.println("id is : " + this.id);
	}
}

class PercussionInstrument extends MusicalInstrument {
	String material;
	String isTunable;

	PercussionInstrument() {
		super();
		this.material = "Not Given";
		this.isTunable = "Not Given";
	}

	PercussionInstrument(String name, String type, String origin, double price,String material, String isTunable) {
		super(name,  type,  origin,  price);
		this.material = material;
		this.isTunable = isTunable;
	}

	String getMaterial() {
		return material;
	}

	void setMaterial(String material) {
		this.material = material;
	}

	String getIsTunable() {
		return isTunable;
	}

	void setIsTunable(String isTunable) {
		this.isTunable = isTunable;
	}

	void play() {
		System.out.println(this.name + "is hitting beats rhythmically.");
	}

	void display() {
		super.display();
		System.out.println("Material is " + this.material);
		System.out.println("Tunable is " + this.isTunable);
	}

}

class WindInstrument extends MusicalInstrument {
	String key;
	String isMetal;
	WindInstrument() {
		this.key = "Not Given";
		this.isMetal = "Not Given";
	}
	WindInstrument(String name, String type, String origin, double price,String key, String isMetal) {
		super(name,  type,  origin,  price);
		this.key = key;
		this.isMetal = isMetal;
	}
	String getKey() {
		return key;
	}
	void setKey(String key) {
		this.key = key;
	}
	String getIsMetal() {
		return isMetal;
	}
	void setIsMetal(String isMetal) {
		this.isMetal = isMetal;
	}
	void play() {
		System.out.println(this.name + "is blowing harmonious notes.");
	}
	void display() {
		super.display();
		 System.out.println("Key are " + this.key);
	        System.out.println("which Metal: " + this.isMetal);
	}

}
class TestMusic{
	public static void main(String[] args) {
		MusicalInstrument m1;
		m1 = new StringInstrument("God","Guitar","Ind",234,101, 23);
		m1.display();
		m1.play();
		m1 = new PercussionInstrument("God","Guitar","Ind",234,"Leather", "Yes");
		m1.display();
		m1.play();
		m1 = new WindInstrument("God","Guitar","Ind",234,"Yes", "Copper");
		m1.display();
		m1.play();
	}
}
