package p4;

public class LinkedList {

	Node start;
	int count = 0;

	LinkedList() {
		start = null;
	}

	boolean isEmpty() {
		if (start == null) {
			return true;
		} else {
			return false;
		}
	}

	void insert(int ele) {
		if (isEmpty()) {
			start = new Node(ele);
			count++;
		} else {
			Node temp = start;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			Node temp1 = new Node(ele);
			count++;

			temp.setNext(temp1);
		}
	}

	void display() {
		if (isEmpty()) {
			System.out.println("Linked List is Empty!");
			return;
		}
		Node temp = start;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

	void insertBeg(int ele) {
		if (isEmpty()) {
			start = new Node(ele);
			count++;
		} else {
			Node temp1 = new Node(ele);
			temp1.setNext(start);
			start = temp1;
			count++;
		}
	}

	void insertPos(int ele, int pos) {
		if (isEmpty()) {
			start = new Node(ele);
			count++;
			System.out.println("Linked list is Empty");
			return;
		}
		if (pos == 1) {
			Node temp1 = new Node(ele);
			temp1.setNext(start);
			start = temp1;
			count++;
		} else {
			Node temp1 = new Node(ele);
			Node temp = start;
			int c = 1;
			while (temp.getNext() != null && c < pos - 1) {
				temp = temp.getNext();
				c++;
			}
			temp1.setNext(temp.getNext());
			temp.setNext(temp1);
			count++;
		}
	}

	void removeFirst() {
		if (isEmpty()) {
			System.out.println("Linked List is Empty");
			return;
		}
		start = start.getNext();
		count--;
	}

	void removeEnd() {
		if (isEmpty()) {
			System.out.println("Linked List is Empty");
			return;
		}
		if (start.getNext() == null) {
			start = null;
			count--;
			return;
		}
		Node itr = start;
		while (itr.getNext().getNext() != null) {
			itr = itr.getNext();
			
		}
		itr.setNext(null);
		count--;
	}

	void deletePos(int pos) {
		if (isEmpty()) {
			return;
		}
		if (pos <= 0) {
			System.out.println("Wrong Number!");
			return;
		}
		if (pos == 1) {
			start = start.getNext();
			count--;
			return;
		}
		int c = 1;
		Node temp = start;
		while (temp.getNext() != null && c < pos - 1) {
			temp = temp.getNext();
			c++;
			
		}
		if (c < pos && temp.getNext() == null) {
			System.out.println("Invalid");
			return;
		}
		temp.setNext(temp.getNext().getNext());
		count--;

	}

	int getCount() {
		return count;
	}
}
