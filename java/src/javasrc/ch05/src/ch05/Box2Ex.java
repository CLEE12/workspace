package ch05;

class Box2 {
	int num;
	static int count; //static�� �־ ��ø�ȴ�.
	void print() {
		System.out.println("num = "+num+", count = "+count);
	}

}

public class Box2Ex {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			Box2 b = new Box2();
			b.num++; //������ �� 0���� 1����
			b.count++; //������ ���� �����ϹǷ� ������ ���� 1����
			b.print();
		}
	}
}