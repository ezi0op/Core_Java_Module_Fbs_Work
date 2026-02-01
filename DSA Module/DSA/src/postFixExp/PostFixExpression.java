package postFixExp;

public class PostFixExpression {
	Stack obj = new Stack(5);

	void postFixExpression(String s) {
		char ch;
		int x;
		int y;

		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				obj.push(ch - '0');
			} else {
				x = obj.pop();
				y = obj.pop();
				if (ch == '+') {
					obj.push(x + y);
				} else if (ch == '-') {
					obj.push(x - y);
				} else if (ch == '*') {
					obj.push(x * y);
				} else if (ch == '/') {
					obj.push(x / y);
				}
			}
		}
		System.out.println("Result :" + obj.peek());
	}

}
