package ch13;

import java.awt.*;

public class ChoiceEx extends Frame { 
	//java에서는 choice, web에서는 combo box라고 부른다
	public ChoiceEx() {
		setTitle("Choice Test");
		setLayout(new FlowLayout());
		Label lab = new Label("What is your favorite animal?");
		Choice ch = new Choice();
		ch.add("Cat");
		ch.add("Dog");
		ch.add("Bear");
		ch.add("Wolf");
		Label lab2 = new Label("What is your favorite food?");
		Choice ch2 = new Choice();
		ch2.add("Cake");
		ch2.add("Chocolate");
		ch2.add("Coke");
		ch2.add("Bubble pop");
		
		add(lab);
		add(ch);
		add(lab2);
		add(ch2);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ChoiceEx();
		
	}

}
