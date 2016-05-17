package ch05;

public class IntBlock {
	int[] a = new int[5];
	static int[] b = new int[5];
	{ // instance 초기화 블럭. 객체를 생성할 떄 작동.
		for(int i=0; i<a.length; i++) {
			a[i] = i+10;
		}
	} // class 초기화 블럭. 클래스를 불러올 때.
	static {
		for(int i=0; i<b.length; i++) {
			b[i] = i+15;
		}
	}
	public static void main(String[] args) {
		for(int i=0; i<b.length; i++) {
			System.out.println(IntBlock.b[i]);// 같은 클래스 안에서는 클래스
		}                                     // 생략가능.IntBlock.b[i]
		System.out.println("====");
		IntBlock ib = new IntBlock();
		for(int i=0; i<ib.a.length; i++) {
			System.out.println(ib.a[i]);
		}
	}
}
