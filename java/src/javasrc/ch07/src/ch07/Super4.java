package ch07;

class H1 {
	int a;
	H1() { 
		System.out.println("�Ű����� ���� �θ�"); 
		}
	H1(int k) { 
		this(); 
		System.out.println("�Ű����� 1���� k = "+k); 
		}
}
class H2 extends H1 {
	H2(){ 
		super(7); 
		System.out.println("�Ű����� 1���� �θ�"); 
		}
	H2(int k){ 
		this(); 
		a += k; 
		System.out.println("�� �Ű����� 1�� �ڽ�"); 
		}
	void h2() { 
		System.out.println("a = "+a); 
		}
}
public class Super4 {
	public static void main(String[] args) {
		H2 h2 = new H2(67);
		h2.h2();
	}

}
