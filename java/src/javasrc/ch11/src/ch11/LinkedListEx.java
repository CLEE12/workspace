package ch11;

import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		String[] snake = {"±¸··ÀÌ","ÆÈ··ÀÌ","Ä¥··ÀÌ","À°··ÀÌ"};
		LinkedList<String> l1 = new LinkedList<>();
		for(String sk : snake) {
			//l1.offer(sk);
			l1.add(sk);
		}
		while(!l1.isEmpty()) {
			System.out.println(l1.poll()); //ÀÐ°í³­ µÚ ¹ö¸®´Â °Í
			//getÀº ÀÐ±â¸¸ ÇÏ´Â °Í
		}
	}
}
