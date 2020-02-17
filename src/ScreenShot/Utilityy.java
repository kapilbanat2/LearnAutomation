package ScreenShot;


import org.openqa.selenium.WebDriver;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Utilityy {
	
	public static void captureScreenshot(WebDriver driver, String screenshotname)  throws Exception{
		
		
		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
		
				
		ImageIO.write(image,"png",new File("./screenshot"+screenshotname+".png"));
		
		
		
	}

}
