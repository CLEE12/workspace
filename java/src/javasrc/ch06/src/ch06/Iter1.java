package ch06;

public class Iter1 {         //static ����, ������ �ǹ�
	static void hi(int k) {  //static �޼ҵ�� ��ü �������� �ʰ� ��� ����.
		// return �����ϰ� �� �޼ҵ带 ȣ���� ������ ���ư���
		// return a; return �ڿ� �ִ� ���� ȣ���� ������ ��ȯ�ض�.
		System.out.println("Hi! �� �����̾�?");
		if(k<0) return;
		hi(--k);
	}
	public static void main(String[] args) {
		
	}

}
