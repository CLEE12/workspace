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
				System.out.println("코드 : "+gs.code);
				System.out.println("재고 : "+gs.num);
				System.out.println("================");
			}
		} catch (Exception e) {	
		} finally { ois.close();	}		
	}
}