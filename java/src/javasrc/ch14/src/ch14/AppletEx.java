package ch14;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;


public class AppletEx extends Applet {
	Image img; 
	URL url;
	
	public void init() {
		String str = "https://40.media.tumblr.com/8679fe57293ef7996877862d9db549c7/tumblr_nlbd0tLGy41r8akmko1_540.png";
		try { url = new URL(str);
		} catch (MalformedURLException e) { }
		img = getImage(url);
		setSize(700,700);
	}
	public void paint(Graphics g) {
		g.drawImage(img,0,0,this);
	}
}
