package Inheritance;

class Student {
	int fbid;
	String Name;
	double distance;
	static int count = 0;

	Student() {
		System.out.println("Default constructor");
		this.fbid = 00;
		this.Name = "Not given";
		this.distance = 00;
		count++;
	}// default constructor

	Student(int fbid, String name, double distance) {
		System.out.println("Parameterized constructor");
		this.fbid = fbid;
		Name = name;
		this.distance = distance;
		count++;
	}// paramterised constructor

	int getFbid() {
		return fbid;
	}

	void setFbid(int fbid) {
		this.fbid = fbid;
	}

	String getName() {
		return Name;
	}

	void setName(String name) {
		Name = name;
	}

	double getDistance() {
		return distance;
	}

	void setDistance(double distance) {
		this.distance = distance;
	}

	void display() {
		System.out.println("Firstbit id is " + this.fbid);
		System.out.println("Name is " + this.Name);
		System.out.println("Distance is " + this.distance);
	}

}// Student class ends here

class PlaceStudent extends Student {// step 1 "is-a"

	// step 2 remove state and behaviour
	String cName;
	String designation;

	PlaceStudent() {
		super();//step 3a
		System.out.println("PlacedStudent Default constructor");
		this.cName = "Not given";
		this.designation = "Not given";
	}// default constructor

	PlaceStudent(int fbid, String name, int distance, String cName, String designation) {
		super(fbid, name, distance);//step3b
		System.out.println("PlacedStudent Parameterized constructor");
		this.cName = cName;
		this.designation = designation;
	}// paramterized constructor

	String getcName() {
		return cName;
	}

	void setcName(String cName) {
		this.cName = cName;
	}

	String getDesignation() {
		return designation;
	}

	void setDesignation(String designation) {
		this.designation = designation;
	}

	void display() {
		super.display();//step4
		System.out.println("Company name is " + this.cName);
		System.out.println("Designation is " + this.designation);
	}
}// Placed student ends here

class TestStudent {

	public static void main(String[] args) {

//		Student s1 =  new Student();
//		System.out.println("Student count is "+Student.count);
//		
//		Student s2 =  new Student(101,"Amit",324);
//		System.out.println("Student count is "+Student.count);

		PlaceStudent ps1 = new PlaceStudent(101, "Ajay", 324, "Amit", "Look");
		ps1.display();
		System.out.println("PlaceStudent count is " + Student.count);
		System.out.println("\n\n");
		PlaceStudent ps2 = new PlaceStudent();
		ps2.display();
		System.out.println("PlaceStudent count is " + Student.count);
	}

}
