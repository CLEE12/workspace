package ch15;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class JTable2Ex extends JFrame implements ActionListener {
	JPanel jp;
	JTextField txId, txEmail;
	JLabel laId, laEmail;
	String[]title = {"아이디", "이메일"};
	DefaultTableModel dm = new DefaultTableModel(title, 0);
	JTable jtab = new JTable(dm);
	JScrollPane jsp = new JScrollPane(jtab);
	public JTable2Ex() {		
		jp = new JPanel();
		jp.setBackground(Color.YELLOW);
		jp.setLayout(new GridLayout(2,2));
		txId = new JTextField();
		txEmail = new JTextField();
		laId = new JLabel("아이디",JLabel.RIGHT);
	    laEmail = new JLabel("이메일",JLabel.RIGHT);
	    jp.add(laId); 
	    jp.add(txId);
	    jp.add(laEmail);
	    jp.add(txEmail);
	    add("North",jp);
	    add("Center",jsp);
	    setSize(200,200);
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    txId.addActionListener(this);
	    txEmail.addActionListener(this);
		}
	public static void main(String[] args) {
		new JTable2Ex();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==txId) txEmail.requestFocus();
		else{
			String[] temp = {txId.getText(),txEmail.getText()};
			dm.addRow(temp); 
			txId.requestFocus();
			txId.setText(null);
			txEmail.setText(null);
		}
	}
}
