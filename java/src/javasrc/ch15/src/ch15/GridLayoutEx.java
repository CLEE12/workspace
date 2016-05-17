package ch15;
import java.awt.GridLayout;
import javax.swing.*;

public class GridLayoutEx extends JFrame {
	JButton[] jb = new JButton[12];
	public GridLayoutEx() {
		setLayout(new GridLayout(3, 4));
		for (int i=0; i<jb.length; i++) {
			jb[i] = new JButton(i+"¹ø");
		    add(jb[i]);
		}
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
