package ch13;
import java.awt.*;
public class CheckBoxEx extends Frame {
	public CheckBoxEx() {
		setLayout(new FlowLayout());
		Label lab = new Label("�����ϴ� �뷡��?");
		Checkbox cb1 = new Checkbox("������");
		Checkbox cb2 = new Checkbox("���� �ǹ�");
		Checkbox cb3 = new Checkbox("�Ұݵ�");
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
