package ch13;
import java.awt.*;
public class GridLayoutEx extends Frame {
	public GridLayoutEx() {
		Button btn1, btn2, btn3, btn4, btn5, btn6;
		setLayout(new GridLayout(3, 2)); //«‡ ø≠
		btn1 = new Button("±∏∑∑¿Ã");
		btn2 = new Button("∆»∑∑¿Ã");
		btn3 = new Button("ƒ•∑∑¿Ã");
		btn4 = new Button("¿∞∑∑¿Ã");
		btn5 = new Button("ø¿∑∑¿Ã");
		btn6 = new Button("ªÁ∑∑¿Ã");
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		
		setSize(200,200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
