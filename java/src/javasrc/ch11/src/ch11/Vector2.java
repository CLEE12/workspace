package ch11;

import java.util.Vector;

public class Vector2 {
	public static void main(String[] args) {
		Vector<String> vc = new Vector<>(5);
		vc.add("1");
		vc.add("2");
		vc.add("3");
		print(vc);
		vc.trimToSize(); // 빈 용량을 잘라낸다.
		print(vc);
		vc.ensureCapacity(6); // 6의 배수만큼 용량을 추가 한다.
		print(vc);
		vc.setSize(7);  // 사이즈 7 예약
		print(vc);
		vc.clear();
		print(vc);
		
	}
	public static void print(Vector vc) {
		System.out.println(vc);
		System.out.println("사이즈 : "+vc.size());
		System.out.println("용량   : "+vc.capacity());
		System.out.println("=====================");
	}

}
