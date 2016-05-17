package ch16;
import java.io.*;
public class FileWriter1Ex {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		System.out.println("저장할 파일명 ?");
		String fileName = br.readLine();
		System.out.println("저장할 내용");
		String content = br.readLine();
		FileWriter fw  = new FileWriter(fileName);
		fw.write(content);
		System.out.println("저장 완료");
		fw.close();
		br.close();
	}
}