import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class AudioEx extends JFrame {
	private JButton btns[] = {new JButton("play"),
		new JButton("stop"), new JButton("play again")	
	};
	private Clip clip;
	public AudioEx() {
		
	}
	private void loadAudio(String pathName) {
		try {
			clip = AudioSystem.getClip();
			File audioFile = new File(pathName);
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
