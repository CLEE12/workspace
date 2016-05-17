package ch14;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Image2Ex  extends Frame {
	Image img;
	public Image2Ex() throws MalformedURLException {
		String str="http://cfile30.uf.tistory.com/image/2504CC37565CD9A9297FE9";
		URL url = new URL(str);
		img = Toolkit.getDefaultToolkit().getImage(url);
		setSize(700,700); setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);	}	});
	}
	public static void main(String[] args) throws MalformedURLException {	
		new Image2Ex();
	}
	public void paint(Graphics g) {
		g.drawImage(img, 0,0,this);
	}
}