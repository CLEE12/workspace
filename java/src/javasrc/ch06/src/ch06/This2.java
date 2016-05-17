package ch06;
class F2 {
	String str; int num;
	F2() {
		System.out.println("대박");
	}
	F2(String str) {
		this();
		this.str = str;
		System.out.println("사건");
	}
	F2(String str, int num) {
		this(str);
		this.num = num;
		System.out.println("헐~");
	} 
	void print() {
		for(int i=0; i<num; i++) {
			System.out.println(str);
		}
	}
		
}
public class This2 {
	public static void main(String[] args) {
		F2 f2 = new F2("야호 ! 1시간", 5);
		f2.print();
	}
}
