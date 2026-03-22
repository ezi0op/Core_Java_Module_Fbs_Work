package p4;

class Bank {
	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}

	synchronized void withdraw(double bal) {
		if (bal > balance) {
			try {
				System.out.println("Insuf Bal Wait for deposti...");
				wait();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("low AMOUT");
			}

		}
		this.balance = this.balance - bal;
		System.out.println("Current Balnce : " + this.balance);
	}

	synchronized void deposit(double bal) {
		this.balance = this.balance + bal;

		System.out.println("dONE cURRENT Bal : " + this.balance);
		notify();
		
	}

	double getBal() {
		return this.balance;
	}

}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b = new Bank(5000);

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				b.withdraw(6000);
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catce.printSh block
				
				}
				b.deposit(6000);

			}
		});

		t1.start();
		t2.start();

		System.out.println("Cuur bal " + b.getBal());

	}

}
