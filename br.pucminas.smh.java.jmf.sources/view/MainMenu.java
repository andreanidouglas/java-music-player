package view;

import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class MainMenu extends DefaultWindow {
	
	
	public MainMenu()
	{
		super();
	}
	
	public void addVideoContent(Component videoComponent){
		this.content = new JLabel();
		this.content.setBounds(this.leftMarginSize, this.topMarginSize, videoComponent.getWidth(), videoComponent.getWidth());
		this.content.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
		this.content.add(videoComponent);
		this.add(content);
	}

}
