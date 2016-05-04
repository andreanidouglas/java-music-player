package application;

import controller.media.MediaHandler;
import controller.media.MediaPlayer;
import view.MainWindowWindow;

public class MainClass{
	
	public static void main (String args[])
	{
		MainWindowWindow mainWindow = new MainWindowWindow();
		mainWindow.init();
		mainWindow.setVisible(true);
		
		MediaHandler mediaHandler = new MediaHandler();
		MediaPlayer mediaPlayer = new MediaPlayer();
		
		mediaPlayer.realiseMediaPlayer(mediaHandler.getMedia());
		mainWindow.add(mediaPlayer);
		mediaPlayer.setVisible(true);
		mediaPlayer.play();
		
	}
}