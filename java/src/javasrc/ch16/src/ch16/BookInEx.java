package ch16;
import java.io.*;
public class BookInEx {
	public static void main(String[] args) throws IOException {
		ObjectInputStream ois = null;
		try { ois = new ObjectInputStream(
					new FileInputStream("bk1.txt"));
			while(true) {
				BookInfo bi = (BookInfo)ois.readObject();
				System.out.println("�ڵ� : "+bi.code);
				System.out.println("���� : "+bi.name);
				System.out.println("���� : "+bi.price);
				System.out.println("�۰� : "+bi.writer);
				System.out.println("�ʼ� : "+bi.page);
				System.out.println("==================");
			}
		} catch (Exception e) {	System.out.println("�б� ��");
		} finally {		ois.close();	}
	}
}