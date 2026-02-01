package toString;

class Date {

	int day, month, year;
	String dow;

	Date() {// Default constructor
		System.out.println("Default Constructor called");
		this.day = 0;
		this.month = 0;
		this.year = 0;
		this.dow = "Not given";
	}

	Date(int a, int b, int c, String d) {// Parameterized constructor
		System.out.println("Parameterized Constructor called");
		this.day = a;
		this.month = b;
		this.year = c;
		this.dow = d;
	}

	void setDay(int x) {
		this.day = x;
	}

	void setMonth(int a) {
		this.month = a;
	}

	void setYear(int b) {
		this.year = b;
	}

	void setDOW(String str) {
		this.dow = str;
	}

	int getDay() {
		return this.day;
	}

	int getMonth() {
		return this.month;
	}

	int getYear() {
		return this.year;
	}

	String getDow() {
		return this.dow;
	}
	
	@Override
	public String toString() {
		return "\n Date is :" + this.day + "/" + this.month + "/" + this.year + "\n Day of week is " + this.dow;
	}// object class function

	void display() {
		System.out.println("Day is" + this.day);
		System.out.println("Month is " + this.month);
		System.out.println("Year is " + this.year);
		System.out.println("Date of the week " + this.dow);
	}

}// Date class ends here

class Test {
	public static void main(String[] a) {
		Object d1 = new Date();
		System.out.println(d1);
		Date d5;
		d5 = new Date(8, 7, 2004, "Tuesday");
		System.out.println(d5);
		System.out.println(d5.toString());

	}// main ends here

}// Test ends here
