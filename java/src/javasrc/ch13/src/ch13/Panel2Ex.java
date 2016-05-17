package ch13;
import java.awt.*;
public class Panel2Ex extends Frame {
	public Panel2Ex() {
		setLayout(new FlowLayout());
		Label lab1 = new Label("좋아하는 음악은 ?");
		Label lab2 = new Label("심쿵해");
		Label lab3 = new Label("소격동", Label.CENTER);
		Label lab4 = new Label("어름들");
		Label lab5 = new Label("다리꼬지마", Label.CENTER);
		Label lab6 = new Label("무릎꼬지마");
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
