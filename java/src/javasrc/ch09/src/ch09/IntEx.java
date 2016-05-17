package ch09;

public class IntEx {
	public static void main(String[] args) {
		int s1 = 2;
		int s2 = 2;
		int s3 = 2; //int(기본형)는 = new 형태가 안됨.
		if(s1==s2) System.out.println("s1과 s2는 같다");
		else System.out.println("s1과 s2는 다른다");
		if(s1==s3) System.out.println("s1과 s3는 같다");
		else System.out.println("s1과 s3는 다른다");
		if(s2==s3) System.out.println("s2과 s3는 같다");
		else System.out.println("s2과 s3는 다른다");
		
		/*if(s1.equals(s2)) System.out.println("s1과 s2는 같다");
		else System.out.println("s1과 s2는 다른다");
		if(s1.equals(s3)) System.out.println("s1과 s3는 같다");
		else System.out.println("s1과 s3는 다른다");
		if(s2.equals(s3)) System.out.println("s2과 s3는 같다");
		else System.out.println("s2과 s3는 다른다");*/
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
	}

}
