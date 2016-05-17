package event;
import java.awt.*;
import java.awt.event.*;
public class CardEx extends Frame {
	CardLayout cl = new CardLayout();
	Panel[] p = new Panel[7]; 
	Color[] color={Color.RED,Color.orange,Color.yellow,
		Color.green,Color.blue,Color.cyan,Color.pink};
	public CardEx() {
		setLayout(cl);
		for (int i = 0; i < color.length; i++) {
			p[i]=new Panel(); p[i].setBackground(color[i]); 
			add(p[i]); p[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					cl.next(CardEx.this);	}	});
		}
		setSize(200, 200);  setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);	}	});
	}
	public static void main(String[] args) {	new CardEx();	}
}