package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1Ex {
	public static void main(String[] args) {
		ArrayList<String> anml = new ArrayList<>();
		anml.add("���䳢");
		anml.add("���䳢");
		anml.add("���䳢");
		anml.add("�����䳢");
		anml.add("��ī���䳢");
		Iterator<String> it = anml.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
