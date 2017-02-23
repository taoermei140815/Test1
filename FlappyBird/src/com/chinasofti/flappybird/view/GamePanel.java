package com.chinasofti.flappybird.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.chinasofti.flappybird.util.ImageUtil;

public class GamePanel extends JPanel  implements Runnable{
	private Thread gameThread=null;
	int x=0,y=0;
	public GamePanel() {
		init();
	}
	private void init(){
		//开启游戏线程
		gameThread=new Thread(this);
		gameThread.start();
	}
	@Override
	public void run() {
		while(true){
			try{
				
				this.gamePaint();
				Thread.sleep(1000/60);
			}catch(Exception e){
				e.printStackTrace();
				
			}
		}
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image bird=ImageUtil.load("0.png");
		g.drawOval(50, 50, 20, 20);
		x++;
		g.drawImage(bird, x, y,null);
	}
	/**
	 * 游戏线程每过30ms执行一次的方法
	 */
	private void gamePaint(){
		
		this.repaint();
	}
}
