package ch11;
import java.util.Vector;
public class Vector1 {
	public static void main(String[] args) {
		Vector<String> al = new Vector<>();
		al.add("������"); al.add("�ȷ���"); al.add("ĥ����");
		al.add("������"); al.add("������"); al.add("������");
		prn(al);
		al.add(2,"������"); prn(al);
		al.set(3,"������"); prn(al);
		al.remove(1); 	   prn(al);
		System.out.println("������ �ε��� : "+al.indexOf("������"));
		System.out.println("������ �ε��� : "+al.lastIndexOf("������"));
	}
	public static void prn(Vector<String> al) {
		for(int i=0; i< al.size();i++) {
			if (i==al.size()-1) System.out.println(al.get(i));
			else System.out.print(al.get(i)+",");
		}
	}
}
