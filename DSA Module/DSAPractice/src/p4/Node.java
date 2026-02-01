package p4;

public class Node {

	int data;
	Node next;

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

	Node(int x) {
		data = x;
		next = null;
	}
}
