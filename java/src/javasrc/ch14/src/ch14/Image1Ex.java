package ch14;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.*;
public class Image1Ex extends Frame {
	Image img;
	public Image1Ex() {
		img=Toolkit.getDefaultToolkit().getImage("LENNA.JPG");
		setSize(300,300); setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);		}	});
	}
	public static void main(String[] args) {
		new Image1Ex();
	}
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
}