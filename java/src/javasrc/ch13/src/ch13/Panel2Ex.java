package ch13;
import java.awt.*;
public class Panel2Ex extends Frame {
	public Panel2Ex() {
		setLayout(new FlowLayout());
		Label lab1 = new Label("�����ϴ� ������ ?");
		Label lab2 = new Label("������");
		Label lab3 = new Label("�Ұݵ�", Label.CENTER);
		Label lab4 = new Label("���");
		Label lab5 = new Label("�ٸ�������", Label.CENTER);
		Label lab6 = new Label("����������");
		Panel p = new Panel();
		p.setLayout(new BorderLayout());;
		p.add("North",lab5);
		p.add("South",lab3);
		p.add("East",lab4);
		p.add("West",lab2);
		p.add("Center",lab6);
		add(lab1);
		add(p);
		
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Panel2Ex();
	}

}
