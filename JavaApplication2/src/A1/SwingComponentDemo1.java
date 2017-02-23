/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A1;

/**
 *
 * @author Administrator
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class SwingComponentDemo1 {
    JFrame frame=new JFrame("Button Demo 1");
    JCheckBox chbox1=new JCheckBox("JCheckBox 1",true);
    JCheckBox chbox2=new JCheckBox("JCheckBox 2",true);
    JCheckBox chbox3=new JCheckBox("JCheckBox 3");
    
    JCheckBox chbox4=new JCheckBox("JCheckBox 4",true);
    JCheckBox chbox5=new JCheckBox("JCheckBox 5",true);
    JCheckBox chbox6=new JCheckBox("JCheckBox 6");
    
    JRadioButton rabut1=new JRadioButton("JRadioButton 1",true);
    JRadioButton rabut2=new JRadioButton("JRadioButton 2",true);
    JRadioButton rabut3=new JRadioButton("JRadioButton 3");
    
    JRadioButton rabut4=new JRadioButton("JRadioButton 1",true);
    JRadioButton rabut5=new JRadioButton("JRadioButton 1",true);
    JRadioButton rabut6=new JRadioButton("JRadioButton 1");
    
    public static void main(String args[]){
        SwingComponentDemo1 testCom=new SwingComponentDemo1();
        testCom.go();
    }
    public void go(){
        JPanel jpane1=new JPanel();
        JPanel jpane2=new JPanel();
        JPanel jpane3=new JPanel();
        JPanel jpane4=new JPanel();
        JPanel jpanea=new JPanel();
        
        //第一个面板中放第一个复选按钮
        jpane1.add(chbox1);
        jpane1.add(chbox2);
        jpane1.add(chbox3);
        Border etched=BorderFactory.createEtchedBorder();
        Border border=BorderFactory.createTitledBorder(etched,"JCheckBox");
        jpane1.setBorder(border);
        
        //第二个面板中放第二组复选按钮
        jpane2.add(chbox4);
        jpane2.add(chbox5);
        jpane2.add(chbox6);
        border=BorderFactory.createTitledBorder(etched,"JCheckBox Gorup");
        
        //创建ButtonGroup按钮组，添加第二组复选按钮
        ButtonGroup group1=new ButtonGroup();
        group1.add(chbox4);
        group1.add(chbox5);
        group1.add(chbox6);
        
        //第三个面板中放第一组单选按钮
        jpane3.add(rabut1);
        jpane3.add(rabut2);
        jpane3.add(rabut3);
        border=BorderFactory.createTitledBorder(etched,"JRadioButton");
        jpane3.setBorder(border);
        
        //第四个面板中放第二组单选按钮
        jpane4.add(rabut4);
        jpane4.add(rabut5);
        jpane4.add(rabut6);
        border=BorderFactory.createTitledBorder(etched,"JRadioButton Group");
        jpane4.setBorder(border);
        
        //创建ButtonGroup按钮组，添加第二组单选按钮
        ButtonGroup group2=new ButtonGroup();
        group2.add(rabut4);
        group2.add(rabut5);
        group2.add(rabut6);
        
        jpanea.setLayout(new GridLayout(0,1));
        jpanea.add(jpane1);
        jpanea.add(jpane2);
        jpanea.add(jpane3);
        jpanea.add(jpane4);
        
        Container contpane=frame.getContentPane();
        contpane.setLayout(new GridLayout(0,1));
        contpane.add(jpanea);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }  
    
    
}
