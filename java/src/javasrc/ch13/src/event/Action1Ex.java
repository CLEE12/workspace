package event;
import java.awt.*;
import java.awt.event.*;
public class Action1Ex extends Frame implements ActionListener {
	Button btn;
	TextArea ta;
	public Action1Ex() {
		btn = new Button("���");
		ta = new TextArea();
		ta.setEnabled(false);
		//ta.setEditable(false); //�̺�Ʈ â�� �Է��� �� ���� ���´�.
		add("North",btn);
		add("Center",ta);
		setSize(200,200);
		setVisible(true);
		
		btn.addActionListener(this);
	}
	public static void main(String[] args) {
		new Action1Ex();
	}
	public void actionPerformed(ActionEvent e) {
		ta.append(btn.getLabel()+"\n");
	}

}
