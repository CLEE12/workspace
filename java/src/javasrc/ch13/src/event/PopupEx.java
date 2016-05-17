package event;
import java.awt.*;
import java.awt.event.*;

public class PopupEx extends Frame implements ActionListener {
	TextField tf = new TextField();
	PopupMenu pm = new PopupMenu();
	public PopupEx() {
		addMenu("열기");
		addMenu("닫기");
		pm.addSeparator();
		addMenu("복사");
		addMenu("붙이기");
		add("South",tf);
		add(pm);
		
		setSize(200,200);
		setVisible(true);
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) { popUp(e); }
			public void mouseClicked(MouseEvent e) { popUp(e); }
			public void mouseReleased(MouseEvent e) { popUp(e); }
		});
	}
	void popUp(MouseEvent e) {
		pm.show(e.getComponent(),e.getX(),e.getY());
		
	}
	public static void main(String[] args) {
		new PopupEx();
	}
	void addMenu(String str) {
		MenuItem mi = new MenuItem(str);
		pm.add(mi);
		mi.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		tf.setText(e.getActionCommand());
	}

}
