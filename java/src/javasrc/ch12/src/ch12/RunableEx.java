package ch12;
//java�� ���ϻ�Ӹ� �ǹǷ� class�� �ٸ� class�� ��� ������ Thread�� �����ϱ� ���� 
class Runable1 implements Runnable {
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.print("run"+i+"\t");
			if(i%10==9) System.out.println();
		}
	}
}

public class RunableEx {
	public static void main(String[] args) {
		Runable1 rn1 = new Runable1();
		Thread th1 = new Thread(rn1);
		th1.start();
		for(int i=0; i<50; i++) {
			System.out.print("main"+i+"\t");
			if(i%10==9) System.out.println();
		}
	}
}