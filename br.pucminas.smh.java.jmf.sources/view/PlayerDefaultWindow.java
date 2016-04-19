package view;

import java.awt.Component;

import javax.swing.JLabel;

public class PlayerDefaultWindow extends DefaultWindow{


	public PlayerDefaultWindow()
	{
		super();
	}

	@Override
	public void addVideoContent(Component videoComponent) {
		this.add(videoComponent);
		
	}

}
