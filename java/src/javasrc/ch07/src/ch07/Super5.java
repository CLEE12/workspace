package ch07;
class J1 {
	String a = "엄카로 결제 했습니다.";
	J1() {
		System.out.println("엄마 : 콩나물 사와");
	}
	void aa() {
		System.out.println("엄마 : 이걸로 내!");
	}
}
class J2 extends J1 {
	String a = "내돈이 줄줄 새고있습니다."; //int a = 56이 없을경우 밑에 있는 aa();에 super.을 쓰지 않을 경우 int a = 11이 나옴.
	J2() {
		System.out.println("나 : 가는길에 육포하나 사먹을께!");
	}
	void aa() {
		System.out.println("나 : 내가 낼께!");
	}
	void bb() {
		aa(); //super.aa 하면 J1에서 데려오고, 그냥 하면 가까운 놈을 데려온다.
		System.out.println("a = "+a);
		//System.out.println("a = "+super.a); <- 엄마돈 빵꾸내는 방법.
	}
}
public class Super5 {
	public static void main(String[] args) {
		J2 j = new J2();
		j.bb();
	}

}
