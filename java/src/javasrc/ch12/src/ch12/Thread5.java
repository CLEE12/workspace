package ch12;
import javax.swing.JOptionPane;
class ThreadTest extends Thread {
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {	
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				System.out.println(e.getMessage());	}
			System.out.println(i);
		}
	}
}
public class Thread5 {
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		tt.start();
		String msg=JOptionPane.showInputDialog("할말없니 ?");
		System.out.println("전달메세지 : "+msg);
	}
}