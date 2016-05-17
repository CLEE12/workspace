package ch14;
import java.awt.*;
import java.awt.event.*;

public class GraphicEx extends Frame {
	public GraphicEx() {
		setSize(300,300);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				}
		});
	}
	public void paint(Graphics g) {
		g.drawLine(20, 20, 150, 150);
		g.setColor(Color.GREEN);
		g.fillRect(30, 30, 100, 100);
		g.drawRect(50, 50, 100, 100);
		g.setColor(Color.PINK);
		g.fillOval(100, 100, 120, 120);
//		g.drawOval(100, 100, 120, 120);
	}
	public static void main(String[] args) {
		new GraphicEx();
	}

}
