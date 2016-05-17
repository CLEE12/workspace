package ch13;
import java.awt.*;
public class CheckBoxGroupEx extends Frame {
	public CheckBoxGroupEx() {
		setLayout(new FlowLayout());
		CheckboxGroup cbg1 = new CheckboxGroup();
		CheckboxGroup cbg2 = new CheckboxGroup(); 
		//그룹으로 묶어서 한 지문당 하나씩 선택할 수 있게 한다.
		
		Label lab1 = new Label("좋아하는 노래를 선택하세요");
		Checkbox cb1 = new Checkbox("심쿵해",cbg1,false);
		Checkbox cb2 = new Checkbox("너의 의미",cbg1,false);
		Checkbox cb3 = new Checkbox("소격동",cbg1,true);
		
		Label lab2 = new Label("좋아하는 영화를 선택하세요");
		Checkbox cb4 = new Checkbox("아이언맨",cbg2,false);
		Checkbox cb5 = new Checkbox("배트맨",cbg2,false);
		Checkbox cb6 = new Checkbox("슈퍼맨",cbg2,false);
		
		add(lab1);
		add(cb1);
		add(cb2);
		add(cb3);
		add(lab2);
		add(cb4);
		add(cb5);
		add(cb6);
		
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBoxGroupEx();
	}

}
