package ch13;
import java.awt.*;
public class BorderLayout2Ex extends Frame {
	Button east, west, south, north, center;
	public BorderLayout2Ex() {
		//setLayout(new BorderLayout()); //default
		setLayout(new BorderLayout(10,20));
		east = new Button("EAST");
		west = new Button("WEST");
		south = new Button("SOUTH");
		north = new Button("NORTH");
		center = new Button("CENTER");
		add("East",east);
		add("West",west);
		add("South",south);
		add("North",north);
		add("Center",center);
		setSize(200,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
