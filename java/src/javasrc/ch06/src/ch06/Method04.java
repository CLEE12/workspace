package ch06;

public class Method04 {
	static int add(int x, int y) {
		return x+y;
	}
	static double square(double x) {
		return x*x;
	}
	public static void main(String[] args) {
		Method04 m = new Method04();
		System.out.println(Method04.add(10,12)); //static�� �Է��ϸ� Method04�� �Է��ؼ� ����.
		System.out.println(square(2.5)); // ���̵� ����. (�̸��� ������ ���� ����)
		/*
		System.out.println(m.add(10,12)); // static�� �Է����� ������ m.add �̷��� �Է������ ��.
		System.out.println(m.square(2.5));
	    */
	}

}
