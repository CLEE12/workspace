package ch06;

public class Return1 {
	static int add(int x, int y) {
		int result = x + y;
		return result;
	}
	int minus(int x, int y) {
  //void�� return�� ������ �ʴ´�
		return x-y; //���� return�� �����ϰ� �̰͵� ����.
	}
	String str(String k) {
		return k;
	}
	public static void main(String[] args) {
		Return1 r = new Return1();
		int a = r.add(7,8);
		short b = (short)r.minus(32, 23);
		String k= r.str("������ ���� ¥�İ�Ƽ �丮��");
		System.out.println(a);
		//System.out.println(r.add(7,8));
		System.out.println(b);
		System.out.println(k);
	}
}
