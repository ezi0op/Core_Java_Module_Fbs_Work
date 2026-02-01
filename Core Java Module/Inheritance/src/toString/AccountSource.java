package toString;

import java.time.LocalDate;
import java.time.Period;

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

	void withdraw(int amt) {
		System.out.println(this.balance - amt);
	}
	
	

	@Override
	public String toString() {
		return "Account No   is " + this.accNo+"\nAccountHolder  Name is " + this.accHolderName+"\nAccount Balance is " + this.balance;
	}

//	void display() {
//		System.out.println("Account No   is " + this.accNo);
//		System.out.println("AccountHolder  Name is " + this.accHolderName);
//		System.out.println("Account Balance is " + this.balance);
//	}

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

	void withdraw(int amt) {
		if (amt < minimumBalance) {
			System.out.println("WithDraw successful");
		} else {
			System.out.println("Minimum Bal reached");
		}

	}
	
	@Override
	public String toString() {
		return super.toString()+"\nSavingAccount  InterestRate  is " + this.interestRate+"\nSavingAccount MinimumBalance  is " + this.minimumBalance+"\nSavingAccount WithdrawlLimit is " + this.withdrawlLimit;
	}

//	void display() {
//		super.display();
//		System.out.println("SavingAccount  InterestRate  is " + this.interestRate);
//		System.out.println("SavingAccount MinimumBalance  is " + this.minimumBalance);
//		System.out.println("SavingAccount WithdrawlLimit is " + this.withdrawlLimit);
//	}
}// Saving Account class ends here

class SalaryAcc extends Account {
	LocalDate salCreditDate;
	LocalDate lastTranDate;

	SalaryAcc() {
		super();
		this.salCreditDate = LocalDate.of(2025, 3, 12);
		this.lastTranDate = LocalDate.of(2025, 1, 12);
	}

	SalaryAcc(int accNo, String accHolderName, double balance) {
		super(accNo, accHolderName, balance);
		this.lastTranDate = LocalDate.of(2025, 11, 1);
	}

	LocalDate getSalCreditDate() {
		return salCreditDate;
	}

	void setSalCreditDate(LocalDate salCreditDate) {
		this.salCreditDate = salCreditDate;
	}

	LocalDate getLastTranDate() {
		return lastTranDate;
	}

	void setLastTranDate(LocalDate lastTranDate) {
		this.lastTranDate = lastTranDate;
	}

	void withdraw(int amt) {
		LocalDate Today = LocalDate.now();
		Period diff = Period.between(lastTranDate, Today);

		if (diff.getMonths() >= 2 || diff.getMonths() >= 1)
			if (amt < balance) {
				System.out.println("WithDraw successful");
			} else {
				System.out.println("Minimum Bal reached");
			}
		else {
			System.out.println("Cant withdraw money because ur last trans was last two months ago");
		}
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nSalary Credit date is "+this.salCreditDate+"\n Last Transaction Date is "+this.lastTranDate;
	}

//	void display() {
//		super.display();
//	}

}

class FDAccount extends Account {
	double depositAmount;
	double interestRate;
	double maturityAmount;
	LocalDate maturityDate = LocalDate.of(2020, 1, 1);
	String fdType;

	FDAccount() {
		super();
		System.out.println("Default constructor");
		this.depositAmount = 00;
		this.interestRate = 00;
		this.maturityAmount = 00;
		this.maturityDate = LocalDate.of(2020, 1, 1);
		this.fdType = "Not Given";
	}// Default constructor

	FDAccount(int accNo, String accHolderName, double balance, double depositAmount, double interesstRate,
			double maturityAmount, String fdType) {
		super(accNo, accHolderName, balance);
		System.out.println("Parameterized constructor");
		this.depositAmount = depositAmount;
		this.interestRate = interesstRate;
		this.maturityAmount = maturityAmount;
		this.maturityDate = LocalDate.of(2020, 1, 1);
		this.fdType = fdType;
	}// Parameterized constructor

	double getDepositAmount() {
		return depositAmount;
	}

	void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	double getInteresstRate() {
		return interestRate;
	}

	void setInteresstRate(double interesstRate) {
		this.interestRate = interesstRate;
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

	void withdraw(int amt) {
		LocalDate Year = LocalDate.now();
		Period diff = Period.between(maturityDate, Year);

		if (diff.getYears() >= 1) {
			if (amt <= balance) {
				System.out.println("WithDraw successful");
			} else {
				System.out.println("Minimum Bal reached");
			}
		} else {
			System.out.println("Cant withdraw money because ur  Maturity didnt completed");
		}
	}
	
	@Override
	public String toString() {
		return super.toString()+ "\nFDAccount depositAmount is " + this.depositAmount+"\nFDAccount interesstRate is " + this.interestRate+"\nFDAccount maturityAmount is " + this.maturityAmount+"\nFDAccount FdType is " + this.fdType;
	}

//	void display() {
//		super.display();
//		System.out.println("FDAccount depositAmount is " + this.depositAmount);
//		System.out.println("FDAccount interesstRate  is " + this.interestRate);
//		System.out.println("FDAccount maturityAmount is " + this.maturityAmount);
//		System.out.println("FDAccount FdType is " + this.fdType);
//	}
}// Fd account class ends here

class TestAccount {
	public static void main(String[] args) {
		Account a1 = new Account();
		System.out.println(a1);
		System.out.println("\n\n");
		SavingsAccount s1 = new SavingsAccount(213, "Jay", 34213, 12.5, 5000, 340);
		System.out.println(s1);
		s1.withdraw(600);
		System.out.println("\n\n");
		FDAccount f1 = new FDAccount(45, "Ajay", 3422, 3245, 12.5, 43543, "SAVE");
		System.out.println(f1);
		f1.withdraw(500);
		System.out.println("\n\n");
		SalaryAcc z1 = new SalaryAcc(45, "Ajay", 3422);
		System.out.println(z1);
		z1.withdraw(500);
	}// main ends here
}// TestAccount ends here