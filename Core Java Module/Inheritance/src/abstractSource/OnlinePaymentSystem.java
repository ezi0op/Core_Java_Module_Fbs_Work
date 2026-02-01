package abstractSource;



enum Status {
	PENDING,
	SUCCESS,
	FAILED
}
abstract class OnlinePaymentSystem {
	
	
	
	int pId;
	double amount;
	String pName;
	Status status=Status.PENDING;

	OnlinePaymentSystem() {
		this.pId = 00;
		this.amount = 00;
		this.pName = "Not Given";
		
	}// Default constructor

	OnlinePaymentSystem(int pId, double amount, String pName) {
		this.pId = pId;
		this.amount = amount;
		this.pName = pName;
		
	}// paramterized constructor

	//Setters and getters
	int getpId() {
		return pId;
	}

	void setpId(int pId) {
		this.pId = pId;
	}

	double getAmount() {
		return amount;
	}

	void setAmount(double amount) {
		this.amount = amount;
	}

	String getpName() {
		return pName;
	}

	void setpName(String pName) {
		this.pName = pName;
	}


	
	abstract boolean validate();

	abstract void deductAmount();

	abstract void sendNotification();
	
	final void process() {
		if (!validate()) {
			System.out.println("Payment FAILED!");
			this.status=Status.FAILED;
		} else {
			deductAmount();
			sendNotification();
			this.status=Status.SUCCESS;
			
		}

	}
	
	void printSummary() {
		
		System.out.println("------------------------------");
		System.out.println("Payment id :"+this.pId);
		System.out.println("Amount : "+this.amount);
		System.out.println("Payer Name : "+this.pName);
		System.out.println("Payment Status : "+this.status);
		System.out.println("--------------------------------");
	}
	

	@Override
	public String toString() {
		return "Payment id is " + this.pId + "\nAmount is " + this.amount + "\nPayer Name is " + this.pName
				+ "\nPayment Status is " + this.status;
	}// to String here
}// Online Payment Status ends here

class CardPayment extends OnlinePaymentSystem {
	String cardNumber;
	String cvv;

	CardPayment() {
		super();
		this.cardNumber = "Not Given";
		this.cvv = "Not Given";
	}// Default constructor

	CardPayment(int pId, double amount, String pName, String cardNumber, String cvv) {
		super(pId, amount, pName);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}// Parameterized constructor

	String getCardNumber() {
		return cardNumber;
	}

	void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	String getCvv() {
		return cvv;
	}

	void setCvv(String cvv) {
		this.cvv = cvv;
	}

	boolean validate() {
		if (String.valueOf(cardNumber).length() != 16) {
			System.out.println("Incorrect CardNumber!");
			return false;
		} else if (String.valueOf(cvv).length() != 3) {
			System.out.println("Incorrect Cvv!");
			return false;
		} else if (this.amount <= 0) {
			System.out.println("Amount lower than 0");
			return false;
		} else {

			return true;
		}
	}

	void deductAmount() {
		System.out.println("Amount Deducted SuccessFully!");
	}

	void sendNotification() {
		System.out.println("Payment Success!");
	}

	@Override
	public String toString() {
		return super.toString() + "\nCardNumber is " + this.cardNumber + "\nCard Cvv is " + this.cvv;
	}

}// CardPayment ends here

class UpiPayment extends OnlinePaymentSystem {
	String upiId;
	char ch = '@';

	UpiPayment() {
		super();
		this.upiId = "Not Given";
	}// Default Constructor

	UpiPayment(int pId, double amount, String pName, String upiId) {
		super(pId, amount, pName);
		this.upiId = upiId;
	}// Parameterized Constructor

	String getUpiId() {
		return upiId;
	}

	void setUpiId(String upiId) {
		this.upiId = upiId;
	}

	boolean validate() {
		if (upiId.contains(String.valueOf(ch))) {
			System.out.println("Correct UpiID");
			return true;
		} else if (amount >= 1 && amount <= 100000) {

			return true;
		} else {
			System.out.println("Incorrect UpiId!");
			System.out.println("Payment Failed!");
			return false;
		}
	}

	void deductAmount() {
		System.out.println("Amount Deducted SuccessFully!");
	}

	void sendNotification() {
		System.out.println("Payment Success!");
	}

	@Override
	public String toString() {
		return super.toString() + "\nUpiPayment Id is " + this.upiId;
	}

}// UpiPayment ends here

class TestOPS {
	public static void main(String[] args) {
		
		OnlinePaymentSystem a1;
		a1 = new CardPayment(101, 128, "asd", "1234567812345678", "137");
		a1.process();
		a1.printSummary();
		System.out.println("\n\n");
		a1 = new CardPayment(101, 324, "asd", "1234567812345678", "137");
		a1.process();
		a1.printSummary();
		System.out.println("\n\n");
		a1 = new UpiPayment(101, 0, "asd", "1234567812345678");
		a1.process();
		a1.printSummary();
	}
}
