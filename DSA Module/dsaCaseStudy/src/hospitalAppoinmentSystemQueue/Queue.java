package hospitalAppoinmentSystemQueue;

public class Queue {

	String[] a;
	int rear;
	int front;

	public Queue(int size) {
		a = new String[size];
		rear = -1;
		front = -1;
	}

	boolean isEmpty() {
		if (rear == -1) {
			return true;
		} else {
			return false;
		}
	}

	boolean isFull() {
		if ((rear == a.length - 1 && front == 0) || (rear + 1 == front)) {
			return true;
		} else {
			return false;
		}
	}

	void enQueue(String ele) {

		if (isFull()) {
			System.out.println("Queue is full!");
			return;
		}
		if (!isEmpty() && alreadyExist(ele)) {
			return;
		}
		if (rear == -1) {
			rear = 0;
			front = 0;
		} else if (rear == a.length - 1) {
			rear = 0;
		} else {
			rear++;
		}
		a[rear] = ele;
		System.out.println("Added " + a[rear]);

	}

	String deQueue() {

		if (!isEmpty()) {
			String ele = a[front];
			if (rear == front) {
				rear = -1;
				front = -1;
			} else if (front == a.length - 1) {
				front = 0;
			} else {
				front++;
			}
			return ele;
		}
		return null;

	}

	boolean alreadyExist(String ele) {
		int i = front;
		while (true) {
			if (a[i].equalsIgnoreCase(ele)) {
				System.out.println("Can't Add SAME NAME!");
				return true;
			}
			if (i == rear) {
				break;
			}

			i++;
			if (i == a.length) {
				i = 0;
			}
		}
	return false;

	}

	void display() {

		if (isEmpty()) {
			System.out.println("Queue is Empty!");
			return;
		}

		int i = front;

		while (i != rear) {
			System.out.println(a[i]);
			if (i == a.length - 1) {
				i = 0;
			} else {
				i++;
			}

		}
		System.out.println(a[i]);
	}

}
