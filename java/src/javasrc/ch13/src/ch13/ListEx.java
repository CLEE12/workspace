package ch13;
import java.awt.*;
public class ListEx extends Frame {
	public ListEx() {
		setLayout(new FlowLayout());
		Label lab = new Label("좋아하는 국가를 선택하세요.");
		List list = new List(5,true); // <-- 리스트를 몇개 보이게 하냐이고 true는 복수선택 여부
		list.add("영국");
		list.add("미국");
		list.add("중국");
		list.add("떡국");
		list.add("중국");
		
		add(lab);
		add(list);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListEx();
	}
	

}
