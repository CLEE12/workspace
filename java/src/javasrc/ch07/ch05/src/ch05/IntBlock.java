package ch05;

public class IntBlock {
	int[] a = new int[5];
	static int[] b = new int[5];
	{ // instance �ʱ�ȭ ��. ��ü�� ������ �� �۵�.
		for(int i=0; i<a.length; i++) {
			a[i] = i+10;
		}
	} // class �ʱ�ȭ ��. Ŭ������ �ҷ��� ��.
	static {
		for(int i=0; i<b.length; i++) {
			b[i] = i+15;
		}
	}
	public static void main(String[] args) {
		for(int i=0; i<b.length; i++) {
			System.out.println(IntBlock.b[i]);// ���� Ŭ���� �ȿ����� Ŭ����
		}                                     // ��������.IntBlock.b[i]
		System.out.println("====");
		IntBlock ib = new IntBlock();
		for(int i=0; i<ib.a.length; i++) {
			System.out.println(ib.a[i]);
		}
	}
}
