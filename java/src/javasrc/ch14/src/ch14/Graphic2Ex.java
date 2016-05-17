package ch14;
import java.awt.*;
import java.awt.event.*;
public class Graphic2Ex extends Frame {
	public Graphic2Ex() {
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);		}		});
		add(new XCanvas()); 
		setSize(200,200); 
		setVisible(true);
	}
	public static void main(String[] args) { 
		new Graphic2Ex();	
		}
	class XCanvas extends Canvas {
		public void paint(Graphics g) {
			g.setColor(Color.red); 
			g.draw3DRect(0,0,46,36,false); 
			g.drawOval(50,0,46,36); 
			int x1[] = new int[] { 100, 300, 273 }; 
			int y1[] = new int[] { 0, 0, 36 }; 
			g.drawPolygon(x1, y1, x1.length); 
			g.setColor(Color.blue); 
			g.fill3DRect(0,40,46,36,true);
			g.fillOval(50, 40, 46, 36); 
			int x2[] = new int[] { 100, 300, 273 }; 
			int y2[] = new int[] { 40, 40, 76 }; 
			g.fillPolygon(x2, y2, x2.length);
			g.drawLine(150, 40, 396, 76); 
			g.setColor(Color.black); 
			g.drawString("www.jabook.org", 10, 115);
			g.setColor(Color.cyan); 
			g.drawRoundRect( 0, 120, 46, 36, 10, 10); 
			g.fillRoundRect(50, 120, 46, 36, 10, 10); 
			g.clearRect(30, 30, 250, 30);
		}
	}	 
}