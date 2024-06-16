import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

public class Simulator extends JFrame{
	private Viewer v;
	private ControlPanel cp;
	private static Sound s1;

	public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, MalformedURLException, IOException {
		Simulator s = new Simulator();
	}
	
	public Simulator() throws UnsupportedAudioFileException, LineUnavailableException, MalformedURLException, IOException {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(490,600);
		this.setResizable(false);
		
		this.getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		this.v= new Viewer();
		this.s1=new Sound();
	
		v.setSize(490, 500);
		this.cp = new ControlPanel(v);
		cp.setSize(490,600);
		this.add(v,c);
		this.add(cp,c);
		  
		cp.myPaint();
	
		v.play();
	   
	
	}	

}
