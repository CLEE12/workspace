package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx3 {
	public static void main(String[] args) {
		ArrayList<String> form = new ArrayList<>();
		form.add("������");
		form.add("������");
		form.add("�۾���");
		for(String cc : form) {
			System.out.println(cc);
		}
		System.out.println();
		Iterator<String> it = form.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
