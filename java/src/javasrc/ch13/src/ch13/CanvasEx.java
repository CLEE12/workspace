package ch13;
import java.awt.*;
public class CanvasEx extends Frame {
		public CanvasEx() {
			Canvas canvas = new Canvas();
			canvas.setBackground(Color.yellow);
			canvas.setSize(300,100);
			setSize(300,200);
			setBackground(Color.pink);
			add("North", canvas);
			setVisible(true);
		}
		public static void main(String[] args) {
			new CanvasEx();
	}

}
