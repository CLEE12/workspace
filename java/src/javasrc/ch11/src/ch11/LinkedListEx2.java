package ch11;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx2 {
	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<>();
		l1.add("±∏∑∑¿Ã");
		l1.add("±∏∑∑ªÔ");
		l1.add("±∏∑∑ªÁ");
		l1.add("±∏∑∑ø¿");
		l1.add("±∏∑∑¿∞");
		for(int i=0; i<l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		System.out.println("==============");
		Iterator<String> it = l1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
