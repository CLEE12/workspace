package ch11;

import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		String[] snake = {"������","�ȷ���","ĥ����","������"};
		LinkedList<String> l1 = new LinkedList<>();
		for(String sk : snake) {
			//l1.offer(sk);
			l1.add(sk);
		}
		while(!l1.isEmpty()) {
			System.out.println(l1.poll()); //�а� �� ������ ��
			//get�� �б⸸ �ϴ� ��
		}
	}
}
