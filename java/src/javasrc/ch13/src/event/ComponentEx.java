package event;
import java.awt.*;
import java.awt.event.*;

public class ComponentEx extends Frame implements ComponentListener, ActionListener {
	TextArea ta;
	Button btn;
	public ComponentEx() {
		ta = new TextArea();
		btn = new Button("화면 사라짐");
		add("Center",ta);
		add("North",btn);
		setSize(200,200);
		setVisible(true);
		
		addComponentListener(this);
		btn.addActionListener(this); //버튼을 누르면 밑에 actionPerfomed로 넘어가서 화면이 꺼짐.
		
	}
	public static void main(String[] args) {
		new ComponentEx();
	}
	public void actionPerformed(ActionEvent e) {	
		setVisible(false);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		setVisible(true);
	}
	public void componentResized(ComponentEvent e) {	
		ta.append("크기변동\n");
	}
	public void componentMoved(ComponentEvent e) {	
		ta.append("이동\n");
	}
	public void componentShown(ComponentEvent e) {	
		ta.append("보이\n");
	}
	public void componentHidden(ComponentEvent e) {	
		ta.append("안보이네\n");
	}

}
