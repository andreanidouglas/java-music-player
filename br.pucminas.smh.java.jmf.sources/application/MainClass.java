package application;

import java.awt.Color;
import java.awt.ComponentOrientation;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;

import view.MainMenu;
import view.MainWindowWindow;

public class MainClass{
	
	public static void main (String args[])
	{
		MainWindowWindow mw = new MainWindowWindow();
		MainMenu mm = new MainMenu();
		JButton jb = new JButton("Hello, World");
		jb.setBounds(0,0,150,150);
		
		
		
		mm.setLeftMargin(100);
		mm.setRightMargin(100);
		mm.setBottomMargin(100);
		mm.setTopMargin(100);
		
		
		mw.init();
		mm.init(mw.getWidth(), mw.getHeight());
		mm.addVideoContent(jb);
		
		
		mw.add(mm);
		
		mm.setVisible(true);
		mw.setVisible(true);
		
	}
}