package ch11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap2Ex {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap();
		hm.put("이름", "취미"); //key값은 배열 번호 정도로 생각하고
		hm.put("설현", "코골기");  // 뒤에 value값은 내용으로 생각하면 된다.
		hm.put("하니", "울기");
		hm.put("승기", "짜증내기");
		hm.put("수지", "졸기");
		System.out.println("설현 취미 : "+hm.get("설현"));
		System.out.println("=====================");
		Set<String> set = hm.keySet();
		for(String str : set) {
			System.out.println(str+"취미 : "+hm.get(str));
		}
		System.out.println("=====================");
		Collection<String> ct = hm.values();
		for(String st : ct) {
			System.out.println(st);
		}
	}

}
