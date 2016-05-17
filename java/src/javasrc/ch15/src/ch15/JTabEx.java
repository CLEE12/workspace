package ch15;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class JTabEx extends JFrame implements ChangeListener{
	JTabbedPane jtp; JPanel one, two, three; JTextField jtf;
	public JTabEx() {
		jtp=new JTabbedPane(); one=new JPanel();
		two=new JPanel();      three=new JPanel();
		one.add(new JLabel("첫번째 탭입니다"));
		one.setBackground(Color.red); jtp.add("One",one);
		two.add(new JLabel("두번째 탭입니다"));
		two.setBackground(Color.green); jtp.add("Two",two);
		three.add(new JLabel("세번째 탭입니다"));
		three.setBackground(Color.blue); jtp.add("Three",three);
		JLabel jlab=new JLabel("탭 예제입니다"); add("North",jlab);
		jtf=new JTextField(); add("South",jtf); add("Center",jtp);
		setSize(200, 200); setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jtp.addChangeListener(this);
	}
	public static void main(String[] args) {	new JTabEx();	}
	public void stateChanged(ChangeEvent e) {
		int index  = jtp.getSelectedIndex();
		String str = jtp.getTitleAt(index)+"을 선택했습니다";
		jtf.setText(str);
	}
}