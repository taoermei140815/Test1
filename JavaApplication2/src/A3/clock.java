/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A3;
import java.awt.*;
import java.applet.*;
import java.awt.geom.*;
/**
 *
 * @author Administrator
 */
public class clock extends Applet implements Runnable {
    Font f;//定义一个Font类的对象用于设置表盘字体的格式
    Thread th;//定义一个Thread的对象
    int flag;//表针位置
    double a,ma,ha;
    double mflag,hflag;
    public void init(){
        f=new Font("Helvetica",Font.BOLD,10);
        //设置字体格式
        th=new Thread(this);
        a=0;
        ma=0;
        ha=0;
        flag=0;
        mflag=0;
        hflag=0;
    }
    public void start(){
        th.start();
    }
    public void run(){
        while(true){
            a=a+3.1415926/30;
            flag+=6;
            if(flag%90==0.0d){
                ma+=3.1415926/120;
                mflag+=1.5;
            }
            if(flag%1080==0.0d){
                ha+=3.1415926/120;
                hflag+=1.5;
            }
            if(flag%360==0.0d){
                a=0;
            }
            if(mflag==360){ma=0;mflag=0;}
            if(hflag==630){ha=0;hflag=0;}
            try{th.sleep(1000);}
            catch(InterruptedException e){
                repaint();
            }
        }
    }
        
    
    
public void paint(Graphics g){
            g.drawRoundRect(80, 100, 100, 100, 60, 40);
            g.setFont(f);
            g.drawString("12", 125, 110);
            g.drawString("3", 170, 150);
            g.drawString("6", 130, 195);
            g.drawString("9", 85, 150);
            Graphics2D g2d=(Graphics2D)g;
            Line2D number1=new Line2D.Double(130+50*Math.sin(3.1415/6),
            150-50*Math.cos(3.1415926/6),130+50*Math.tan(3.1415/6),100);
            Line2D number2=new Line2D.Double(130+50*Math.cos(3.1415/6),
            150-50*Math.sin(3.1415/6),180,150-50*Math.tan(3.1415/6));
            Line2D number4=new Line2D.Double(130+50*Math.cos(3.1415/6),
            150+50*Math.sin(3.1415/6),180,150+50*Math.tan(3.1415/6));
            Line2D number5=new Line2D.Double(130+50*Math.sin(3.1415/6),
            150+50*Math.cos(3.1415/6),130+50*Math.tan(3.1415/6),200);
            Line2D number7=new Line2D.Double(130-50*Math.sin(3.1415/6),
            150+50*Math.cos(3.1415/6),130-50*Math.tan(3.1415/6),200);
            Line2D number8=new Line2D.Double(130-50*Math.cos(3.1415/6),
            150+50*Math.sin(3.1415/6),80,150+50*Math.tan(3.1415/6));
            Line2D number10=new Line2D.Double(130-50*Math.cos(3.1415/6),
            150-50*Math.sin(3.1415/6),80,150-50*Math.tan(3.1415/6));
            Line2D number11=new Line2D.Double(130-50*Math.sin(3.1415/6),
            50-50*Math.cos(3.1415/6),130-50*Math.tan(3.1415/6),100);
            g2d.draw(number1);
            g2d.draw(number2);
            g2d.draw(number4);
            g2d.draw(number5);
            g2d.draw(number7);
            g2d.draw(number8);
            g2d.draw(number10);
            g2d.draw(number11);
            Line2D sline=new Line2D.Double(130,150,130+45*Math.sin(a),
                    150-45*Math.cos(a));
            Line2D mline=new Line2D.Double(130,150,130+35*Math.sin(ma),
                    150-35*Math.cos(ma));
            Line2D hline=new Line2D.Double(130,150,130+25*Math.sin(ha),
                    150-25*Math.cos(ha));
            g2d.draw(sline);
            g2d.draw(mline);
            g2d.draw(hline);
        }
        public void stop(){
            th=null;
        }
        
    }

