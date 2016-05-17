package ch17;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class UrlEx {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("알고 싶은 도메인 url");
		String str = sc.nextLine();
		URL url = new URL(str);
		System.out.println("프로토콜 : "+url.getProtocol());
		System.out.println("포트 : "+url.getPort());
		System.out.println("호스트 : "+url.getHost());
		System.out.println("내용 : "+url.getContent());
		System.out.println("경로 : "+url.getFile());
		sc.close();
	}

}
