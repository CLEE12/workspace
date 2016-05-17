package ch15;
import javax.swing.*;
public class JButton4Ex extends JFrame { //마우스 오버 구
	public JButton4Ex() {
		ImageIcon b1 = new ImageIcon("b1.gif");
		ImageIcon b1p = new ImageIcon("b1p.gif");
		ImageIcon b1r = new ImageIcon("java.jpg");
		ImageIcon b2 = new ImageIcon("b2.gif");
		ImageIcon b2p = new ImageIcon("b2p.gif");
		ImageIcon b2r= new ImageIcon("logo.gif");
		
		JButton jb1 = new JButton(b1);
		jb1.setPressedIcon(b1p);
		jb1.setRolloverIcon(b1r);
	    
		JButton jb2 = new JButton(b2);
		jb2.setPressedIcon(b2p);
		jb2.setRolloverIcon(b2r);
		
		add("North",jb1);
		add("South",jb2);
		
		setSize(300,300);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JButton4Ex();
	}

}
