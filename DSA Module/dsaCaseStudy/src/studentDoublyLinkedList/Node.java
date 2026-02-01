package studentDoublyLinkedList;


public class Node {

	Student data;
	Node next;
	Node prev;

	public Node(Student x) {
		data = x;
		next = null;
		prev = null;
	}

	public Student getData() {
		return data;
	}

	public void setData(Student data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

}
