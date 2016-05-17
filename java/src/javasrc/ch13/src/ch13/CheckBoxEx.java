package ch13;
import java.awt.*;
public class CheckBoxEx extends Frame {
	public CheckBoxEx() {
		setLayout(new FlowLayout());
		Label lab = new Label("좋아하는 노래는?");
		Checkbox cb1 = new Checkbox("심쿵해");
		Checkbox cb2 = new Checkbox("너의 의미");
		Checkbox cb3 = new Checkbox("소격동");
		add(lab);
		add(cb1);
		add(cb2);
		add(cb3);
		
		setSize(200,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new CheckBoxEx();
	}

}
