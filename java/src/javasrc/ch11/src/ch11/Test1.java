package ch11;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		
		al1.add(3);
		al1.add(4);
		al1.add(5);
		al1.add(6);
		
		ArrayList<Integer> kyo = new ArrayList<>();
		ArrayList<Integer> cha = new ArrayList<>();
		ArrayList<Integer> hap = new ArrayList<>();
		
		kyo.addAll(al1); //kyo�� a1�� ���� ��� �־��ش�.
		kyo.retainAll(al2); //a2�� �Ȱ������� ���ܶ�.
		cha.addAll(al1); //cha�� a1�� ���� ��� �־��ش�.
		cha.removeAll(al2); //a2�� �ִ°��� �����϶�
		hap.addAll(al1); //hap�� a1�� ���� ��� �־��ش�.
		hap.removeAll(kyo); //�������� ����. (3,4)�� ����.
		hap.addAll(al2); // hap�� a2�� ���� ��� �ִ´�.
		
		System.out.println("�������� : "+kyo);
		System.out.println("������   : "+cha);
		System.out.println("������   : "+hap);	
	}
}
