package ch16;
import java.io.*;
public class Buffered1Ex {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		System.out.println("�̸��� ?");
		String name = br.readLine();
		System.out.println("�ּ��� ?");
		String addr = br.readLine();
		System.out.println(name+"�� "+addr+"�� ��� ����");
		br.close();
	}
}