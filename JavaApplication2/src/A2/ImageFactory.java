/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2;

import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Administrator
 */
public class ImageFactory {
     static String DEFAULT_DIR="A2/images/";
     static ClassLoader loader=ImageFactory.class.getClassLoader();
     
     
    public static ImageIcon createImage(String file){
       URL url=loader.getResource(DEFAULT_DIR+file);
       return new ImageIcon(url);
    }
}
