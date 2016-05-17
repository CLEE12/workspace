package ch12;
class Thread1 extends Thread {
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("th1"+i+"\t");
			if(i%10==9) System.out.println();
		}
		super.run();
	}
}
public class ThreadEx1 {
	public static void main(String[] args) {
		Thread1 th1 = new Thread1();
		th1.run();
		for(int i=0; i<100; i++) {
			System.out.println("main"+i+"\t");
			if(i%10==9) System.out.println();
		}
	}

}
