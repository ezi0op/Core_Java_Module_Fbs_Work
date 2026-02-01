package doublyLinkedList;



public class DoublyLinkedList<T> {

	Node<T> start;
	Node<T> last;
	int count;

	public DoublyLinkedList() {
		start = null;
		last = null;
		this.count = 0;
	}

	boolean isEmpty() {
		if (start == null) {
			return true;
		} else {
			return false;
		}
	}

	void insert(T ele, int pos) {

		if (pos < 1 || pos > count + 1) {
			return;
		}

		Node<T> temp = new Node<T>(ele);
//		insert at first
		if (isEmpty()) {
			start = temp;
			last = temp;

			this.count++;
			System.out.println("Node added Successfully!");
			return;

		}
//		insert at pos=1
		if (pos == 1) {
			temp.setNext(start);
			temp.setPrev(null);
			start.setPrev(temp);

			start = temp;
			this.count++;
			System.out.println("Node added Successfully!");
			return;
		}
		// insert at end

		if (pos == count + 1) {
			temp.setPrev(last);
			last.setNext(temp);

			last = temp;

			this.count++;
			System.out.println("Node added Successfully!");
			return;
		}

		// Optimized version
		// insert at middle based on the distance from nodes
		Node<T> itr;
	
		if (pos <= count / 2) {
			itr = start;

			// Traverse from start;
			for (int i = 0; i < pos; i++) {
				itr = itr.getNext();
			}

		} else {
			// Traverse from end
			itr = last;
			for (int i = count; i > pos; i--) {
				itr = itr.getPrev();
			}

		}

		// insert newNode after itr next
		temp.setNext(itr.getNext());
		temp.setPrev(itr);
		// insert at last Nodeand check if it is null
		if (itr.getNext() != null) {
			itr.getNext().setPrev(temp);
		} else {
			last = temp;// update last element if inserted at end
		}

		itr.setNext(temp);
		this.count++;

		System.out.println("Node added Successfully!");

	}

	// insert at Begining
	void insertAtBeg(T ele) {
		Node<T> temp = new Node<T>(ele);
		if (start == null && last == null) {
			start = last = temp;
		} else {
			temp.setNext(start);
			temp.setPrev(null);
			start.setPrev(temp);
			start = temp;

		}
		this.count++;
		System.out.println("Node added at Begining Successfully!");
	}

	// insert at End
	void insertAtEnd(T ele) {

		Node<T> temp1 = new Node<T>(ele);

		if (isEmpty()) {
			start = temp1;
			last = temp1;
		} else {
			temp1.setPrev(last);
			last.setNext(temp1);
			last = temp1;
		}

		System.out.println("Node added at end Successfully!");
		this.count++;
	}

	void displayForward() {
		if (isEmpty()) {
			System.out.println("Doubly linked list is Empty!");
			return;
		}
		Node<T> temp = start;

		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

	void displayBackward() {
		if (isEmpty()) {
			System.out.println("Doubly linked list is Empty!");
			return;
		}
		Node<T> temp1 = last;

		while (temp1 != null) {
			System.out.println(temp1.getData());
			temp1 = temp1.getPrev();
		}
	}

	void deletePos(int pos) {
		if (isEmpty()) {
			System.out.println("Doubly linked list is Empty!");
			return;
		}
		if (pos < 1 || pos > count) {
			return;
		}
		// Delete from first node
		if (pos == 1) {// only one node
			start = start.getNext();
			if (start != null) {
				start.setPrev(null);
			} else {
				last = null;
			}

			System.out.println("Node delete SuccessFully!");
			this.count--;
			return;
		}
		// Delete last node
		if (pos == count) {
			if (start == last) {
				start = last = null;
			} else {
				last = last.getPrev();
				last.setNext(null);
			}
			this.count--;
			System.out.println("Node delete SuccessFully!");
			return;
		}

		// Optimized version
		// insert at middle based on the distance from nodes
		Node<T> itr;
		if (pos <= count / 2) {
			itr = start;
			// Traverse from start;
			for (int i = 0; i < pos; i++) {
				itr = itr.getNext();
			}
		} else {
			// Traverse from end
			itr = last;
			for (int i = count; i > pos; i--) {
				itr = itr.getPrev();
			}

		}
		itr.getPrev().setNext(itr.getNext());
		itr.getNext().setPrev(itr.getPrev());
		System.out.println("Node delete SuccessFully!");
		this.count--;
	}

	int getCount() {
		return this.count;
	}
}
