package balancedBrackets;

public class BalancedBrackets {
	static boolean balancedBracket(String s) {
		Stack a = new Stack(100);
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if (x == '(' || x == '[' || x == '{') {
				a.push(x);
			} else if (x == ')' || x == ']' || x == '}') {
				if (a.isEmpty()) {
					return false;
				}
				int y = a.pop();
				if (x == ')' && y == '(') {
					continue;
				}
				if (x == ']' && y == '[') {
					continue;
				}
				if (x == '}' && y == '{') {
					continue;

				}
				return false;
			}

		}
		return a.isEmpty();
	}
}
