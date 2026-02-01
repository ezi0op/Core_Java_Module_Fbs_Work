package postFixExp;

public class Stack {

	int[] a;
	int top;

	public Stack(int size) {
		a = new int[size];
		top = -1;
	}

	boolean isFull() {
		if (top == a.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	int push(int ele) {
		if (!isFull()) {
			top++;
			a[top] = ele;
			return ele;
		} else {
			System.out.println("Stack OverFlow!");
			return -1;
		}
	}

	int pop() {
		if (!isEmpty()) {
			int ele = a[top];
			top--;
			return ele;
		} else {
			return -1;
		}

	}

	int peek() {
		if (!isEmpty()) {
			return a[top];
		} else {
			return -1;
		}
	}
}
