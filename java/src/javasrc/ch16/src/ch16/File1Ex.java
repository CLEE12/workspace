package ch16;
import java.io.*;
public class File1Ex {
	public static void main(String[] args) {
/*		File dir = new File(".");
		File dir = new File("src/ch16");
		File dir = new File("src/ch16");
		File dir = new File("../ch15");
		File dir = new File("../../");*/
		
		File dir = new File("src/ch16"); //
		String[] list = dir.list();
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
/*
절대경로보다 상대경로가 더욱 중요하다.
1.상대경로 :  현재 위치를 기준으로 찾아감  c-java-javaSrc-ch15-src-ch15
                                                -ch16-src-ch16
2.절대경로 : 루트를 기준으로 찾아

*/