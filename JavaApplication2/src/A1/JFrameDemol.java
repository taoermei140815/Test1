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
public class JFrameDemol {
    public static void main(String args[]){
        JFrame frame=new JFrame("JFrame");
        JButton button=new JButton("A Frame");
        frame.getContentPane().add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
