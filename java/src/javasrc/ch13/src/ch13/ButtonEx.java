package ch13;
import java.awt.*;
public class ButtonEx extends Frame {
	public ButtonEx() {
		setLayout(new FlowLayout());
		setForeground(Color.BLUE);
		setBackground(Color.BLACK);
		Button btn1 = new Button("����");
		Button btn2 = new Button("����");
		Button btn3 = new Button("��");
		
		add(btn1);
		add(btn2);
		add(btn3);
		btn1.setBackground(Color.RED);
		btn2.setBackground(Color.ORANGE);
		btn3.setBackground(Color.GREEN);
		setSize(200,200);
		setVisible(true);
	}
	public static void main (String[] args) {
		new ButtonEx();
	}
}
