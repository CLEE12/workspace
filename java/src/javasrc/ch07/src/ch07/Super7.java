package ch07;
class G1 {
	G1() {
		System.out.println("�Ű����� ���� �θ�");
	}
	G1(int k) {
		System.out.println("�� �Ű����� 1���� �θ�");
	}
}
class G2 extends G1 {
	G2() {
		System.out.println("�Ű����� ���� �ڽ� ����");
	}
	G2(int k) {
		super(k);
		System.out.println("�� �Ű����� 1�� �ڽ�");
	}
}
public class Super7 {
	public static void main(String[] args) {
		G2 g1 = new G2();
		G2 g2 = new G2(67);
	}

}
