package ch11;

import java.util.ArrayList;

public class Array01 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("������"); //index# 0
		al.add("�ȷ���"); //index# 1
		al.add("ĥ����"); //index# 2
		al.add("������"); //index# 3
		al.add("������"); //index# 4
		al.add("������"); //index# 5
		for(int i=0; i<al.size(); i++) {   //�迭�� size()
			System.out.println(al.get(i)+" ");
		}
		System.out.println();
		for(String a : al) {
			System.out.println(a+" ");
		}
	}

}
