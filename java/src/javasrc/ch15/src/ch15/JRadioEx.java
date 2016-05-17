package ch15;

import java.awt.FlowLayout;

import javax.swing.*;

public class JRadioEx extends JFrame {
	public JRadioEx() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel jlab = new JLabel("<html><font size=14 color=red>"+"Favorite song</font></html>");
		JRadioButton jb1 = new JRadioButton("Better Faster Stonger");
		JRadioButton jb2 = new JRadioButton("get lucky");
		JRadioButton jb3 = new JRadioButton("ID");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jb1);
		bg.add(jb2);
		bg.add(jb3);
		
		add(jlab);
		add(jb1);
		add(jb2);
		add(jb3);
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new JRadioEx();
	}

}
