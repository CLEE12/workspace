package ch09;

public class String1 {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		if(s1==s2) System.out.println("s1과 s2는 같다");
		else System.out.println("s1과 s2는 다른다");
		if(s1==s3) System.out.println("s1과 s3는 같다");
		else System.out.println("s1과 s3는 다른다");
		if(s2==s3) System.out.println("s2과 s3는 같다");
		else System.out.println("s2과 s3는 다른다");
		System.out.println("===============");
		if(s1.equals(s2)) System.out.println("s1과 s2는 같다");
		else System.out.println("s1과 s2는 다른다");
		if(s1.equals(s3)) System.out.println("s1과 s3는 같다");
		else System.out.println("s1과 s3는 다른다");
		if(s2.equals(s3)) System.out.println("s2과 s3는 같다");
		else System.out.println("s2과 s3는 다른다");
		
		System.out.println("===============");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		//equals는 내용이 같으면 메모리 주소가 달라도 같다고 인정.
		//if는 메모리 주소가 같아야 같다고 인정.
	}

}
