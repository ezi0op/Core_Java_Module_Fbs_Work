package p2;




class MyThead1  {
	
	int count=1;
	
	void increment(){
	count++;
	}
}

class Mythread extends Thread{

		MyThead1 m;
		
		public Mythread(MyThead1 m1) {
			// TODO Auto-generated constructor stub
			this.m=m1;
		}
		
		@Override
		public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 60000; i++) {
			m.increment();
		}
		}
}

public class TestApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyThead1 m1=new MyThead1();
		
		Mythread t1=new Mythread(m1);
		Mythread t2=new Mythread(m1);
		
		
		t1.start();
		t2.start();
		
		
		
		t1.join();
		t2.join();
		
		
		System.out.println(m1.count);

	}

}
