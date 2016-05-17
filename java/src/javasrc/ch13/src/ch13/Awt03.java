package ch13;
import java.awt.*;
public class Awt03 extends Frame { //프레임을 상속받음. 부모의 멤버변수
	Awt03(String title) {
		//super(title);  //생성자를 통해서 입력
		setTitle(title); //메소드를 통해서 입력
		setSize(200, 200);
		setBackground(Color.RED);
		setVisible(true);
	}
	public static void main(String[] args) {
		//Awt03 f1 = new Awt03();		
		new Awt03("대박"); //<--일반적으로 Awt를 생성할땐 이렇게 사용 함.
		
	}
}