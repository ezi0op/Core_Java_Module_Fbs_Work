package P1;

interface Mall {
	void discount();
}

class FashionMall implements Mall {

	@Override
	public void discount() {
		// TODO Auto-generated method stub
		System.out.println("20% disc given!");
	}

}

public class Test1 {
	public static void main(String[] args) {
		Mall m1 = new FashionMall();
		m1.discount();

		Mall m2 = new FashionMall();
		m2.discount();

		new Mall() {

			public void discount() {
				System.out.println("50% disc!");
			}
	}.discount();;// AnonymousClass ends here
	
	}
}
