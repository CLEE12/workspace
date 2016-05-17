package ch14;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AudioAp extends Applet implements ActionListener {
	Button play, loop, stop;
	AudioClip ac;
	
	public void init() {
		play = new Button("play");
		loop = new Button("loop");
		stop = new Button("stop");
		ac = getAudioClip(getCodeBase(), "SPACE.AU");
		
		add(play);
		add(loop);
		add(stop);
		
		play.addActionListener(this);
		loop.addActionListener(this);
		stop.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "play") ac.play();
		else if (e.getActionCommand() =="loop") ac.loop();
		else ac.stop();
	}
	
}
