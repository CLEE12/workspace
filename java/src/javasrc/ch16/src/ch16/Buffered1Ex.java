package ch16;
import java.io.*;
public class Buffered1Ex {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		System.out.println("이름은 ?");
		String name = br.readLine();
		System.out.println("주소은 ?");
		String addr = br.readLine();
		System.out.println(name+"님 "+addr+"에 사는 군요");
		br.close();
	}
}