package ch17;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class UrlEx {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("�˰� ���� ������ url");
		String str = sc.nextLine();
		URL url = new URL(str);
		System.out.println("�������� : "+url.getProtocol());
		System.out.println("��Ʈ : "+url.getPort());
		System.out.println("ȣ��Ʈ : "+url.getHost());
		System.out.println("���� : "+url.getContent());
		System.out.println("��� : "+url.getFile());
		sc.close();
	}

}
