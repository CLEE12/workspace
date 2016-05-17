package event;
import java.awt.*;
import java.awt.event.*;
public class Menu2Ex extends Frame implements ActionListener{
	TextArea ta;
	public Menu2Ex() {
		ta = new TextArea();
		add(ta);
		MenuBar mb = new MenuBar();
		Menu file = new Menu("파일");
		addMenu(file, "새파일");
		addMenu(file, "열기");
		file.addSeparator();
		addMenu(file,"닫기");
		addMenu(file,"종료");
		mb.add(file);
		
		Menu edit = new Menu("편집");
		addMenu(edit,"잘라내기");
		addMenu(edit,"복사하기");
		edit.addSeparator();
		addMenu(edit,"붙이기");
		mb.add(edit);
		
		setMenuBar(mb); 
		setSize(200,200);
		setVisible(true);
		
	}
	void addMenu(Menu menu, String str) { //간소화를 위해 메소드를 제작
		MenuItem mi = new MenuItem(str);
		menu.add(mi);
		mi.addActionListener(this); //this는 이 클래스 안에서 처리하겠다는 뜻
		
	}
	public static void main(String[] args) {
		new Menu2Ex();
	}
	public void actionPerformed(ActionEvent e) {	
		ta.setText(e.getActionCommand());;
	}
	
	

}
