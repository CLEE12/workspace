package ch12;
class Runnable2 implements Runnable {
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.print("run"+i+"\t");
			if(i%10==9) System.out.println();
		}
	}
}
public class Runable2Ex {
	public static void main(String[] args) {
		Runnable2 rn1 = new Runnable2();
		Runnable2 rn2 = new Runnable2();
		Thread th1 = new Thread(rn1, "Çã°Æ");
		Thread th2 = new Thread(rn2, "Çã°¢");
		th1.start();
		th2.start();
		for(int i=1; i<50; i++) {
			System.out.print("main"+i+"\t");
			if(i%10==9)System.out.println();
		}
	}

}
