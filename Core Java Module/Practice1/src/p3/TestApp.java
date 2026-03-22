package p3;

import java.util.Iterator;

class Print extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String a="12346673892349247536757247234725275275275";
		for (int i = 0; i < a.length(); i++) {
			System.out.println(" "+a.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class TestApp {
	public static void main(String[] args) {
		
		Print p=new Print();
		
		p.start();
		
		String b="abcdefghiklmnopqrstuvxyzasdfafafasfdasdfdasffaaa";
		
		for (int i = 0; i < b.length(); i++) {
			System.out.println(" "+b.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
	}

}
