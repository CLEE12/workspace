package ch11;

import java.util.HashSet;

public class HashSetEx2 {
	public static void main(String[] args) {
		HashSet<String> hs1 = new HashSet<>();
		HashSet<String> hs2 = new HashSet<>();
		String[] str = {"java","JSP","java","Spring"};
		//hs1�� �����͸� ����.
		//������ �ȵǴ� �����ʹ� hs2�� ����.
		//hs1, hs2 ���.
		/*
		 * �Ϲ� for��
		 * for(int i=0; i<str.length; i++) {
		 *     if(!hs.add(str[i])) hs2.add(str[i]);
		 */
		for(String st : str) {
			if(!hs1.add(st)) hs2.add(st);
		}
		System.out.println(hs1);
		System.out.println(hs2);
		hs1.removeAll(hs2);
		System.out.println(hs1);
		
	}

}
