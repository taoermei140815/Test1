/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class BaseFrame extends JFrame{
    public BaseFrame(String title){
        setLayout(null);
        setTitle(title);
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //显示窗口
    public void showMe(){
        setVisible(true);
    }
}
