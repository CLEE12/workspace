package ch11;

import java.util.ArrayList;

public class Gene01 {
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList<>();   //ArrayList 는 문자 숫자 모두 가능함. 제네릭이 빈칸.
		al1.add("대박");
		al1.add("사건");
		al1.add(12);
		al1.add("헐");
		al1.add("즐~");
		al1.add("35"); prn(al1);
		
		ArrayList<String> al2 = new ArrayList<>(); //ArrayList<String>은 문자만 가능. 제네릭이 String.
		al2.add("대박");
		al2.add("사건");
		//al2.add(12);
		al2.add("헐");
		al2.add("즐~");
		al2.add("35"); prn(al2);
		
		ArrayList<Integer> al3 = new ArrayList<>(); //ArrayList(Integer)은 숫자만 가능. 제네릭(label)이 Integer
		/*al3.add("대박");
		al3.add("사건");*/
		al3.add(12); prn(al3);
	}
	public static void prn(ArrayList al) {
		for(int i=0; i<al.size(); i++) {
			if (i==al.size()-1) System.out.println(al.get(i));
			else System.out.print(al.get(i)+",");
		}
	}

}
