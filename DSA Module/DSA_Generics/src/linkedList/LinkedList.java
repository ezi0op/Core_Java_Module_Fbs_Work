package linkedList;


public class LinkedList<T extends Comparable<T>> {

	Node<T> start;
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

	void insert(T ele) {
		if (isEmpty()) {
			start = new Node<T>(ele);
			count++;
		} else {
			Node<T> temp = start;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			Node<T> temp1 = new Node<T>(ele);
			count++;

			temp.setNext(temp1);
		}
	}

	void display() {
		if (isEmpty()) {
			System.out.println("Linked List is Empty!");
			return;
		}
		Node<T> temp = start;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

	void insertBeg(T ele) {
		if (isEmpty()) {
			start = new Node<T>(ele);
			count++;
		} else {
			Node<T> temp1 = new Node<T>(ele);
			temp1.setNext(start);
			start = temp1;
			count++;
		}
	}

	void insertPos(T ele, int pos) {
		if (isEmpty()) {
			start = new Node<T>(ele);
			count++;
			System.out.println("Linked list is Empty");
			return;
		}
		if (pos == 1) {
			Node<T> temp1 = new Node<T>(ele);
			temp1.setNext(start);
			start = temp1;
			count++;
		} else {
			Node<T> temp1 = new Node<T>(ele);
			Node<T> temp = start;
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
		Node<T> itr = start;
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
		Node<T> temp = start;
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

	void reverseDisplay() {
		reverse(start);
	}

	void reverse(Node<T> temp) {
		if (temp != null) {
			reverse(temp.getNext());
			System.out.println(temp.getData());
		}
	}

	void bubbleSort() {
		if (isEmpty()) {
			System.out.println("Linked List is Empty!");
			return;
		}
		Node<T> temp = start;

		while (temp != null) {
			Node<T> temp1 = start;
			while (temp1.getNext() != null) {
				if (temp1.getData().compareTo(temp1.getNext().getData())>0 ) {
					T a = temp1.getData();
					temp1.setData(temp1.getNext().getData());
					temp1.getNext().setData(a);
				}
				temp1 = temp1.getNext();
			}
			temp = temp.getNext();
		}
	}

	void insertSorted(T ele) {

		Node<T> temp = new Node<>(ele);
		// IF node is empty then add at first
		if (isEmpty()) {
			start = temp;
			return;
		}

		// IF NODE has one element then it is big and then add another element to first
		if (ele.compareTo(start.getData()) <=0) {
			temp.setNext(start);
			start = temp;
			return;
		}

		// Insert middle or end
		Node<T> temp1 = start;
		while (temp1.getNext() != null && temp1.getNext().getData().compareTo(ele) < 0) {
			temp1 = temp1.getNext();
		}
		temp.setNext(temp1.getNext());
		temp1.setNext(temp);

	}


}
