package ch16;
import java.io.*;
import java.util.Scanner;
public class FileReader2Ex {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("읽을 파일명 ?");
		String fileName = sc.nextLine();
		BufferedReader br = new BufferedReader(
			new FileReader(new File(fileName)));
		String msg = null;
		while((msg=br.readLine()) !=null) {
			System.out.print(msg);
		}
		br.close();
		sc.close();
	}
}