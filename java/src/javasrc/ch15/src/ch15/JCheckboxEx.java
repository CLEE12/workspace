package ch15;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCheckboxEx extends JFrame {
	public JCheckboxEx() {
		setLayout(new FlowLayout());
		JLabel jlab = new JLabel("<html><font size=14 color=red>"+"Favorite song</font></html>");
		JCheckBox jb1 = new JCheckBox("Better Faster Stonger");
		JCheckBox jb2 = new JCheckBox("get lucky");
		JCheckBox jb3 = new JCheckBox("ID");
		
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
		new JCheckboxEx();
	}

}
