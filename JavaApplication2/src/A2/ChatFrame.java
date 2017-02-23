/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.border.Border;

/**
 *
 * @author Administrator
 */
public class ChatFrame {
    public static void main(String args[]){
    ChatFrame demo=new ChatFrame();
    demo.initUI();
}

    void initUI(){  //构造界面
         JPanel topPanel=new JPanel();  //外层顶部面板
         JPanel centerPanel=new JPanel();//外层中间面板
         
         BaseFrame f=new BaseFrame("仿QQ聊天窗口");
         
         /*****************像下面添加两个子窗口**************/
         f.setLayout(new BorderLayout());
         f.add(topPanel,BorderLayout.NORTH);
         f.add(centerPanel,BorderLayout.CENTER);
         
         /*****************向顶部面板添加3个子面板***********/
         topPanel.setLayout(new GridBagLayout());//顶部面板硬网格包布局
         //头像
         JLabel faceLabel=new JLabel(ImageFactory.createImage("face.png"));
         JLabel nameLabel=new JLabel("昵称");
         //顶部面板中的图标栏
         JPanel topToolPanel=new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
         GridBagConstraints c=new GridBagConstraints();//创建网格约束包
         c.gridx=c.gridy=0;//左上角网格
         c.gridheight=2;//头像占据2行
         topPanel.add(faceLabel,c);//添加头像
         
         c.gridx=1;//昵称所在网格
         c.gridy=0;
         c.gridheight=1;
         c.weightx=1.0;
         c.fill=GridBagConstraints.HORIZONTAL;
         topPanel.add(nameLabel,c);
         
         c.gridx=c.gridy=1;//顶部面板中的图标所在网格
         topPanel.add(topToolPanel,c);//添加图标栏
         
         /***********向外层顶部面板中的图标栏添加若干按钮*********/
         JButton[] topButtons=new JButton[5];
         for(int i=0;i<topButtons.length;i++){
             topButtons[i]=new JButton(ImageFactory.createImage("top_"+(i+1)+".png"));
             topButtons[i].setBorder(null);
             topButtons[i].setContentAreaFilled(false);
             topToolPanel.add(topButtons[i]);//添加图标
         }
         
         /***********向外层中间面板添加两个子面板*******/
         centerPanel.setLayout(new BorderLayout());
         //外层中间面板的中间子面板（为分割面板）
         JSplitPane centerCenterPane=new JSplitPane(JSplitPane.VERTICAL_SPLIT);
         JPanel centerRightPanel=new JPanel();//外层中间面板的子面板
         centerPanel.add(centerCenterPane,BorderLayout.CENTER);
         centerPanel.add(centerRightPanel,BorderLayout.EAST);
         
         /******向分割面板添加两个子面板*********/
         JPanel centerTopPanel=new JPanel();//分割面板上部
         JPanel centerBottomPanel=new JPanel();//分割面板下部
         centerCenterPane.setResizeWeight(1.0);//下部高度不变
         centerCenterPane.setTopComponent(centerTopPanel);
         centerCenterPane.setBottomComponent(centerBottomPanel);
         
         /********向分割面板上部添加两个子组件****/
         centerTopPanel.setLayout(new BorderLayout());
         JLabel tipsLabel=new JLabel("交谈中请勿轻信汇款信息。");//提示标签
         //消息历史记录文本区
         JScrollPane historyPane=new JScrollPane(new JTextArea("历史消息记录..."));
         centerTopPanel.add(tipsLabel,BorderLayout.NORTH);
         centerTopPanel.add(historyPane,BorderLayout.CENTER);
         
         /******向分割下部添加3个子组件*******/
         centerBottomPanel.setLayout(new BorderLayout());
         JPanel centerToolPanel=new JPanel();//工具栏
         //聊天消息文本区
         JScrollPane chatPane=new JScrollPane(new JTextArea("聊天消息..."));
         JPanel buttonsPanel=new JPanel();//两个按钮的所在界面
         centerBottomPanel.add(centerToolPanel,BorderLayout.NORTH);
         centerBottomPanel.add(chatPane,BorderLayout.CENTER);
         centerBottomPanel.add(buttonsPanel,BorderLayout.SOUTH);
         
         /******向分割面板下部的工具栏添加两个子组件******/
         centerToolPanel.setLayout(new BorderLayout());
         //放置若干按钮的面板
         JPanel p=new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
         JButton[] centerButtons=new JButton[5];
         for(int i=0;i<centerButtons.length;i++){
             centerButtons[i]=new JButton(ImageFactory.createImage("center_"+(i+1)+".png"));
             centerButtons[i].setBorder(null);
             centerButtons[i].setContentAreaFilled(false);
             p.add(centerButtons[i]);
         }
         
         
         centerToolPanel.add(p,BorderLayout.CENTER);
         //“消息记录”按钮的宽度不变
         centerToolPanel.add(new JToggleButton("消息记录"),BorderLayout.EAST);
         
         /*****向分割面板下部的按钮面板添加按钮******/
         //右对齐的流式布局
         buttonsPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
         //组件方向为从左到右
         buttonsPanel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
         buttonsPanel.add(new JButton("发送"));
         buttonsPanel.add(new JButton("关闭"));
         
         /******向外层中间面板的右侧面板添加两个子组件*****/
         centerRightPanel.setLayout(new GridLayout(2,1));//2行1列
         JLabel qqshowLabel=new JLabel("QQ秀图片区");
         JLabel videoLabel=new JLabel("视频聊天区");
         centerRightPanel.add(qqshowLabel);
         centerRightPanel.add(videoLabel);
         
         showBorder(f.getContentPane());//显示面板等容器的边框
         f.setSize(600,400);
         f.showMe();
         centerCenterPane.setDividerLocation(0.5);

}
    /*****为便于观察容器，显示相关容器和组件的边框****/
    void showBorder(Container p){
        Component[] comps=p.getComponents();
        for(int i=0;i<comps.length;i++){
            //只显示面板、分割板和标签的边框
            if(comps[i] instanceof JPanel||comps[i] instanceof JSplitPane||
                    comps[i] instanceof JLabel){
            JComponent jc=(JComponent)comps[i];
            Border b1=BorderFactory.createEmptyBorder(2,2,2,2);
            Border b2=BorderFactory.createLineBorder(Color.GRAY);
            Border b=BorderFactory.createCompoundBorder(b1,b2);
            jc.setBorder(b);
            }
            if(comps[i] instanceof Container){
            showBorder((Container) comps[i]);//递归显示子容器边框
            }
        }
    }
}