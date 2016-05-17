package ch15;
import java.awt.FlowLayout;
import javax.swing.*;
public class JComboEx extends JFrame {
	String[] str = {"이","삼","사","오","육"};
	public JComboEx() {
		setLayout(new FlowLayout());
		JLabel jlab=new JLabel("좋아하는 애완동물을 선택하세요");
		JComboBox<String> pet = new JComboBox<>();
		for (int i = 0; i < str.length; i++) {
			pet.addItem("구렁"+str[i]);
		}
		add(jlab); add(pet);
		setSize(200, 200); setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {	new JComboEx();	}
}