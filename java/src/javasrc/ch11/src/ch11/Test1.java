package ch11;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		
		al1.add(3);
		al1.add(4);
		al1.add(5);
		al1.add(6);
		
		ArrayList<Integer> kyo = new ArrayList<>();
		ArrayList<Integer> cha = new ArrayList<>();
		ArrayList<Integer> hap = new ArrayList<>();
		
		kyo.addAll(al1); //kyo에 a1의 값을 모두 넣어준다.
		kyo.retainAll(al2); //a2와 똑같은것을 남겨라.
		cha.addAll(al1); //cha에 a1의 값을 모두 넣어준다.
		cha.removeAll(al2); //a2에 있는것을 제거하라
		hap.addAll(al1); //hap에 a1의 값을 모두 넣어준다.
		hap.removeAll(kyo); //교집합을 뺀다. (3,4)를 뺀다.
		hap.addAll(al2); // hap에 a2의 값을 모두 넣는다.
		
		System.out.println("공통지합 : "+kyo);
		System.out.println("차지합   : "+cha);
		System.out.println("합지합   : "+hap);	
	}
}
