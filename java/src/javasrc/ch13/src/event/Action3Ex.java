package event;
import java.awt.*;
import java.awt.event.*;
public class Action3Ex extends Frame implements ActionListener{
	Button apple, banana;  TextArea ta;
	public Action3Ex() {
		apple=new Button("사과"); 
		banana=new Button("바나나");
		ta=new TextArea();  
		ta.setEnabled(false);
		
		add("North",apple); 
		add("South",banana); 
		add("Center",ta);
		
		setSize(200,200);   
		setVisible(true);
		
		apple.addActionListener(this);
		banana.addActionListener(this);
	}
	public static void main(String[] args) { new Action3Ex(); }
	public void actionPerformed(ActionEvent e) {
		// ta.append(((Button)e.getSource()).getLabel()+"\n");
		ta.append(((Button)e.getSource()).getActionCommand()+"\n");
	}
}