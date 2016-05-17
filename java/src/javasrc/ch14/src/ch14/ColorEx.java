package ch14;
import java.awt.*;
import java.awt.event.*;
public class ColorEx extends Frame implements ActionListener {
	Font font1, font2, font3;
	public ColorEx() {
		Button btn = new Button("»ö±ò ¹Ù²Ù±â");
		add("North", btn);
		int red = (int)(Math.random()*256);
		int green = (int)(Math.random()*256);
		int blue = (int)(Math.random()*256);
		
		setBackground(new Color(red, green, blue));
		setSize(200,200);
		setVisible(true);
		
		btn.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new ColorEx();
	}
	public void actionPerformed(ActionEvent e) {
		int red = (int)(Math.random()*256);
		int green = (int)(Math.random()*256);
		int blue = (int)(Math.random()*256);
		setBackground(new Color(red, green, blue));
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
}
