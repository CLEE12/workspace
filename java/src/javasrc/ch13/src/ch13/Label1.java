package ch13;
import java.awt.*;

public class Label1 extends Frame {
	public Label1() {
		setTitle("���");
		setLayout(new FlowLayout()); // �۾��� ��� �߾Ӻ��� ��ġ�� �Ѵ�.
		
		Label lb1=new Label("��");
		Label lb2=new Label("����");
		Label lb3=new Label("����");
		Label lb4=new Label("�ܿ�");
		
		add(lb1);
		add(lb2);
		add(lb3);
		add(lb4);
		
		setForeground(Color.YELLOW);
		setBackground(Color.RED);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Label1();
	}

}
