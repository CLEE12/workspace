package ch02;
public class Cast1 {
	public static void main(String[] args) {
		
		byte b1 = 35;
		int i1 = b1;
		System.out.println("b1 = "+b1+", i1 = "+i1);
		//promotion�� ������ ����ȯ�� ���� �ʿ� ����.
		
		int i2 = 67;
		byte b2 = (byte)i2;
		//demotion�̱� ������ ���� ��ȯ�� ����� ��. i2 �տ� (byte)
		//����ȯ : (������ ��)
		System.out.println("b2 = "+b2+", i2 = "+i2);
		int i3 = 400;
		byte b3 = (byte)i3;
		System.out.println("b3 = "+b3+", i3 = "+i3);
		
	}
}
