package ScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FrameAlertExample {
  @Test
  public void handleFrame()  throws Exception{
	  
	    ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Brijesh Maurya\\Desktop\\bana selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://learn-automation.com/handle-multiple-windows-in-selenium-webdriver/");
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//body[@class='post-template-default single single-post postid-201 single-format-standard wp-embed-responsive content-sidebar genesis-breadcrumbs-visible genesis-singular-image-visible genesis-footer-widgets-hidden lifestyle-pro-blue primary-nav']")).click();
		
		System.out.println("clicked on frame successful");
		
		
	  
	  
  }
}
