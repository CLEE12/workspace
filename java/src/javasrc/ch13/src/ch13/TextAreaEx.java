package ch13;
import java.awt.*;
public class TextAreaEx extends Frame {
	public TextAreaEx() {
		setLayout(new FlowLayout());
		TextArea ta = new TextArea("´ë¹Ú",5,20);
		add(ta);
		setBackground(Color.PINK);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextAreaEx();
	}

}
