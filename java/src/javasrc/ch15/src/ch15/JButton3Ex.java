package ch15;

import javax.swing.*;

public class JButton3Ex extends JFrame {
	public JButton3Ex() {
		ImageIcon i1 = new ImageIcon("java.jpg");
		ImageIcon i2 = new ImageIcon("logo.gif");
		JButton jb1 = new JButton ("ÀÚ¹Ù", i1);
		JButton jb2 = new JButton ("¹»ÀÚ¹Ù", i2);
		jb1.setToolTipText("say something");
		jb2.setToolTipText("say something more");
		add("North", jb1);
		add("South", jb2);
		setSize(200,200);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JButton3Ex();
	}

}
