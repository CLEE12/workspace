package ch09;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		Random ran = new Random();
		System.out.println(ran.nextInt(100)); // 0-99���� ����
		System.out.println(ran.nextInt(100)+1); // -2^31 ~ +2^31-1
		System.out.println(ran.nextInt());
		System.out.println(ran.nextBoolean()); // true or false
		System.out.println(ran.nextFloat()); // 0-1���� �Ǽ�
		System.out.println(ran.nextDouble()); // 0-1���� �Ǽ�
		System.out.println(ran.nextLong()); // -2^63 ~ +2^63-1
		
	}

}
