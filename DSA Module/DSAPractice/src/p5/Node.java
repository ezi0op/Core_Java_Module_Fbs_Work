package p5;

public class Node {

	int data;
	Node next;
	
	
	
	public Node(int x){
		data=x;
		next=null;
	}


	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}


	public Node getNext() {
		return next;
	}


	public void setNext(Node next) {
		this.next = next;
	}


	
}


