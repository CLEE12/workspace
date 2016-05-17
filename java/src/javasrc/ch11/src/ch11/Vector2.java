package ch11;

import java.util.Vector;

public class Vector2 {
	public static void main(String[] args) {
		Vector<String> vc = new Vector<>(5);
		vc.add("1");
		vc.add("2");
		vc.add("3");
		print(vc);
		vc.trimToSize(); // �� �뷮�� �߶󳽴�.
		print(vc);
		vc.ensureCapacity(6); // 6�� �����ŭ �뷮�� �߰� �Ѵ�.
		print(vc);
		vc.setSize(7);  // ������ 7 ����
		print(vc);
		vc.clear();
		print(vc);
		
	}
	public static void print(Vector vc) {
		System.out.println(vc);
		System.out.println("������ : "+vc.size());
		System.out.println("�뷮   : "+vc.capacity());
		System.out.println("=====================");
	}

}
