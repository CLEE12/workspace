package event;
import java.awt.*;
import java.awt.event.*;

public class Window3Ex extends Frame  {
	TextArea ta;
	public Window3Ex() {
		ta = new TextArea();
		add(ta);
		setSize(200,200);
		setVisible(true);
		addWindowListener(new WindowHandler());	
	}
	public static void main(String[] args) {
		
		new Window3Ex();
	}
 class WindowHandler extends WindowAdapter { 
	 // Ŭ���� �ӿ� Ŭ���� : Inner 
	 //WindowAdopter �� WindowListener�� �޸� �ʿ��� method�� ����� �����ϴ�.
	 //��, WindowListener�� �޸� implements�� �ƴ� extends�� ��� �ؾ� ��.
	}
	public void windowClosing(WindowEvent e) {	
		System.exit(0);
	}
}
