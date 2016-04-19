package application;

import java.awt.GridLayout;

import javax.swing.JButton;

import view.MainWindow;
import view.VideoLabel;

public class MainClass
{
	public static void main(String[] args)
	{
		
		JButton botao1 = new JButton();
		JButton botao2 = new JButton();
		JButton botao3 = new JButton();
		
		botao1.setText("botao1");
		botao2.setText("botao2");
		botao3.setText("botao3");
		
		botao1.setBounds(0, 0, 30, 30);
		botao2.setBounds(0, 0, 30, 30);
		botao3.setBounds(0, 0, 30, 30);
		
		MainWindow mw = new MainWindow();
		VideoLabel vl = new VideoLabel();
		
		vl.setPlayerLayout("Main Menu");
		vl.addComponent("botao1", botao1);
		vl.addComponent("botao2", botao2);
		vl.addComponent("botao3", botao3);
		
		
		mw.init();
		mw.addVideoPlayer(vl);
		
		mw.setVisible(true);

	}
}
