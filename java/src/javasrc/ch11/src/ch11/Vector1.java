package ch11;
import java.util.Vector;
public class Vector1 {
	public static void main(String[] args) {
		Vector<String> al = new Vector<>();
		al.add("±∏∑∑¿Ã"); al.add("∆»∑∑¿Ã"); al.add("ƒ•∑∑¿Ã");
		al.add("±∏∑∑¿Ã"); al.add("±∏∑∑ªÔ"); al.add("±∏∑∑ªÁ");
		prn(al);
		al.add(2,"µµ∏∂πÏ"); prn(al);
		al.set(3,"π¯µ•±‚"); prn(al);
		al.remove(1); 	   prn(al);
		System.out.println("±∏∑∑¿Ã ¿Œµ¶Ω∫ : "+al.indexOf("±∏∑∑¿Ã"));
		System.out.println("±∏∑∑¿Ã ¿Œµ¶Ω∫ : "+al.lastIndexOf("±∏∑∑¿Ã"));
	}
	public static void prn(Vector<String> al) {
		for(int i=0; i< al.size();i++) {
			if (i==al.size()-1) System.out.println(al.get(i));
			else System.out.print(al.get(i)+",");
		}
	}
}
