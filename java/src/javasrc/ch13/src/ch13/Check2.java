package ch13;
import java.awt.*;
public class Check2 extends Frame {
	Label lab1, lab2, lab3;
	Checkbox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8;
	public Check2() {
		setTitle("Let's choise about your favorite things");
		setLayout(new FlowLayout());
		
		lab1 = new Label("What is your favorite animal?");
		cb1=new Checkbox("Cat");
		cb2=new Checkbox("Dog");
		cb3=new Checkbox("Bear");
		cb4=new Checkbox("Lion");
		
		CheckboxGroup cbg1 = new CheckboxGroup();
		lab2 = new Label("What is your favorite exercise?");
		cb5=new Checkbox("Soccer",cbg1,false);
		cb6=new Checkbox("Football",cbg1,false);
		cb7=new Checkbox("Baseball",cbg1,false);
		cb8=new Checkbox("Bascketball",cbg1,true);
		
		lab3 = new Label("What is your favorite flower?");
		Choice ch = new Choice();
		ch.add("Rose");
		ch.add("Narkysos");
		ch.add("Amaranthus");
		ch.add("Iris");
		
		add(lab1);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(lab2);
		add(cb5);
		add(cb6);
		add(cb7);
		add(cb8);
		add(lab3);
		add(ch);
	
		setSize(400,400);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Check2();
	}
	

}
