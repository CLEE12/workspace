package ch13;

import java.awt.*;

public class PanelEx extends Frame {
	public PanelEx() {
		setLayout(new FlowLayout());
		Label lab1 = new Label("�����ϴ� ������?");
		Label lab2 = new Label("������");
		Label lab3 = new Label("�Ұݵ�");
		Label lab4 = new Label("������");
		Panel p = new Panel();
		add(lab1);
		p.add(lab2);
		p.add(lab3);
		p.add(lab4);
		add(p);
		setSize(200,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new PanelEx();
	}

}
