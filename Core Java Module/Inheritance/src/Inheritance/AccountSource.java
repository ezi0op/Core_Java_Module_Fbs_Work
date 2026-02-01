package Inheritance;

class Account {
	int accNo;
	String accHolderName;
	double balance;

	Account() {

		System.out.println("Default constructor");
		this.accNo = 00;
		this.accHolderName = "Not Given";
		this.balance = 00;
	}// Default constructor

	Account(int accNo, String accHolderName, double balance) {

		System.out.println("Parameterized constructor");
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}// Parameterized constructor

	int getAccNo() {
		return accNo;
	}

	void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	String getAccHolderName() {
		return accHolderName;
	}

	void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	void display() {
		System.out.println("Account No   is " + this.accNo);
		System.out.println("AccountHolder  Name is " + this.accHolderName);
		System.out.println("Account Balance is " + this.balance);
	}

}// Account class ends here

class SavingsAccount extends Account {
	double interestRate;
	double minimumBalance;
	double withdrawlLimit;

	SavingsAccount() {
		super();
		System.out.println("Default constructor");
		this.interestRate = 00;
		this.minimumBalance = 00;
		this.withdrawlLimit = 00;
	}// Default constructor
	SavingsAccount(int accNo, String accHolderName, double balance, double interestRate, double minimumBalance,
			double withdrawlLimit) {
		super(accNo, accHolderName, balance);
		System.out.println("Parameterized constructor");
		this.interestRate = interestRate;
		this.minimumBalance = minimumBalance;
		this.withdrawlLimit = withdrawlLimit;
	}// Parameterized constructor

	double getInterestRate() {
		return interestRate;
	}

	void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	double getMinimumBalance() {
		return minimumBalance;
	}

	void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public double getWithdrawlLimit() {
		return withdrawlLimit;
	}

	void setWithdrawlLimit(double withdrawlLimit) {
		this.withdrawlLimit = withdrawlLimit;
	}

	void display() {
		super.display();
		System.out.println("SavingAccount  InterestRate  is " + this.interestRate);
		System.out.println("SavingAccount MinimumBalance  is " + this.minimumBalance);
		System.out.println("SavingAccount WithdrawlLimit is " + this.withdrawlLimit);
	}
}// Saving Account class ends here

class FDAccount extends Account {
	double depositAmount;
	double interesstRate;
	double maturityAmount;
	String fdType;

	FDAccount() {
		super();
		System.out.println("Default constructor");
		this.depositAmount = 00;
		this.interesstRate = 00;
		this.maturityAmount = 00;
		this.fdType = "Not Given";
	}// Default constructor

	FDAccount(int accNo, String accHolderName, double balance, double depositAmount, double interesstRate,
			double maturityAmount, String fdType) {
		super(accNo, accHolderName, balance);
		System.out.println("Parameterized constructor");
		this.depositAmount = depositAmount;
		this.interesstRate = interesstRate;
		this.maturityAmount = maturityAmount;
		this.fdType = fdType;
	}// Parameterized constructor

	double getDepositAmount() {
		return depositAmount;
	}

	void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	double getInteresstRate() {
		return interesstRate;
	}

	void setInteresstRate(double interesstRate) {
		this.interesstRate = interesstRate;
	}

	double getMaturityAmount() {
		return maturityAmount;
	}

	void setMaturityAmount(double maturityAmount) {
		this.maturityAmount = maturityAmount;
	}

	String getFdType() {
		return fdType;
	}

	void setFdType(String fdType) {
		this.fdType = fdType;
	}

	void display() {
		super.display();
		System.out.println("FDAccount    depositAmountis " + this.depositAmount);
		System.out.println("FDAccount interesstRate  is " + this.interesstRate);
		System.out.println("FDAccount maturityAmount is " + this.maturityAmount);
		System.out.println("FDAccount FdType is " + this.fdType);
	}
}// Fd account class ends here

class TestAccount {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.display();
		System.out.println("\n\n");
		SavingsAccount s1 = new SavingsAccount(213,"Jay",34213,12.5,342,342);
		s1.display();
		System.out.println("\n\n");
		FDAccount f1 = new FDAccount(45,"Ajay",3422,3245,12.5,43543,"SAVE");
		f1.display();
	}// main ends here
}// TestAccount ends here