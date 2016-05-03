package application;

import controller.media.MediaHandler;
import controller.media.MediaPlayer;
import view.MainMenu;
import view.MainWindowWindow;

public class MainClass{
	
	public static void main (String args[])
	{
		MainWindowWindow mw = new MainWindowWindow();
		MainMenu mm = new MainMenu();
		
		
		
		
		
		mm.setLeftMargin(100);
		mm.setRightMargin(100);
		mm.setBottomMargin(100);
		mm.setTopMargin(100);
		
		
		mw.init();
		mm.init(mw.getWidth(), mw.getHeight());
		mw.setVisible(true);
		
		
		MediaHandler mh = new MediaHandler();

		System.out.println(mh.getMedia().getPath());
		
		MediaPlayer mp = new MediaPlayer(mh.getMedia());
		
		mp.setBounds(0, 0, 600, 480);
		
		//mm.addVideoContent(mp);
		
		
		mw.add(mm);
		
		mm.setVisible(true);
		
		
		//mp.startMedia();
	}
}