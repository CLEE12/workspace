package ch12;
class Thread2 extends Thread {
	Thread2(String title) {
		super(title);
	}
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(getName()+i+"\t");
			if(i%10==9) System.out.println();
		}
	}
}
public class Thread2Ex {
	public static void main(String[] args) {
		Thread2 th1 = new Thread2("��1"); //��1 -> Thread2(String title) -> super(title) -> getName() {getName�� Thread�� �޼ҵ�}
		Thread2 th2 = new Thread2("��1");
		th1.start(); //start�� thread ���.
		th2.start();
		/*th1.run(); //run�� �������.
		th2.run();*/
		for(int i=0; i<100; i++) {
			System.out.println("main"+i+"\t");
			if(i%10==9) System.out.println();
		}
	}
}
