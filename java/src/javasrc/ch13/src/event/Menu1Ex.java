package event;
import java.awt.*;
public class Menu1Ex extends Frame {
	public Menu1Ex() {
		MenuBar mb = new MenuBar(); Menu file = new Menu("파일");
		file.add("새파일");
		file.add("열기");
		file.addSeparator();
		file.add("닫기");
		file.add("저장");
		file.addSeparator();
		file.add("종료");
		mb.add(file);
		Menu edit = new Menu("편집");
		edit.add("잘라내기");
		edit.add("복사하기");
		edit.addSeparator();
		edit.add("붙이기");
		mb.add(edit);
		setMenuBar(mb); 
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Menu1Ex();
	}

}
