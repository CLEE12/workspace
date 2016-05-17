package ch13;
import java.awt.*;
public class WindowEx extends Frame {
	Window[] win = new Window[3];
	Color[] col = {Color.RED, Color.YELLOW, Color.PINK};
	public WindowEx() {
		for(int i=0; i<win.length; i++) {
			win[i] = new Window(this);
			win[i].setBackground(col[i]);
			win[i].setBounds(20*i,20*i,80,80);
			win[i].setVisible(true);
		}
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new WindowEx();
	}

}
