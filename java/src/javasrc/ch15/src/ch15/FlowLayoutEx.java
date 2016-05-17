package ch15;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
public class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() {
		JButton[] jb = new JButton[51];
		setLayout(new FlowLayout());
		for(int i=1; i<jb.length; i++) {
			jb[i] = new JButton(i+"¹ø");
			add(jb[i]);
		}
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}
