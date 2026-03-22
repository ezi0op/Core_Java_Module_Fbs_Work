package p4;

class PrinterNumber {
	int n = 1;
	int limit = 100;

	synchronized void printOdd() {
		while (n <= limit) {
			if (n % 2 == 0) {
				try {
					System.out.println("it is not ODD nummber");
					wait();
				} catch (Exception e) {
					// TODO: handle exception
//					
				}
			} else {
				System.out.println("First Odd");
				System.out.println("Odd : " + n);
				n++;
				notify();
			}
		}

	}

	synchronized void printEven() {
		while (n <= limit) {
			if (n % 2 == 1) {
				try {
					System.out.println("it is not Even number");
					wait();
				} catch (Exception e) {
					// TODO: handle exception
//					
				}
			} else {
				System.out.println("Second EVen");
				System.out.println("EVEN : " + n);
				n++;
				notify();
			}

		}

	}

}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrinterNumber p = new PrinterNumber();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				p.printOdd();

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				p.printEven();
			}
		});

		t1.start();
		t2.start();

	}

}
