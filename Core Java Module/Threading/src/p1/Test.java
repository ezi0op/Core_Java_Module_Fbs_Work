package p1;


 class Worker extends Thread{
	
	@Override
	public void run() {
		String str = "123456789012357583234243324";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(" "+str.charAt(i));
			try {
				Thread.sleep(1000);;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}//class worker ends here

 class Test {
	
	public static void main(String[] args) {
		Worker w1 = new Worker();
		w1.start();
		
		String str= "adfssgsdgsdfgdhshsghghsghgdxfsdfgsxgsdfdgsdfgdfg";
		for(int i=0;i<str.length();i++) {
			System.out.println(" "+str.charAt(i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
