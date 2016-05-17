package ch16;
import java.io.File;
public class File3Ex {
	public static void main(String[] args) {
		//javaSrc
		System.out.println("1) 상대경로");
		File dir = new File("../");
		String[] list = dir.list();
		for(int i =0; i<list.length;i++) {
			System.out.println(list[i]);
		}
		System.out.println("\n2) 절대경로");
		dir = new File("C:/java/javaSrc");
		list = dir.list();
		for(int i =0; i<list.length;i++) {
			System.out.println(list[i]);
		}
	}
}