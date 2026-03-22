package p5;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Test1.ValidAGe(19);
		} catch (InvAge e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void ValidAGe(int a) throws InvAge {
		if(a<18) {
			throw new InvAge("INvalid AGE ");
		}else {
			System.out.println("Valid AGE");
		}
	}

}
