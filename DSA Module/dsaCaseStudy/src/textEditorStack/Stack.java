package textEditorStack;

public class Stack {
	String[] a;
	int top;

	public Stack(int size) {
		a = new String[size];
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

	String push(String ele) {
		if (!isFull()) {
			top++;
			a[top] = ele;
			return ele;
		} else {
			System.out.println("Stack OverFlow!");
			return null;
		}
	}

	String pop() {
		if (!isEmpty()) {
			System.out.println(a[top]);
			return a[top--];

		} else {
			System.out.println("Nothing to Undo!");
			return null;

		}

	}

	String peek() {
		if (!isEmpty()) {
			return a[top];
		} else {
			return null;
		}
	}

	void display() {
		if (isEmpty()) {
			System.out.println("Stack is Empty!");
			return;
		}

		System.out.println("----- Current Text -----");
		for (int i = 0; i <= top; i++) {
			System.out.println("Sentence : " + a[i]);
		}
	}
}
