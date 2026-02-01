package stackUsingLinkedList;

public class StackUsingLinkedList {

	Node start;
	int count;

	StackUsingLinkedList() {
		start = null;
		this.count = 0;
	}

	boolean isEmpty() {
		if (start == null) {
			return true;
		} else {
			return false;
		}
	}

	void push(int ele) {
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

	void pop() {
		if (isEmpty()) {
			System.out.println("Linked List is Empty");
			return;
		}
		start = start.getNext();
		count--;
	}

	void peek() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}

		System.out.println(start.getData());
	}
}
