package Test;

public class MyKey implements Comparable<MyKey> {

	int key;

	public MyKey(int i) {
		// TODO Auto-generated constructor stub
		this.key = i;
	}

	@Override
	public int compareTo(MyKey o) {
		System.out.println("InCmpareTo");
		// TODO Auto-generated method stub

		return this.key-o.key;
	}

	@Override
	public String toString() {
		return "Key: "+this.key;
	}
	
	

}
