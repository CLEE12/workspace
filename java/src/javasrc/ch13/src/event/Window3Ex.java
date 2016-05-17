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
	 // 클래스 속에 클래스 : Inner 
	 //WindowAdopter 는 WindowListener와 달리 필요한 method만 사용이 가능하다.
	 //단, WindowListener와 달리 implements가 아닌 extends를 사용 해야 함.
	}
	public void windowClosing(WindowEvent e) {	
		System.exit(0);
	}
}
