package p4;

class Store {
	int product;
	boolean isAvail = false;

	synchronized void produce(int product) {
		while (isAvail) {
			try {
				System.out.println("AVil Prod");
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		System.out.println("No Product Avail");
		System.out.println("Product No in Produce : " + this.product);
		this.product = product;
		isAvail = true;
		System.out.println("Prroduced : " + product);
		notify();

	}

	synchronized void consume() {

		while (!isAvail) {
			try {
				System.out.println("NO Prod AVAIL");
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		System.out.println("Product Avail");
		System.out.println("Product No in Consumed : " + this.product);
		System.out.println("Consumed : " + product);
		isAvail = false;
		notify();

	}

}

public class Test2 {

	public static void main(String[] args) {
		Store s = new Store();

		Thread T = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i <= 15; i++) {
					s.produce(i);
				}
			}
		});

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i <= 10; i++) {
					s.consume();
				}
			}
		});
	
		T.start();
		t1.start();

	}
}
