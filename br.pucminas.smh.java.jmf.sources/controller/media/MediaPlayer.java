package controller.media;


import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import model.media.Media;

@SuppressWarnings("serial")
public class MediaPlayer extends JLabel
{
	private EmbeddedMediaPlayerComponent mediaPlayerComponent;
	
	private String mediaPath;
	
	public void realiseMediaPlayer(Media media)
	{
		
		mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
		mediaPath = media.getPath();
		
		this.setBounds(0, 0, 600, 400);
		//this.setLayout(new BorderLayout());
		this.add(mediaPlayerComponent);
	}
	
	public void play()
	{
		mediaPlayerComponent.getMediaPlayer().playMedia(mediaPath);
	}
	
	public void stop()
	{
		mediaPlayerComponent.getMediaPlayer().stop();
	}
	
}


