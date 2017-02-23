package com.chinasofti.flappybird.util;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageUtil {
	/**图片名称,获取图片
	 * 
	 */
	static public BufferedImage load(String name){
		try{
		return ImageIO.read(ImageUtil.class.getResourceAsStream("/"+name));
		}catch(IOException e){
			throw new RuntimeException(e);
		}
	}
}
