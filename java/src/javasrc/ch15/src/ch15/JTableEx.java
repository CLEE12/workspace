package ch15;
import javax.swing.*;
public class JTableEx extends JFrame {
	public JTableEx() {
		String[] fieldname={
			"<html><font color=blue size=5>학번</font></html>",
			"<html><font color=red size=5>국어</font></html>",
			"<html><font color=orange size=5>영어</font></html>",
			"<html><font color=green size=5>수학</font></html>"};
		String[][] data = {{"1111","99","88","77"},
			{"2222","89","78","78"},{"33333","78","89","90"},
			{"55555","87","89","96"}};
		JTable jt = new JTable(data, fieldname);
		// jt.setEnabled(false);
		JScrollPane jsp = new JScrollPane(jt);
		add(jsp); setSize(200,200); setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {	new JTableEx();	}
}