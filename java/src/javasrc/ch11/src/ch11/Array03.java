package ch11;

import java.util.ArrayList;

public class Array03 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("apple");
		al.add("watermelon");
		al.add("tangerin");
		al.add("apple");
		al.add("strawberry"); prn(al); //<- method ȣ��
		al.add(2,"kiwi"); prn(al);
		al.set(3,"grape"); prn(al); // add�� �߰�. set�� ��ü
		al.remove(1); prn(al);
		System.out.println("��� �ε��� : "+al.indexOf("apple")); //�Ϲ����� ��Ȳ�� ����ϴ� index Ȯ�� ���
		System.out.println("��� �ε��� : "+al.lastIndexOf("apple")); //�ߺ��ܾ��� ���������� ã������ ���
	}
	public static void prn(ArrayList<String> al) {
		for(int i=0; i<al.size(); i++) {
			if(i==al.size()-1)
				System.out.print(al.get(i));
			else System.out.print(al.get(i)+" , ");
		}
		System.out.println();
	}

}
