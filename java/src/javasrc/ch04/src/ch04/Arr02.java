package ch04;

public class Arr02 {
	public static void main(String[] args) {
		int[] a1 = {45, 768, 12, 98}; //������ ����
		/*
		int[] a2;
		a2 = {45, 768, 12, 87}; �ַ� �߻�
		*/
		String[] st1 = new String[] {"���","�ʹ�","���","���"};
		String[] st2;
		st2 = new String[]{"���","�ʹ�","���","���"};
		
		for(int i=0; i<a1.length; i++) {
			System.out.println("a["+i+"]"+" = "+a1[i]);
		}
		System.out.println("=================");
		for(int j : a1) {
			System.out.println(j);
		}
		System.out.println("=================");
		for(String str : st1) {
			System.out.println(str);
		}
	}

}