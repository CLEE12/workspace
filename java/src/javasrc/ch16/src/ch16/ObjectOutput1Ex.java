package ch16;
import java.io.*;
import java.util.GregorianCalendar;
public class ObjectOutput1Ex {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		GregorianCalendar gc1=new GregorianCalendar(2016,1,12);
		GregorianCalendar gc2=new GregorianCalendar(2016,2,12);
		GregorianCalendar gc3=new GregorianCalendar(2016,0,12);
		ObjectOutputStream oos=new ObjectOutputStream(
			new FileOutputStream("daeglbak.dat"));
		oos.writeObject(gc1);
		oos.writeObject(gc2);
		oos.writeObject(gc3);
		oos.close();
		System.out.println("날자 저장완료");
	}
}