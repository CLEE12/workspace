package ch16;
import java.io.*;
public class GoodStockOutEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos=new ObjectOutputStream(
			new FileOutputStream("stock.txt"));
		GoodStock gs1 = new GoodStock("101", 10);
		GoodStock gs2 = new GoodStock("201", 15);
		GoodStock gs3 = new GoodStock("301", 22);
		oos.writeObject(gs1);
		oos.writeObject(gs2);
		oos.writeObject(gs3);
		oos.close();
		System.out.println("저장 완료");
	}
}