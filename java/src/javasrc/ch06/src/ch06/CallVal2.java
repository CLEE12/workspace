package ch06;
class V1 {
	static void swap(int x, int y) {
		int z;
		z = x;
		x = y;
		y = z;
		System.out.println("����");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	
}
public class CallVal2 {
	public static void main(String[] args) {
		int x = 7;
		int y = 15;
		//V1 sp = new V1(); static ������ ����.
		V1.swap(x, y); //static �����ϸ� sp.swap(x, y);
		System.out.println("����");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}

}
