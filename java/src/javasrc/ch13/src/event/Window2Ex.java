package event;
import java.awt.*;
import java.awt.event.*;

public class Window2Ex extends Frame  {
	TextArea ta;
	public Window2Ex() {
		ta = new TextArea();
		add(ta);
		setSize(200,200);
		setVisible(true);
		addWindowListener(new WindowHandler());	
	}
	public static void main(String[] args) {
		 
		new Window2Ex();
	}
 class WindowHandler implements WindowListener {
	// Ŭ���� �ӿ� Ŭ���� : Inner
	//WindowListener�� �ؿ� �ִ� class�� �� �ϳ��� ������ �ȵȴ�.
	public void windowOpened(WindowEvent e) {	
		ta.append("â����\n");
	}
	public void windowClosing(WindowEvent e) {	
		System.exit(0);
	}
	public void windowClosed(WindowEvent e) {
		ta.append("����\n");
	}
	public void windowIconified(WindowEvent e) {
		ta.append("������\n");
	}
	public void windowDeiconified(WindowEvent e) {
		ta.append("����������\n");
	}
	public void windowActivated(WindowEvent e) {
		ta.append("Ȱ��ȭ\n");
	}
	public void windowDeactivated(WindowEvent e) {
		ta.append("��Ȱ��ȭ\n");
	}
	}
}