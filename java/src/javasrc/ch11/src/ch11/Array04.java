package ch11;

import java.util.ArrayList;

public class Array04 {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<>();
		ar.add("±¸··ÀÌ");
		ar.add("ÆÈ··ÀÌ");
		ar.add("Ä¥··ÀÌ");
		ar.add("À°··ÀÌ");
		ar.add("¿À··ÀÌ");
		ar.add("±¸··ÀÌ"); shit(ar);
		ar.add(2,"µµ¸¶¹ì"); shit(ar);
		ar.set(3,"¹øµ¥±â"); shit(ar);
		ar.remove(1);
	}
	public static void shit(ArrayList<String> ar) {
		for(int i=0; i<ar.size(); i++) {
			if(i==ar.size()-1)
				System.out.print(ar.get(i));
			else System.out.print(ar.get(i)+" , ");			
		}
		System.out.println();
	}
}