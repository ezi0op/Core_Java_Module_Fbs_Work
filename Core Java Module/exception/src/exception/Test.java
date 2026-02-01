package exception;

public class Test {

	public static void main(String[] args) {
//		System.out.println(args.length);

//		if (args[0].matches("\\d+")) {
//			System.out.println("w");
//			int a = Integer.parseInt(args[0]);
//		} else {
//			System.out.println("wrong");
//		}
//
////		int a = Integer.parseInt(args[0]);
////		int b = Integer.parseInt(args[1]);
////
////		if (a == 0) {
////			System.out.println("No 0 allowed!");
////		} else {
////			int c = a / b;
////			System.out.println(c);
////		}
//
//		
//		int b=10;
//		Integer a = 10;
//		int c=a; //unboxing wrapper to primitive
//		
//		int a1 = 10;
//		Integer a2;
//		a2=a1;//AutoBoxing primitive to wrapper

		try {
			int b1 = Integer.parseInt(args[0]);
			int b2 = Integer.parseInt(args[1]);
			int c = b1 / b2;
			System.out.println(c);
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Please provide at least two inputs");
		} catch (ArithmeticException am) {
			System.out.println("dont give 0 input");
		} catch (NumberFormatException ne) {
			System.out.println("please provide digit");
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
	}

}
