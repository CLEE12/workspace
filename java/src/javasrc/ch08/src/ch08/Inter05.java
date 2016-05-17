package ch08;
interface I1 {
	void m1();
}
class G1 implements I1 {
	public void m1() {
		System.out.println("춥다! 감기조심");
	}
}
class G3 implements I1 {
	public void m1() {
		System.out.println("겨울은 원래 춥지");
	}
}
class G4 implements I1 {
	public void m1() {
		System.out.println("겨울 싫어");
	}
}
class G2 {
	void m2(I1 i) {
		i.m1();
	}
}
public class Inter05 {
	public static void main(String[] args) {
		G2 g2 = new G2();
		g2.m2(new G1());
		g2.m2(new G3());
		g2.m2(new G4());
		
	}

}
