package ch16;
import java.io.*;
public class BookInEx {
	public static void main(String[] args) throws IOException {
		ObjectInputStream ois = null;
		try { ois = new ObjectInputStream(
					new FileInputStream("bk1.txt"));
			while(true) {
				BookInfo bi = (BookInfo)ois.readObject();
				System.out.println("코드 : "+bi.code);
				System.out.println("제목 : "+bi.name);
				System.out.println("가격 : "+bi.price);
				System.out.println("작가 : "+bi.writer);
				System.out.println("쪽수 : "+bi.page);
				System.out.println("==================");
			}
		} catch (Exception e) {	System.out.println("읽기 끝");
		} finally {		ois.close();	}
	}
}