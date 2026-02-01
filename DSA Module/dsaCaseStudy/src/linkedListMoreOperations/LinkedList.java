package linkedListMoreOperations;

public class LinkedList {

	Node start;

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

		} else {
			Node temp = start;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			Node temp1 = new Node(ele);
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

	void isPrimeList() {
		if (isEmpty()) {
			System.out.println("linked list is Empty!");
			return;
		}

		Node temp = start;
		while (temp != null) {
			int n = temp.getData();
			int flag = 1;
			if (n <= 1) {
				flag = 0;
			} else {
				for (int i = 2; i < n / 2; i++) {
					if (n % i == 0) {
						flag = 0;
						break;
					}
				}
			}
			if (flag == 1) {
				System.out.println(n);
			}
			temp = temp.getNext();

		}
	}

	void ascendingOrder() {
		if (isEmpty()) {
			System.out.println("Linked List is Empty!");
			return;
		}
		Node temp = start;

		while (temp != null) {
			Node temp1 = start;
			while (temp1.getNext() != null) {
				if (temp1.getData() > temp1.getNext().getData()) {
					int a = temp1.getData();
					temp1.setData(temp1.getNext().getData());
					temp1.getNext().setData(a);
				}
				temp1 = temp1.getNext();
			}
			temp = temp.getNext();
		}
	}

	void descendingOrder() {
		if (isEmpty()) {
			System.out.println("Linked List is Empty!");
			return;
		}
		Node temp = start;

		while (temp != null) {
			Node temp1 = start;
			while (temp1.getNext() != null) {
				if (temp1.getData() < temp1.getNext().getData()) {
					int a = temp1.getData();
					temp1.setData(temp1.getNext().getData());
					temp1.getNext().setData(a);
				}
				temp1 = temp1.getNext();
			}
			temp = temp.getNext();
		}
	}

	void insertSorted(int ele) {

		Node temp = new Node(ele);
		// IF node is empty then add at first
		if (isEmpty()) {
			start = temp;
			return;
		}

		// IF NODE has one element then it is big and then add another element to first
		if (ele <= start.getData()) {
			temp.setNext(start);
			start = temp;
			return;
		}

		// Insert middle or end
		Node temp1 = start;
		while (temp1.getNext() != null && temp1.getNext().getData() < ele) {
			temp1 = temp1.getNext();
		}
		temp.setNext(temp1.getNext());
		temp1.setNext(temp);

	}

}
