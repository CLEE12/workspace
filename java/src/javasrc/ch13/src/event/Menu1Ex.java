package event;
import java.awt.*;
public class Menu1Ex extends Frame {
	public Menu1Ex() {
		MenuBar mb = new MenuBar(); Menu file = new Menu("����");
		file.add("������");
		file.add("����");
		file.addSeparator();
		file.add("�ݱ�");
		file.add("����");
		file.addSeparator();
		file.add("����");
		mb.add(file);
		Menu edit = new Menu("����");
		edit.add("�߶󳻱�");
		edit.add("�����ϱ�");
		edit.addSeparator();
		edit.add("���̱�");
		mb.add(edit);
		setMenuBar(mb); 
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Menu1Ex();
	}

}
