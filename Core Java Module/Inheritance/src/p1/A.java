package p1;

public class A {
	public void myfunA() {
		System.out.println("INside a");
		
	}
}
class B extends A {
	void myfunB() {
		A ref;
		ref = new A();
		ref.myfunA();
	}
}
class C {
	void myfunC() {
		A ref;
		ref = new A();
		ref.myfunA();
	}
}
class d {
	public static void main(String[] args) {
		C a=new C();
		
		System.out.println();
	}
}

