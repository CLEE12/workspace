package ch16;
import java.io.*;
import java.util.Date;
public class FileInfo2 {
	public static void main(String[] args) throws IOException {
		File file = new File("aa",".classpath");
		System.out.println( " ���� �� ���� *****" );
		System.out.println("���� ��� :" + file.getAbsolutePath());
		System.out.println("ǥ�� ��� :" + file.getCanonicalPath());
		System.out.println("������ :" + new Date(file.lastModified()));
		System.out.println( "���� ũ�� : " + file.length() );
		System.out.println( "�б� �Ӽ� : " + file.canRead() );
		System.out.println( "���� �Ӽ� : " + file.canWrite() );
		System.out.println( "���� ��� : " + file.getParent() );
		System.out.println( "���� �Ӽ� : " + file.isHidden() );
	}
}