package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1Ex {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("±¿∫¨¿Ã");
		hs.add("æ÷π˙∑π");
		hs.add("ª∑µ•±‚");
		hs.add("±¿∫¨¿Ã");
		hs.add("∞ı∫¨¿Ã");
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
