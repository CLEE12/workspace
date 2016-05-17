package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1Ex {
	public static void main(String[] args) {
		ArrayList<String> anml = new ArrayList<>();
		anml.add("»êÅä³¢");
		anml.add("ÁýÅä³¢");
		anml.add("ÆÇÅä³¢");
		anml.add("Á×ÀºÅä³¢");
		anml.add("¾ËÄ«¸®Åä³¢");
		Iterator<String> it = anml.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
