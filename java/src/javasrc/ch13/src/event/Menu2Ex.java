package event;
import java.awt.*;
import java.awt.event.*;
public class Menu2Ex extends Frame implements ActionListener{
	TextArea ta;
	public Menu2Ex() {
		ta = new TextArea();
		add(ta);
		MenuBar mb = new MenuBar();
		Menu file = new Menu("����");
		addMenu(file, "������");
		addMenu(file, "����");
		file.addSeparator();
		addMenu(file,"�ݱ�");
		addMenu(file,"����");
		mb.add(file);
		
		Menu edit = new Menu("����");
		addMenu(edit,"�߶󳻱�");
		addMenu(edit,"�����ϱ�");
		edit.addSeparator();
		addMenu(edit,"���̱�");
		mb.add(edit);
		
		setMenuBar(mb); 
		setSize(200,200);
		setVisible(true);
		
	}
	void addMenu(Menu menu, String str) { //����ȭ�� ���� �޼ҵ带 ����
		MenuItem mi = new MenuItem(str);
		menu.add(mi);
		mi.addActionListener(this); //this�� �� Ŭ���� �ȿ��� ó���ϰڴٴ� ��
		
	}
	public static void main(String[] args) {
		new Menu2Ex();
	}
	public void actionPerformed(ActionEvent e) {	
		ta.setText(e.getActionCommand());;
	}
	
	

}
