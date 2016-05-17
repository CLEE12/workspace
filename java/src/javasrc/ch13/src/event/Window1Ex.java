package event;
import java.awt.*;
import java.awt.event.*;

public class Window1Ex extends Frame implements WindowListener {
	TextArea ta;
	public Window1Ex() {
		ta = new TextArea();
		add(ta);
		setSize(200,200);
		setVisible(true);
		addWindowListener(this);
	}
	public static void main(String[] args) {
		new Window1Ex();
	}
	public void windowOpened(WindowEvent e) {	
		ta.append("창열기\n");
	}
	public void windowClosing(WindowEvent e) {	
		System.exit(0);
	}
	public void windowClosed(WindowEvent e) {
		ta.append("종료\n");
	}
	public void windowIconified(WindowEvent e) {
		ta.append("아이콘\n");
	}
	public void windowDeiconified(WindowEvent e) {
		ta.append("아이콘해제\n");
	}
	public void windowActivated(WindowEvent e) {
		ta.append("활성화\n");
	}
	public void windowDeactivated(WindowEvent e) {
		ta.append("비활성화\n");
	}

}
