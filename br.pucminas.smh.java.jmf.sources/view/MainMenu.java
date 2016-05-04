package view;

import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu extends DefaultWindow {

	private Component[] videoComponents;
	private int arrayPos = 0;

	public MainMenu() {
		super();
	}

	public void addVideoContent(Component videoComponent) {

		Component[] localComponents = videoComponents;

		if (videoComponents != null) {
			if (arrayPos < 2) {
				videoComponents = new Component[++arrayPos];
			} else {
				videoComponents[(arrayPos + 1 % 3)] = videoComponent;
			}
		}
		
		this.content = new JLabel();
		
		for (int i=0; i<videoComponents.length;i++)
		{
			
		}
		
		this.content.setBounds(this.leftMarginSize, this.topMarginSize, videoComponent.getWidth(),
		videoComponent.getWidth());
		this.content.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
		this.content.add(videoComponent);
		this.add(content);
	}

}
