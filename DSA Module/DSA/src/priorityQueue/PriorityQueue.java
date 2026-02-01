package priorityQueue;

public class PriorityQueue {

	int[] a;
	int rear;
	int front;

	public PriorityQueue(int size) {
		a = new int[size];
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

	void enQueue(int ele) {
		if (isFull()) {
			return;
		}
		if (rear == -1) {
			rear = 0;
			front = 0;
			return;
		}
		if (rear == a.length - 1) {
			rear = 0;
		} else {

			rear++;
		}
		if (a[rear] < a[front]) {
			a[rear] = ele;
		}

	}

	int deQueue() {

		if (!isEmpty()) {
			int ele = a[front];
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
		return -1;

	}

	void display() {

		if (isEmpty()) {
			System.out.println("Queue is Empty!");
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
