package interfaced.view;

import interfaced.controller.Controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Panel extends JPanel
{

	private Controller baseController;
	
	private JButton buyGame;
	
	private JButton emptyWallet;
	
	private JButton install;
	
	private JButton startGame;
	
	private JButton rageQuit;
	
	private JButton stopGame;
	
	private JTextField firstTextField;
	
	private SpringLayout baseLayout;
	
	private JScrollPane chatPane;
	
	private JTextArea chatArea;
	
	public Panel(Controller baseController)
	{
		
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.chatArea = new JTextArea(15, 45);
		this.chatPane = new JScrollPane(chatArea);
		this.buyGame = new JButton("Buy");
		this.emptyWallet = new JButton("EmptyW");
		this.install = new JButton("Install");
		this.startGame = new JButton("Start");
		this.rageQuit = new JButton("RageQ");
		this.stopGame = new JButton("Stop");
		this.firstTextField = new JTextField(20);

		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPane()
	{
		chatArea.setWrapStyleWord(true);
		chatArea.setEditable(false);
		chatArea.setBackground(Color.ORANGE);
		firstTextField.setBackground(Color.YELLOW);
	}
	
	private void setupPanel()
	{
		
		this.setLayout(baseLayout);
		this.setSize(1000, 1000);
		this.add(buyGame);
		this.add(emptyWallet);
		this.add(install);
		this.add(startGame);
		this.add(rageQuit);
		this.add(stopGame);
		this.add(firstTextField);
		this.add(chatPane);
		
	}
	
	private void setupLayout()
	{
		
		baseLayout.putConstraint(SpringLayout.NORTH, buyGame, 210, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, buyGame, 35, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, emptyWallet, 0, SpringLayout.NORTH, buyGame);
		baseLayout.putConstraint(SpringLayout.WEST, emptyWallet, 80, SpringLayout.WEST, buyGame);
		baseLayout.putConstraint(SpringLayout.NORTH, install, 0, SpringLayout.NORTH, emptyWallet);
		baseLayout.putConstraint(SpringLayout.WEST, install, 80, SpringLayout.WEST, emptyWallet);
		baseLayout.putConstraint(SpringLayout.NORTH, startGame, 0, SpringLayout.NORTH, install);
		baseLayout.putConstraint(SpringLayout.WEST, startGame, 80, SpringLayout.WEST, install);
		baseLayout.putConstraint(SpringLayout.NORTH, rageQuit, 0, SpringLayout.NORTH, startGame);
		baseLayout.putConstraint(SpringLayout.WEST, rageQuit, 80, SpringLayout.WEST, startGame);
		baseLayout.putConstraint(SpringLayout.NORTH, stopGame, 0, SpringLayout.NORTH, rageQuit);
		baseLayout.putConstraint(SpringLayout.WEST, stopGame, 80, SpringLayout.WEST, rageQuit);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 175, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 145, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		buyGame.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent click)
			{
				
			}
			
		});
		
		emptyWallet.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent click)
			{
				
			}
			
		});
		
		install.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent click)
			{
				
			}
			
		});
		
		startGame.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent click)
			{
				
			}
			
		});
		
		rageQuit.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent click)
			{
				
			}
			
		});
		
		stopGame.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent click)
			{
				
			}
			
		});
		
		buyGame.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent click)
			{
				
			}
			
		});
						
	}

}
