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
import javax.swing.*;
public class JFrameDemo2 {
    public static void main(String args[]){
        JFrame frame=new JFrame("JFrameDemo2");
        JButton button=new JButton("A Button");
        JPanel contentPane=new JPanel();
        contentPane.setLayout(new BorderLayout());
        frame.setContentPane(contentPane);
        frame.pack();
        frame.setVisible(true);
    }
}
