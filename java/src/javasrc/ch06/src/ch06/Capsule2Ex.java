package ch06;
class P2 { //encapsulation(ĸ��ȭ), information hidding(��������)
	private String name;
	private int age;
	public void setName(String name) { //ĸ��ȭ. private�� ������ �ȵ�.
		this.name = name; //ĸ��ȭ ����.
	} // Generator�� ����� �� Ŀ���� ��ġ�� �߿�.
	
	public void setAge(int age) {
		if (age <10) {this.age = 20;
		System.out.println("�ȹٷ���");
		}
		else this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		if(age<=0) System.out.println("���� �׷����̰� �����");
		return age;
	}
	void print() {
		//System.out.println(name+"�� ���̴� "+age+"�̴�.");
	}
}
public class Capsule2Ex {
	public static void main(String[] args) {
		P2 p = new P2();
		p.setName ("����"); //p.name = "����"; ���� ĸ��ȭ�Ȱ��� ����� �� �ְ� ����.
		p.setAge  (22);
		p.print();
		System.out.println(p.getName()+"�� "+p.getAge()+"���̴�.");
	}

}
