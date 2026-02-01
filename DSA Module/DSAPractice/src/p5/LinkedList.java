package p5;

public class LinkedList {

	Node start;
	Node start1;
	int count = 0;
	int count1 = 0;

	LinkedList() {
		start = null;
		start1 = null;
	}

	boolean isEmptylist1() {
		if (start == null) {
			return true;
		} else {
			return false;
		}
	}

	boolean isEmptylist2() {
		if (start1 == null) {
			return true;
		} else {
			return false;
		}
	}

	void insertlist1(int ele) {
		if (isEmptylist1()) {
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

	void insertlist2(int ele) {
		if (isEmptylist2()) {
			start1 = new Node(ele);
			count1++;
		} else {
			Node temp = start1;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			Node temp1 = new Node(ele);
			count1++;

			temp.setNext(temp1);
		}
	}

	void sameTwoList() {
		if (isEmptylist1() && isEmptylist2()) {
			System.out.println("Both list are empty");
			return;
		}
		if (count != count1) {
			System.out.println("Both list size is different");
			return;
		}
		Node temp = start;
		Node temp1 = start1;

		while (temp != null && temp1 != null) {
			if (temp.getData() != temp1.getData()) {
				System.out.println("Both elements are different");
				return;
			}
			temp = temp.getNext();
			temp1 = temp1.getNext();
		}
		System.out.println("Both list same");
	}
}
