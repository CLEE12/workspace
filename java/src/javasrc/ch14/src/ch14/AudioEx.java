package ch14;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;

public class AudioEx extends Frame implements ActionListener {
	Button play, loop, stop;
	AudioClip ac;
	
	public AudioEx() {
		setLayout(new FlowLayout());
		play=new Button("play");
		loop=new Button("loop");
		stop=new Button("stop");
		add(play);
		add(loop);
		add(stop);
		
		ac = Applet.newAudioClip(getClass().getResource("IM.WAV"));
		
		setSize(200,200);
		setVisible(true);
		play.addActionListener(this);
		loop.addActionListener(this);
		stop.addActionListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand()=="play") ac.play();
		else if (e.getActionCommand()=="loop") ac.loop();
		else ac.stop();
	}
	
	public static void main(String[] args) {
		new AudioEx();
	}

}
