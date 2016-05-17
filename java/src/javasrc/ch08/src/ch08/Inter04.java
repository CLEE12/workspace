package ch08;
class F1 {
	void m1() {
		System.out.println("춥다! 감기조심");
	}
}
class F3 {
	void m1() {
		System.out.println("겨울은 원래 춥지");
	}
}
class F4 {
	void m1() {
		System.out.println("대박");
	}
}
class F2 {
	void m2(F1 f) {
		f.m1();
	}
	void m4(F3 f) {
		f.m1();
	}
	void m5(F4 f) {
		f.m1();
	}
}

public class Inter04 {
	public static void main(String[] args) {
		//F1 f1 = new F1();
		F2 f2 = new F2();
		f2.m2(new F1());
		f2.m4(new F3());
		f2.m5(new F4());
	}
}
