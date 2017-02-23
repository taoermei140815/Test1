package com.chinasofti.flappybird;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.chinasofti.flappybird.view.GameWindow;

public class Application {

	//主线程
	public static void main(String[] args) {
		/*
		JFrame win=new JFrame();
		win.setTitle("FlappyBird");
		win.setSize(300,600 );
		win.setResizable(false);
		win.setLocationRelativeTo(null);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//放入游戏界面
		JPanel gamePanel=new JPanel();
		JButton btn=new JButton("aaa");
		
		gamePanel.add(btn);
		win.add(gamePanel);
		
		
		win.setVisible(true);
		*/
		GameWindow win=new GameWindow();
		win.setVisible(true);
		
	}
}
