package ch06;

public class Return1 {
	static int add(int x, int y) {
		int result = x + y;
		return result;
	}
	int minus(int x, int y) {
  //void는 return을 원하지 않는다
		return x-y; //위에 return도 가능하고 이것도 가능.
	}
	String str(String k) {
		return k;
	}
	public static void main(String[] args) {
		Return1 r = new Return1();
		int a = r.add(7,8);
		short b = (short)r.minus(32, 23);
		String k= r.str("오늘은 내가 짜파게티 요리사");
		System.out.println(a);
		//System.out.println(r.add(7,8));
		System.out.println(b);
		System.out.println(k);
	}
}
