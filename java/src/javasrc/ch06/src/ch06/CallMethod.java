package ch06;

public class CallMethod {
	int x = 7; //�����Ŀ� ��밡��
	static int y = 10; // �޸𸮿� load�Ҷ�, �����Ҷ�, ��������
	void aa() { //�����Ŀ� ��밡��
		System.out.println("aa x = "+x);
		System.out.println("aa y = "+y);
	}
	static void bb() { //�޸𸮿� load�Ҷ�, �����Ҷ�, ��������
		//System.out.println("bb x = "+x);
		System.out.println("bb y = "+y);
	}
	void K1() {
		aa(); 
		bb();
	}
	void K2() {
		//aa(); 
		bb();
	}

}
//static�� ��ü�� �������̴��� ù��°�� �ѹ�
//instance�� ��ü���� ����