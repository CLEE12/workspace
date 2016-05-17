package ch09;
public class SystemEx {
	public static void main(String[] args) {
		String path = System.getenv("path");
		String java_home = System.getenv("java_home");
		System.out.println(java_home);
		System.out.println(path);
	}
}