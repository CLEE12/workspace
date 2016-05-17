package event;
import java.awt.*;
import java.awt.event.*;
public class Window4Ex extends Frame{
	TextArea ta;
	public Window4Ex() {
		ta=new TextArea(); add(ta);
		setSize(200,200);  setVisible(true);
		addWindowListener(new WindowAdapter(){	// 무명내부클래스	
			public void windowClosing(WindowEvent e) {	
				System.exit(0);	
			}		
		});
	}
	public static void main(String[] args) { new Window4Ex();	}
	    
}