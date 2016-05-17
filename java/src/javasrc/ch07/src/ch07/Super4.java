package ch07;

class H1 {
	int a;
	H1() { 
		System.out.println("매개변수 없는 부모"); 
		}
	H1(int k) { 
		this(); 
		System.out.println("매개변수 1개는 k = "+k); 
		}
}
class H2 extends H1 {
	H2(){ 
		super(7); 
		System.out.println("매개변수 1개인 부모"); 
		}
	H2(int k){ 
		this(); 
		a += k; 
		System.out.println("난 매개변수 1개 자식"); 
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
