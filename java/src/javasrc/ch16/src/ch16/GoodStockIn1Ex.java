package ch16;
import java.io.*;
public class GoodStockIn1Ex {
	public static void main(String[] args) throws IOException {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(
				new FileInputStream("stock.txt"));
			while(true) {
				GoodStock gs = (GoodStock)ois.readObject();
				System.out.println("�ڵ� : "+gs.code);
				System.out.println("��� : "+gs.num);
				System.out.println("================");
			}
		} catch (Exception e) {	
		} finally { ois.close();	}		
	}
}