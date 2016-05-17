package ch15;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButton1Ex extends JFrame {
	public JButton1Ex() {
		setLayout(new FlowLayout());
		JButton jb1 = new JButton("첫번째");
		JButton jb2 = new JButton("두번");
		JButton jb3 = new JButton("번째");
		
		add(jb1);
		add(jb2);
		add(jb3);
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JButton1Ex();
	}

}
