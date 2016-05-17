package ch13;

import java.awt.*;

public class PanelEx extends Frame {
	public PanelEx() {
		setLayout(new FlowLayout());
		Label lab1 = new Label("좋아하는 음악은?");
		Label lab2 = new Label("심쿵해");
		Label lab3 = new Label("소격동");
		Label lab4 = new Label("얼음들");
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
