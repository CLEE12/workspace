package ch13;

import java.awt.Frame;

public class Awt01 {
	public static void main(String[] args) {
		Frame f1 = new Frame("Awt Test");
		f1.setSize(400,400); //이미지 사이즈 picxel
		f1.setLocation(200,200); // 왼쪽 모서리의 위치 설정
		//f1.setBound(200,200,400,400) x,y,넓이,높이
		f1.setVisible(true); 
	}
}
