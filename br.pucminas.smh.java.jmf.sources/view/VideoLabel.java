package view;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.Icon;
import javax.swing.JLabel;

public class VideoLabel extends JLabel
{
	private MainMenuLayout mainMenu = new MainMenuLayout("Main Menu");
	private VideoPlayerLayout videoPlayer = new VideoPlayerLayout("Video Player");
	private DefaultLayout activeLayout;
	
	
	public void setPlayerLayout(String layout)
	{
		switch (layout)
		{
		case "Main Menu":
			setLayout(mainMenu);
			activeLayout = mainMenu;
			break;
		case "Video Player":
			setLayout(videoPlayer);
			activeLayout = videoPlayer;
		default:
			break;
		}
	}

	public void addComponent(String name, Component componentVisual)
	{
		add(componentVisual);
		//activeLayout.addVisualComponent(name, componentVisual);
	}
	
	public void setSize(int altura, int largura)
	{
		this.setBounds(0, 0, largura, altura);
	}
	
	public String getActiveLayoutName(){
		return activeLayout.getLayoutName();
	}
}

class DefaultLayout extends GridLayout{
	
	private String layoutName;
	
	public DefaultLayout(int linha, int coluna)
	{
		super(linha, coluna);
	}
	
	public void addVisualComponent(String name, Component componenteVisual)
	{
		addLayoutComponent(name, componenteVisual);
	}
	
	protected void setName(String name)
	{
		this.layoutName = name;
	}
	
	public String getLayoutName ()
	{
		return this.layoutName;
	}
	
}

class MainMenuLayout extends DefaultLayout{
	public MainMenuLayout(String name){
		super(1, 3); //uma linha e tres colunas
		this.setName(name);
	}
}

class VideoPlayerLayout extends DefaultLayout{
	public VideoPlayerLayout(String name){
		super(1, 1);
		this.setName(name);
	}
	
	public void addVisualComponent(String name, Component componenteVisual)
	{
		super.addVisualComponent(name, componenteVisual);
	}
}