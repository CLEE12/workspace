package ch11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap2Ex {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap();
		hm.put("�̸�", "���"); //key���� �迭 ��ȣ ������ �����ϰ�
		hm.put("����", "�ڰ��");  // �ڿ� value���� �������� �����ϸ� �ȴ�.
		hm.put("�ϴ�", "���");
		hm.put("�±�", "¥������");
		hm.put("����", "����");
		System.out.println("���� ��� : "+hm.get("����"));
		System.out.println("=====================");
		Set<String> set = hm.keySet();
		for(String str : set) {
			System.out.println(str+"��� : "+hm.get(str));
		}
		System.out.println("=====================");
		Collection<String> ct = hm.values();
		for(String st : ct) {
			System.out.println(st);
		}
	}

}
