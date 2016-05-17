package ch14;
import java.awt.*;
import java.awt.event.*;

public class FontEx extends Frame {
	Font font1, font2, font3;
	public FontEx() {
		setSize(200,200);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g) {
		super.paint(g);
		font1 = new Font("±Ã¼­", Font.BOLD, 12);
		font2 = new Font("¸¼Àº °íµñ", Font.ITALIC + Font.BOLD, 24);
		font3 = new Font("SansSerif", Font.PLAIN, 14);
		g.setFont(font1);
		g.drawString("Çü ±Ã¼­Ã¼´Ù Áö±Ý", 50, 50);
		g.setFont(font2);
		g.drawString("¸¼Àº °íµñ", 50, 100);
		g.setFont(font3);
		g.drawString("SansSerif", 50, 150);
	}
	public static void main(String[] args) {
		new FontEx();
	}

}
