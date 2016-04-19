package view;

import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class DefaultWindow extends JPanel {
	
	protected int topMarginSize;
	protected int bottomMarginSize;
	protected int leftMarginSize;
	protected int rightMarginSize;
	
	JLabel topMargin = new JLabel();
	JLabel leftMargin = new JLabel();
	JLabel bottomMargin = new JLabel();
	JLabel rightMargin = new JLabel();
	JLabel content;
	
	
	public void init(int width, int height)
	{
		this.setBounds(0, 0, width, height);
		this.setLayout(null);
		this.buildBorders();
		
	}
	
	private void buildBorders(){
		
		
		topMargin.setLayout(null);
		topMargin.setBounds(0, 0, this.getWidth(), this.topMarginSize);
		topMargin.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
		topMargin.setVisible(true);
		this.add(topMargin);
		
		
		leftMargin.setLayout(null);
		leftMargin.setBounds(0, this.topMarginSize, this.leftMarginSize, this.getHeight()-this.topMarginSize-this.bottomMarginSize);
		leftMargin.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
		leftMargin.setVisible(true);
		this.add(leftMargin);
		
		
		bottomMargin.setLayout(null);
		bottomMargin.setBounds(0, this.topMarginSize+leftMargin.getHeight(), this.getWidth(), this.bottomMarginSize);
		bottomMargin.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
		bottomMargin.setVisible(true);
		this.add(bottomMargin);
			
		rightMargin.setLayout(null);
		rightMargin.setBounds(this.getWidth()-this.rightMarginSize, this.topMarginSize, this.getWidth(), this.getHeight()-this.topMarginSize-this.bottomMarginSize);
		rightMargin.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
		rightMargin.setVisible(true);
		this.add(rightMargin);
	}
	
	public abstract void addVideoContent(Component videoComponent);
	
	public int getTopMargin() {
		return topMarginSize;
	}
	public void setTopMargin(int topMargin) {
		this.topMarginSize = topMargin;
	}
	public int getBottomMargin() {
		return bottomMarginSize;
	}
	public void setBottomMargin(int bottomMargin) {
		this.bottomMarginSize = bottomMargin;
	}
	public int getLeftMargin() {
		return leftMarginSize;
	}
	public void setLeftMargin(int leftMargin) {
		this.leftMarginSize = leftMargin;
	}
	public int getRightMargin() {
		return rightMarginSize;
	}
	public void setRightMargin(int rightMargin) {
		this.rightMarginSize = rightMargin;
	}
}
