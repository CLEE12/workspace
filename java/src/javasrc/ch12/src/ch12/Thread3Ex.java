package ch12;
class Thread3 extends Thread {
	Thread3(String title) {
		super(title);
	}
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(getName()+i+"\t");
			if(i%10==9) System.out.println();
		}
	}
}
public class Thread3Ex {
	public static void main(String[] args) {
		Thread3 th1 = new Thread3("대박");
		Thread3 th2 = new Thread3("쪽박");
		Thread3 th3 = new Thread3("옹박");
		th1.start();
		th2.start();
		th3.start();
		for(int i=0; i<100; i++) {
			System.out.println("main"+i+"\t");
			if(i%10==9) System.out.println();
		}
	}

}
