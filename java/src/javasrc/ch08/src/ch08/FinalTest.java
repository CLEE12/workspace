package ch08;

public class FinalTest { //final�� class�տ� ���� �Ǹ� ����ڿ� FinalTest�� �ַ�.
	int a = 7;
	void print() {
		System.out.println("���");
	}
    void print2() {
    	System.out.println("���");
    }
	public static void main(String[] args) {
		FinalTest2 ft = new FinalTest2();
		ft.print();
		ft.print2();
		FinalTest ft2 = new FinalTest();
		ft2.print();
	}
	}
class FinalTest2 extends FinalTest { //pubilc class �� final�� �ִµ� �ǹ̴� ����� �ȵǼ� �׷�.
    void print() {
    	System.out.println("��ȣ 1�ð� ���Ҵ�");
    }
    //void print2() { } //Overriding(������) �� �� ����.
    }