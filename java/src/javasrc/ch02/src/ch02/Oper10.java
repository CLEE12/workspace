package ch02;

public class Oper10 {
	public static void main(String[] args) {
		long l1 = 1000000*1000000; // <-- �����Ⱚ ����. int x int�� �׷�
		long l2 = 1000000*1000000l; // <-- �ڿ� L�� ������ Long���� ���� �Ѵ�.
		// long���� �����ϰ� ������ ���ԵǸ� ����� int�� �ϰ� ��. �׷��� �ڿ� L�� ����.
		System.out.println("l1 = "+l1);
		System.out.println("l2 = "+l2);
		System.out.println("*���� ���� ��� = "+1000000*1000000/1000000);
		System.out.println("/���� ���� ��� = "+1000000/1000000*1000000);
		System.out.println("L�Է� �� *���� ���� ��� = "+1000000l*1000000/1000000);
		System.out.println("L�Է� �� /���� ���� ��� = "+1000000l/1000000*1000000);
	}

}
