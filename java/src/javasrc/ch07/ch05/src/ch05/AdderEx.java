package ch05;

class Adder {
	int x, y;
	void add() {
		System.out.println("�μ��� ��: "+(x+y));
	}

}

class AdderEx { 
	//Ŭ������ ��ĥ��� add�� AdderEx�� Ŭ�������� ���ƾ� �Ѵ�.
	public static void main(String[] args) {
		Adder a1 = new Adder();
		a1.x = 15;
		a1.y = 20;
		a1.add();
	}
}