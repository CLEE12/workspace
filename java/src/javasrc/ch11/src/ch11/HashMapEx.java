package ch11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("설현", "010-1234-2354"); //put은 입력하는것. add와 같다.
		hm.put("하니", "010-2222-3333");
		hm.put("주니", "010-5454-1234");
		System.out.println("설현전화 : "+hm.get("설현")); //get은 정보를 가져오는 것.value만 출력.
		System.out.println("하니전화 : "+hm.get("하니"));
		System.out.println("=====================");
		
		Set<String> set = hm.keySet(); //key값 출력
		for(String s :set) {
			System.out.println(s+"전화 : "+hm.get(s));
		}
		Collection<String> ct = hm.values();
		for(String st : ct) {
			System.out.println(st);
		}
		
	}

}
