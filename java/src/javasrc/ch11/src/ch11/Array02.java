package ch11;

import java.util.ArrayList;

public class Array02 {
	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Apple");
		al1.add("Banana");
		al1.add("Madarine");
		al1.add("Orange");
		al1.add("Banana");
		
		for(int i=0; i<al1.size(); i++) {
			if(i==al1.size()-1)
				System.out.println(al1.get(i));
			else System.out.println(al1.get(i)+" ");
		}
		System.out.println();
		for(String a : al1) {
			System.out.println(a+" ");
		}
	}

}
