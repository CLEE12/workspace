package ch13;
import java.awt.*;
public class LabelButton2 extends Frame {
	Button[] btn = new Button[50];
	Label[] lab = new Label[50];
	public LabelButton2() {
		setLayout(new FlowLayout());
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(i+"¹ø");
			add(btn[i]);
			lab[i] = new Label(i+"¹ø");
			add(lab[i]);
			if(i%2!=0) {
				btn[i].setBackground(Color.PINK);
				lab[i].setBackground(Color.CYAN);
			}
			else {
				btn[i].setEnabled(false);
				lab[i].setBackground(Color.MAGENTA);
			}
			if(i%3==0) {
				btn[i].setForeground(Color.RED);
				lab[i].setForeground(Color.BLUE);
			}
		}
		setBackground(Color.YELLOW);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new LabelButton2();
	}
}
