package event;
import java.awt.*;
import java.awt.event.*;
public class Action2Ex extends Frame implements ActionListener {
	Button apple, banana;
	TextArea ta;
	public Action2Ex() {
		apple = new Button("사과");
		banana = new Button("바나나");
		ta = new TextArea();
		ta.setEnabled(false);
		add("North",apple);
		add("South",banana);
		add("Center",ta);
		
		setSize(200,200);
		setVisible(true);
		
		apple.addActionListener(this);
		banana.addActionListener(this);
		
	}
	public static void main(String[] args) {
		new Action2Ex();
	}
	public void actionPerformed(ActionEvent e) {
		Button btn = (Button)e.getSource();
		ta.append(btn.getLabel()+"\n");
	}
	

}
