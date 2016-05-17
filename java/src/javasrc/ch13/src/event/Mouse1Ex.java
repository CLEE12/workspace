package event;
import java.awt.*;
import java.awt.event.*;
public class Mouse1Ex extends Frame implements MouseListener {
    TextArea ta;
    Button btn;
    public Mouse1Ex() {
    	ta = new TextArea(); 
    	add(ta);
    	ta.setEnabled(false);
    	btn = new Button("Button");
    	add("North",btn);
    	
    	setSize(200,200);
    	setVisible(true);
    	btn.addMouseListener(this);



    }
	public static void main(String[] args) {
		new Mouse1Ex();
	}
	public void mouseClicked(MouseEvent e) {
		ta.append("Å¬¸¯Çß´Ù\n");
	}
	public void mouseEntered(MouseEvent e) {
		ta.append("µé¾î°¬´Ù\n");
    }
	public void mouseExited(MouseEvent e) {	
		ta.append("³ª¿Ô´Ù\n");
	}
	public void mousePressed(MouseEvent e) {
		ta.append("´­·¶´Ù\n");
	}
	public void mouseReleased(MouseEvent e) {
		ta.append("¶Ã´Ù\n");
	}
}
