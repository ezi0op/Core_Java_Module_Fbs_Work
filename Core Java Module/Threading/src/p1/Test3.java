package p1;

class Worker12 implements Runnable {
	 @Override
		public void run() {
			String str = "123456789012357583234243324";
			for (int i = 0; i < str.length(); i++) {
				System.out.println(" "+str.charAt(i));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}


}// class worker ends here

class Test3 {

	public static void main(String[] args) {
		Worker12 w1 = new Worker12();
		Thread t1 = new Thread(w1);
		t1.start();

		String str = "adfssgsdgsdfgdhshsghghsghgdxfsdfgsxgsdfdgsdfgdfg";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(" " + str.charAt(i));

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
