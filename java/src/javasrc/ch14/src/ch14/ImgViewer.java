package ch14;
import java.awt.*;
import java.awt.event.*;
public class ImgViewer extends Frame implements ActionListener {
	Image curImg;	Panel p; Dimension d;	int command;
	Button norm, part, scale, hori, vert, all;	
	static final int SHOW_NORM = 0;
	static final int SHOW_PART = 1;
	static final int SHOW_SCALE = 2;
	static final int SHOW_HORIZONTAL = 3;
	static final int SHOW_VERTICAL = 4;
	static final int SHOW_ALL = 5;
	ImgViewer(String s) { // Frame Ŭ���� �����ڸ� ȣ���Ѵ�.
		super(s + " ���� �����ֱ�");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				System.exit(0);		}		});
		curImg = Toolkit.getDefaultToolkit().getImage(s);
		setLayout(new BorderLayout());
		p = new Panel();
		p.add(norm = new Button("���� �׸�"));
		p.add(part = new Button("�Ϻ� �׸���"));
		p.add(scale = new Button("���"));
		p.add(hori = new Button("�¿� ������"));
		p.add(vert = new Button("���� ������"));
		p.add(all = new Button("���� ������"));
		add(p, BorderLayout.NORTH);
		norm.addActionListener(this);
		part.addActionListener(this);
		scale.addActionListener(this);
		hori.addActionListener(this);
		vert.addActionListener(this);
		all.addActionListener(this);
		setSize(500, 400);
		setVisible(true);
		command = SHOW_NORM;
	}
	public void actionPerformed(ActionEvent ae) {
		Button b = (Button) ae.getSource();
		if (b.getLabel().equals("���� �׸�"))	command=SHOW_NORM;
		if (b.getLabel().equals("�Ϻ� �׸���")) command=SHOW_PART;
		if (b.getLabel().equals("���"))	command=SHOW_SCALE;
		if (b.getLabel().equals("���� ������")) command=SHOW_VERTICAL;
		if (b.getLabel().equals("�¿� ������")) command=SHOW_HORIZONTAL;
		if (b.getLabel().equals("���� ������")) command=SHOW_ALL;
		repaint();
	}
	public void paint(Graphics g) {
		d = p.getSize(); int h2 = d.height*2;
		int w=curImg.getWidth(this);
		int h=curImg.getHeight(this);
		switch (command) {
		case SHOW_NORM:	g.drawImage(curImg,0,h2, this);
			break;
		case SHOW_PART:	
			g.drawImage(curImg,0,h2,100,h2+100,20,20,120,120,this);
			break;
		case SHOW_SCALE: 
			g.drawImage(curImg,0,h2,w/2,h2+h/2,0,0,w,h,this);
			break;
		case SHOW_HORIZONTAL:	
			g.drawImage(curImg,w,h2,0,h+h2,0,0,w,h,this);
			break;
		case SHOW_VERTICAL:	
			g.drawImage(curImg,0,h2+h,w,h2,0,0,w,h,this);
			break;
		case SHOW_ALL:	
			g.drawImage(curImg,w,h+h2,0,h2,0,0,w,h,this);
			break;
		}
	}
	public static void main(String args[]) {
		new ImgViewer("LENNA.JPG");
	}
}