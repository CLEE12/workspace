package ch06;
class B1 {
	void add(int x, int y) { //�޼ҵ� �ȿ� ���ǵȰ� ��������
		x += y; 
		y += 2;
		System.out.println("������");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}
public class CallValue {
	public static void main(String[] args) {
		B1 b = new B1();
		int x = 10;
		int y = 8;
		b.add(x, y); // call by value
		System.out.println("���ε�����");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}

}
