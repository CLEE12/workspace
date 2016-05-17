package ch16;
import java.io.*;
public class BookOutEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		BookInfo b1=new BookInfo("111","대지",20000,"펄벅",200);
		BookInfo b2=new BookInfo("222","홍길동",25000,"허준",220);
		BookInfo b3=new BookInfo("333","AOA",48000,"설현",170);
		BookInfo b4=new BookInfo("444","선생님이 먼저 때렸어요",
			20000,"강병철",200);
		BookInfo b5=new BookInfo("555","하수와고수",10000,"강병호",120);
		
		ObjectOutputStream oos=new ObjectOutputStream(
			new FileOutputStream("bk1.txt"));
		oos.writeObject(b1); oos.writeObject(b2);
		oos.writeObject(b3); oos.writeObject(b4);
		oos.writeObject(b5);
		oos.close();
		System.out.println("저장 성공");
	}
}