package ch15;
import java.awt.FlowLayout;
import javax.swing.*;
public class JComboEx extends JFrame {
	String[] str = {"��","��","��","��","��"};
	public JComboEx() {
		setLayout(new FlowLayout());
		JLabel jlab=new JLabel("�����ϴ� �ֿϵ����� �����ϼ���");
		JComboBox<String> pet = new JComboBox<>();
		for (int i = 0; i < str.length; i++) {
			pet.addItem("����"+str[i]);
		}
		add(jlab); add(pet);
		setSize(200, 200); setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {	new JComboEx();	}
}