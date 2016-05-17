package ch16;
import java.io.*;
import java.util.Scanner;
public class FileReader1Ex {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("읽을 파일명 ?");
		String fileName = sc.nextLine();
		FileReader fr = new FileReader(new File(fileName));
		int data = 0;
		while((data=fr.read())!=-1) {
			System.out.print((char)data);
		}
		fr.close();
		sc.close();
	}
}