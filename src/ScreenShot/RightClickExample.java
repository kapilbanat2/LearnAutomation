package ScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickExample {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Brijesh Maurya\\Desktop\\bana selenium\\chromedriver.exe");					
      driver= new ChromeDriver();					
      driver.get("http://demo.guru99.com/test/simple_context_menu.html");
      driver.manage().window().maximize();
      Actions act=new Actions(driver);
      act.contextClick(driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"))).sendKeys(Keys.ARROW_DOWN)
      .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	  System.out.println("Right click successfully performed");
      Thread.sleep(5000);
	 
	  
	  driver.switchTo().alert().accept();
	  System.out.println("Alert accecpted successfully");
	  Thread.sleep(5000);
      System.out.println("Right click successfully Completed");
      Thread.sleep(5000);
      
      WebElement ele=driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
      act.doubleClick(ele).perform();
      Thread.sleep(3000);
      driver.switchTo().alert().accept();
	  System.out.println("Alert accecpted successfully");
	  Thread.sleep(3000);
	  
	  System.out.println("Double click successfully completed");
      driver.quit();
	  
	  
  }
}
