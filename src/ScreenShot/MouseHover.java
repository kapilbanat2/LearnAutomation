package ScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	WebDriver driver;
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Brijesh Maurya\\Desktop\\bana selenium\\chromedriver.exe");					
      driver= new ChromeDriver();					
      driver.get("https://www.naukri.com/");	
      driver.manage().window().maximize();
      Thread.sleep(5000);
	  
      driver.findElement(By.xpath("//span[@class='searchJob']")).click();
      driver.findElement(By.xpath("//span[@class='searchJob']")).sendKeys("Test");
      
    
      Actions act = new Actions(driver);
      
      WebElement ele = driver.findElement(By.xpath("//div[@class='bgBand scrnBlr']//li[4]//div[1]"));
      
     act.moveToElement(ele).build().perform();
     Thread.sleep(5000);
     System.out.println("Mouse Hover successfully completed");
     
     act.click(ele).build().perform();
     Thread.sleep(5000);
     System.out.println("Skill selection successfully completed"); 
     
     driver.quit();
     
  }
}
