package ch16;
import java.io.*;
public class FileWriter1Ex {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		System.out.println("������ ���ϸ� ?");
		String fileName = br.readLine();
		System.out.println("������ ����");
		String content = br.readLine();
		FileWriter fw  = new FileWriter(fileName);
		fw.write(content);
		System.out.println("���� �Ϸ�");
		fw.close();
		br.close();
	}
}