package ch11;

import java.util.ArrayList;

public class Gene01 {
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList<>();   //ArrayList �� ���� ���� ��� ������. ���׸��� ��ĭ.
		al1.add("���");
		al1.add("���");
		al1.add(12);
		al1.add("��");
		al1.add("��~");
		al1.add("35"); prn(al1);
		
		ArrayList<String> al2 = new ArrayList<>(); //ArrayList<String>�� ���ڸ� ����. ���׸��� String.
		al2.add("���");
		al2.add("���");
		//al2.add(12);
		al2.add("��");
		al2.add("��~");
		al2.add("35"); prn(al2);
		
		ArrayList<Integer> al3 = new ArrayList<>(); //ArrayList(Integer)�� ���ڸ� ����. ���׸�(label)�� Integer
		/*al3.add("���");
		al3.add("���");*/
		al3.add(12); prn(al3);
	}
	public static void prn(ArrayList al) {
		for(int i=0; i<al.size(); i++) {
			if (i==al.size()-1) System.out.println(al.get(i));
			else System.out.print(al.get(i)+",");
		}
	}

}
