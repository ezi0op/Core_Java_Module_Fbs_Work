package p2;


class Count{
	String s="loopisok";
	void print() {
		for (int i = 0; i < s.length(); i++) {
			  System.out.println(Thread.currentThread().getName() + " : " + s.charAt(i));
		}
	}
}

class TcCount extends Thread{
	
	Count c;
	
	TcCount(Count c){
		this.c=c;
	}
	
	
	void printf() {
		String l="redtapeisbad";
		for (int i = 0; i < l.length(); i++) {
			  System.out.println(Thread.currentThread().getName() + " : " + l.charAt(i));
			c.print();
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		printf();
		
	}
	
}

public class RcCond {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Count c=new Count();
		
		
		TcCount t1=new TcCount(c);
		TcCount t2=new TcCount(c);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		
	}

}
