package ch16;
import java.io.*;
import java.util.Date;
public class FileInfo2 {
	public static void main(String[] args) throws IOException {
		File file = new File("aa",".classpath");
		System.out.println( " 파일 상세 정보 *****" );
		System.out.println("절대 경로 :" + file.getAbsolutePath());
		System.out.println("표준 경로 :" + file.getCanonicalPath());
		System.out.println("생성일 :" + new Date(file.lastModified()));
		System.out.println( "파일 크기 : " + file.length() );
		System.out.println( "읽기 속성 : " + file.canRead() );
		System.out.println( "쓰기 속성 : " + file.canWrite() );
		System.out.println( "파일 경로 : " + file.getParent() );
		System.out.println( "숨김 속성 : " + file.isHidden() );
	}
}