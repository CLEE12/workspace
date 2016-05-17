package ch16;
import java.io.*;
import java.util.Scanner;
public class FileOut1Ex {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("저장할 파일명?");
		String fileName = sc.nextLine();
		System.out.println("저장할 메세지는?");
		String msg = sc.nextLine();
		FileOutputStream fos = new FileOutputStream(fileName);
		byte[] bt = msg.getBytes();
		fos.write(bt);
		fos.close();
		System.out.println("저장 성공");
		sc.close();
	}
}
