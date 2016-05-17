package ch16;
import java.io.*;
import java.util.GregorianCalendar;
public class ObjectInput1Ex {
	public static void main(String[] args) throws FileNotFoundException, IOException  {
		ObjectInputStream ois=new ObjectInputStream(
			new FileInputStream("daeglbak.dat")); 
		GregorianCalendar gc = null;
		while(true) {
			try {
				gc = (GregorianCalendar)ois.readObject();				
				int year = gc.get(GregorianCalendar.YEAR);
				int month=gc.get(GregorianCalendar.MONTH)+1;
				int date = gc.get(GregorianCalendar.DAY_OF_MONTH);
				System.out.printf("%d/%d/%d\n",year,month,date);
			} catch (Exception e) { 	break;		}
		}
		ois.close();
	}
}