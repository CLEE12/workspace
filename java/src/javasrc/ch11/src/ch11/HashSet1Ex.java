package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1Ex {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("������");
		hs.add("�ֹ���");
		hs.add("������");
		hs.add("������");
		hs.add("������");
		for(String str : hs) {
			System.out.println(str);
		}
		System.out.println("+++++++++++");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}