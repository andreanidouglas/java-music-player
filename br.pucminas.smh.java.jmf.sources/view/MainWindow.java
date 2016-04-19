package view;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;


public class MainWindow extends JFrame
{
 	
	private static final long serialVersionUID = -1596965369490156565L;
	

	public void init(){
		setBounds(100, 100, 1820, 980);
		setResizable(false);
		//getContentPane().setLayout(layout);
	}
	
	public void addVideoPlayer(VideoLabel player)
	{
		getContentPane().add(player);
	}
	
}