package ch15;
import javax.swing.*;
public class JButton2Ex extends JFrame{
	public JButton2Ex() {
		String str = JOptionPane.showInputDialog("Say something?");
		JButton jb = new JButton("<html><font size=20 color=red>"+str+"</font></html>");
		add(jb);
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JButton2Ex();
	}
}
