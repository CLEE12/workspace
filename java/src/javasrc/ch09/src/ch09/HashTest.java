package ch09;
public class HashTest {
	public static void main(String[] args) {
		String a = "";
		String b = null;
		String str1 = new String("damn!");
		String str2 = new String("snow");
		String str3 = new String("storm");
		String str4 = new String("damn!");
		System.out.println("str1 = "+str1.hashCode());
		System.out.println("str2 = "+str2.hashCode());
		System.out.println("str3 = "+str3.hashCode());
		System.out.println("str4 = "+str4.hashCode());
		System.out.println("====================");
		System.out.println("str1-2 = "+System.identityHashCode(str1));
		System.out.println("str2-2 = "+System.identityHashCode(str2));
		System.out.println("str3-2 = "+System.identityHashCode(str3));
		System.out.println("str4-2 = "+System.identityHashCode(str4));
		
		
		System.out.println("a (" + ") = "+System.identityHashCode(a));
		System.out.println("b (null) = "+System.identityHashCode(b));
		/*
		원래 주소는 System.identityHashCode로 확인하는 위치이나, System.identityHashCode로 확인하면
		임의의 위치를 보여준다(?)
		*/
	}

}
