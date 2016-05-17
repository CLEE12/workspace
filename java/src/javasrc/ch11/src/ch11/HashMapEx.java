package ch11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("����", "010-1234-2354"); //put�� �Է��ϴ°�. add�� ����.
		hm.put("�ϴ�", "010-2222-3333");
		hm.put("�ִ�", "010-5454-1234");
		System.out.println("������ȭ : "+hm.get("����")); //get�� ������ �������� ��.value�� ���.
		System.out.println("�ϴ���ȭ : "+hm.get("�ϴ�"));
		System.out.println("=====================");
		
		Set<String> set = hm.keySet(); //key�� ���
		for(String s :set) {
			System.out.println(s+"��ȭ : "+hm.get(s));
		}
		Collection<String> ct = hm.values();
		for(String st : ct) {
			System.out.println(st);
		}
		
	}

}
