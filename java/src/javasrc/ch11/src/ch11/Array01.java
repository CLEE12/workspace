package ch11;

import java.util.ArrayList;

public class Array01 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("±∏∑∑¿Ã"); //index# 0
		al.add("∆»∑∑¿Ã"); //index# 1
		al.add("ƒ•∑∑¿Ã"); //index# 2
		al.add("±∏∑∑¿Ã"); //index# 3
		al.add("±∏∑∑ªÔ"); //index# 4
		al.add("±∏∑∑ªÁ"); //index# 5
		for(int i=0; i<al.size(); i++) {   //πËø≠¿∫ size()
			System.out.println(al.get(i)+" ");
		}
		System.out.println();
		for(String a : al) {
			System.out.println(a+" ");
		}
	}

}
