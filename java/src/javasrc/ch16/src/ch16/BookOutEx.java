package ch16;
import java.io.*;
public class BookOutEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		BookInfo b1=new BookInfo("111","����",20000,"�޹�",200);
		BookInfo b2=new BookInfo("222","ȫ�浿",25000,"����",220);
		BookInfo b3=new BookInfo("333","AOA",48000,"����",170);
		BookInfo b4=new BookInfo("444","�������� ���� ���Ⱦ��",
			20000,"����ö",200);
		BookInfo b5=new BookInfo("555","�ϼ��Ͱ��",10000,"����ȣ",120);
		
		ObjectOutputStream oos=new ObjectOutputStream(
			new FileOutputStream("bk1.txt"));
		oos.writeObject(b1); oos.writeObject(b2);
		oos.writeObject(b3); oos.writeObject(b4);
		oos.writeObject(b5);
		oos.close();
		System.out.println("���� ����");
	}
}