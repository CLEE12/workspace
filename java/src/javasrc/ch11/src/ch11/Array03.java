package ch11;

import java.util.ArrayList;

public class Array03 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("apple");
		al.add("watermelon");
		al.add("tangerin");
		al.add("apple");
		al.add("strawberry"); prn(al); //<- method 호출
		al.add(2,"kiwi"); prn(al);
		al.set(3,"grape"); prn(al); // add는 추가. set은 교체
		al.remove(1); prn(al);
		System.out.println("사과 인덱스 : "+al.indexOf("apple")); //일반적인 상황에 사용하는 index 확인 방법
		System.out.println("사과 인덱스 : "+al.lastIndexOf("apple")); //중복단어의 마지막것을 찾기위한 방법
	}
	public static void prn(ArrayList<String> al) {
		for(int i=0; i<al.size(); i++) {
			if(i==al.size()-1)
				System.out.print(al.get(i));
			else System.out.print(al.get(i)+" , ");
		}
		System.out.println();
	}

}
