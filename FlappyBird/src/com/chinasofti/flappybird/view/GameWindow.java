package com.chinasofti.flappybird.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow  extends JFrame{
	public GameWindow() {
		init();
	}
	private void init(){
		this.setTitle("FlappyBird");
		this.setSize(300,600 );
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//放入游戏界面
		GamePanel gamePanel=new GamePanel();
		this.add(gamePanel);
		
		
	}
}
