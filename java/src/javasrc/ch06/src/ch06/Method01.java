package ch06;

class A1 {
	public void print() {
//����������   ��ȯ��  �޼ҵ��(){
		System.out.println("�ȳ�"); // <-- ���๮
	}

}

public class Method01 {
	public static void main(String[] args) {
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		
		A1 a1 = new A1();
		for (int i=0; i<10; i++) {
			a1.print();
		}
	}
}