package ch08;
class Person {
	void move() {
		System.out.println("�� �ٸ��� �ȴ´�.");
	}
	void say() {
		System.out.println("��ȭ�� ��ȸ ��Ȱ�Ѵ�.");
	}
}
interface Fish {
	void breath();
	void live(); 
}
class Mermaid extends Person implements Fish { //extends�� ���� ����� �ȵȴ�. �׷��� interface�� implements�� ����ؾ� ��.
	public void breath() {
		System.out.println("�ư��̷� ���� ����.");
	}
	public void live() {
		System.out.println("������ ���.");
}
}
public class MermaidEx {
	public static void main(String[] args) {
		Mermaid mm = new Mermaid();
		mm.move();
		mm.say();
		mm.breath();
		mm.live();
	}
}
