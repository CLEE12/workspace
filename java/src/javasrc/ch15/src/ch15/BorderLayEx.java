package ch15;

import javax.swing.*;

public class BorderLayEx extends JFrame {
	public BorderLayEx() {
		add("North", new JButton("N")); //add("location", new JButton("show off"));
		add("South", new JButton("S"));
		add("West", new JButton("W"));
		add("East", new JButton("E"));
		add("Center", new JButton("C"));
		
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new BorderLayEx();
	}

}
