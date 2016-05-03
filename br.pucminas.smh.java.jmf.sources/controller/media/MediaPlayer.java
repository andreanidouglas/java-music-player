package controller.media;

import java.awt.Component;
import java.io.IOException;

import javax.media.ControllerAdapter;
import javax.media.EndOfMediaEvent;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.NoPlayerException;
import javax.media.Player;
import javax.media.PrefetchCompleteEvent;
import javax.media.RealizeCompleteEvent;
import javax.media.Time;
import javax.swing.JLabel;

import model.media.Media;

@SuppressWarnings("serial")
public class MediaPlayer extends JLabel
{
	private Player player;
	private Component componenteVisual;
	private MediaLocator localizadorDeMedia;

	public MediaPlayer(Media media)
	{
		localizadorDeMedia = new MediaLocator("file:///" + media.getPath());
		
		
		try{
			player = Manager.createPlayer(localizadorDeMedia);
			player.addControllerListener(new PlayerEventHandler());
			player.realize();
		}
		catch(NoPlayerException | IOException ioe)
		{
			ioe.printStackTrace();
		}		
	}
	
	private class PlayerEventHandler extends ControllerAdapter
	{
		public void realizeComplete(RealizeCompleteEvent realizeDoneEvent)
		{
			player.prefetch();
		}

		public void prefetchComplete(PrefetchCompleteEvent prefetchDoneEvent)
		{
			componenteVisual = player.getVisualComponent();
			if (componenteVisual != null)
				add(componenteVisual);
				
			validate();
			
		}

		public void endOfMedia(EndOfMediaEvent mediaEndEvent)
		{
			player.setMediaTime(new Time(0));
			player.stop();
		}

	}
	
	public void startMedia()
	{
		player.start();
	}
}


