package ch06;

public class CallMethod {
	int x = 7; //생성후에 사용가능
	static int y = 10; // 메모리에 load할때, 선언할때, 생성전에
	void aa() { //생성후에 사용가능
		System.out.println("aa x = "+x);
		System.out.println("aa y = "+y);
	}
	static void bb() { //메모리에 load할때, 선언할때, 생성전에
		//System.out.println("bb x = "+x);
		System.out.println("bb y = "+y);
	}
	void K1() {
		aa(); 
		bb();
	}
	void K2() {
		//aa(); 
		bb();
	}

}
//static은 객체가 여러번이더라도 첫번째에 한번
//instance는 객체마다 생성