package event;
import java.awt.*;
import java.awt.event.*;

public class ComponentEx extends Frame implements ComponentListener, ActionListener {
	TextArea ta;
	Button btn;
	public ComponentEx() {
		ta = new TextArea();
		btn = new Button("ȭ�� �����");
		add("Center",ta);
		add("North",btn);
		setSize(200,200);
		setVisible(true);
		
		addComponentListener(this);
		btn.addActionListener(this); //��ư�� ������ �ؿ� actionPerfomed�� �Ѿ�� ȭ���� ����.
		
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
		ta.append("ũ�⺯��\n");
	}
	public void componentMoved(ComponentEvent e) {	
		ta.append("�̵�\n");
	}
	public void componentShown(ComponentEvent e) {	
		ta.append("����\n");
	}
	public void componentHidden(ComponentEvent e) {	
		ta.append("�Ⱥ��̳�\n");
	}

}
