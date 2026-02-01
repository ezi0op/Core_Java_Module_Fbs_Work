package p2;

//import p1.A;

 class X {
	void myfunX() {
		p1.A ref;
		ref = new p1.A();
		ref.myfunA();
	}
}
class Y extends p1.A {
	void myfunY() {
		p1.A ref;
		ref = new p1.A();
		ref.myfunA();
	}
}
