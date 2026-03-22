package p5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Test.isValidEven(2);
		} catch (NotEvenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static void isValidEven(int a) throws NotEvenException {
		if (a % 2 == 0) {
			throw new NotEvenException("INvalid Odd");
		} else {
			System.out.println("Odd Number");
		}
	}

}
