package ch13;
import java.awt.*;
public class LabelButton1 extends Frame {
	public LabelButton1() {
		setTitle("Rabbits");
		setLayout(new FlowLayout());
		
		Label lab1 = new Label("»êÅä³¢");
		Label lab2 = new Label("ÁýÅä³¢");
		Label lab3 = new Label("Á×ÀºÅä³¢");
		
		add(lab1);
		add(lab2);
		add(lab3);
		
		Button btn1 = new Button("±¸··ÀÌ");
		Button btn2 = new Button("ÆÈ··ÀÌ");
		Button btn3 = new Button("Ä¥··ÀÌ");
		
		add(btn1);
		add(btn2);
		add(btn3);
		
		lab1.setEnabled(false);
		btn1.setEnabled(false); //setEnabled(false)¸¦ ¾²¸é »ç¿ëÇÒ ¼ö ¾ø´Â »óÅÂ°¡ µÈ´Ù.
		setForeground(Color.RED);
		setBackground(Color.YELLOW);
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(Color.BLUE);
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new LabelButton1();
	}
}
