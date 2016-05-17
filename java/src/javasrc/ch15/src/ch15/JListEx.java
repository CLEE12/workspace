package ch15;

import java.util.Vector;

import javax.swing.*;

public class JListEx extends JFrame {
	String[] ps = {"남자","여자","우주인","로보트"};
	public JListEx() {
		Vector<String> vt = new Vector<>();
		for(int i=0; i<ps.length; i++) {
			vt.add(ps[i]);
		}
		JList jl = new JList(vt);
		
		add(jl);
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JListEx();
	}

}
