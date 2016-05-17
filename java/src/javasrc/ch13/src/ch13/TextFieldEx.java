package ch13;
import java.awt.*;
public class TextFieldEx extends Frame {
	public TextFieldEx() {
		setLayout(new FlowLayout());
		Label lab1 = new Label("ID");
		TextField tf1 = new TextField("good");
		Label lab2 = new Label("Password");
		TextField tf2 = new TextField(10);
		tf2.setEchoChar('*');
		TextField tf3 = new TextField("lmao?");
		
		add(lab1);
		add(tf1);
		add(lab2);
		add(tf2);
		add(tf3);
		
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldEx();
	}

}
