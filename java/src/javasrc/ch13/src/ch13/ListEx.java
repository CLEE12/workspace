package ch13;
import java.awt.*;
public class ListEx extends Frame {
	public ListEx() {
		setLayout(new FlowLayout());
		Label lab = new Label("�����ϴ� ������ �����ϼ���.");
		List list = new List(5,true); // <-- ����Ʈ�� � ���̰� �ϳ��̰� true�� �������� ����
		list.add("����");
		list.add("�̱�");
		list.add("�߱�");
		list.add("����");
		list.add("�߱�");
		
		add(lab);
		add(list);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListEx();
	}
	

}
