package ch13;
import java.awt.*;

public class Label1 extends Frame {
	public Label1() {
		setTitle("잠깨");
		setLayout(new FlowLayout()); // 글씨를 상단 중앙부터 배치를 한다.
		
		Label lb1=new Label("봄");
		Label lb2=new Label("여름");
		Label lb3=new Label("가을");
		Label lb4=new Label("겨울");
		
		add(lb1);
		add(lb2);
		add(lb3);
		add(lb4);
		
		setForeground(Color.YELLOW);
		setBackground(Color.RED);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Label1();
	}

}
