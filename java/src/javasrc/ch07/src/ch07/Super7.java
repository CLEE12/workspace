package ch07;
class G1 {
	G1() {
		System.out.println("매개변수 없는 부모");
	}
	G1(int k) {
		System.out.println("난 매개변수 1개인 부모");
	}
}
class G2 extends G1 {
	G2() {
		System.out.println("매개변수 없는 자식 생성");
	}
	G2(int k) {
		super(k);
		System.out.println("난 매개변수 1개 자식");
	}
}
public class Super7 {
	public static void main(String[] args) {
		G2 g1 = new G2();
		G2 g2 = new G2(67);
	}

}
