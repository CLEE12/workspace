package ch13;
import java.awt.*;
public class CheckBoxGroupEx extends Frame {
	public CheckBoxGroupEx() {
		setLayout(new FlowLayout());
		CheckboxGroup cbg1 = new CheckboxGroup();
		CheckboxGroup cbg2 = new CheckboxGroup(); 
		//�׷����� ��� �� ������ �ϳ��� ������ �� �ְ� �Ѵ�.
		
		Label lab1 = new Label("�����ϴ� �뷡�� �����ϼ���");
		Checkbox cb1 = new Checkbox("������",cbg1,false);
		Checkbox cb2 = new Checkbox("���� �ǹ�",cbg1,false);
		Checkbox cb3 = new Checkbox("�Ұݵ�",cbg1,true);
		
		Label lab2 = new Label("�����ϴ� ��ȭ�� �����ϼ���");
		Checkbox cb4 = new Checkbox("���̾��",cbg2,false);
		Checkbox cb5 = new Checkbox("��Ʈ��",cbg2,false);
		Checkbox cb6 = new Checkbox("���۸�",cbg2,false);
		
		add(lab1);
		add(cb1);
		add(cb2);
		add(cb3);
		add(lab2);
		add(cb4);
		add(cb5);
		add(cb6);
		
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBoxGroupEx();
	}

}
