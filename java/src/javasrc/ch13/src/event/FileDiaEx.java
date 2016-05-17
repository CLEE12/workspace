package event;
import java.awt.*;
import java.awt.event.*;

public class FileDiaEx extends Frame implements ActionListener {
	Button btn = new Button ("���ϼ���");
	TextArea ta = new TextArea();
	public FileDiaEx() {
		add("North",btn);
		add("Center",ta);
		setSize(200,200);
		setVisible(true);
		btn.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new FileDiaEx();
	}
	public void actionPerformed(ActionEvent e) {
		FileDialog fd = new FileDialog(this, "���� ã��",FileDialog.LOAD);
		fd.setVisible(true);
		ta.append(fd.getDirectory() + fd.getFile() + "\n");
	}

}
