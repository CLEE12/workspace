package ch11;

import java.util.Random;
import java.util.TreeSet;

public class Lotto2 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>(); //�ߺ��� ������ ��� ó���Ѵ�.
		Random ran = new Random();
		while(ts.size() < 6) {
			int num = ran.nextInt(45)+1;
			ts.add(num);
		}
		System.out.println(ts); 
	}

}
