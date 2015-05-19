package interfaced.view;

import interfaced.controller.Controller;

import javax.swing.JFrame;

public class Frame extends JFrame
{
	private Panel basePanel;
	
	public Frame(Controller baseController)
	{
		basePanel = new Panel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(1000, 1000);
		this.setResizable(false);
		setVisible(true);
	}
}
