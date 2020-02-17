package ScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	WebDriver driver;
	
/*
	@Test
	  public void f() throws Exception {
		  
		    ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Brijesh Maurya\\Desktop\\bana selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver(options);
			driver.get("http://demo.guru99.com/test/drag_drop.html");
			Thread.sleep(5000);
			
			Actions act = new Actions(driver);
			
			WebElement drag= driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
			WebElement drop= driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
			
			act.dragAndDrop(drag, drop).build().perform();
			Thread.sleep(5000);
			
			System.out.println("Drag and drop operation successfully completed");
			
			
	
	}
	*/
	
	 @Test		
	    public void DragnDrop() throws InterruptedException					
	    {		
		     System.setProperty("webdriver.chrome.driver","C:\\Users\\Brijesh Maurya\\Desktop\\bana selenium\\chromedriver.exe");					
	         driver= new ChromeDriver();					
	         driver.get("http://demo.guru99.com/test/drag_drop.html");	
	         driver.manage().window().maximize();
	         Thread.sleep(5000);
			//Element which needs to drag.    		
	        	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
	        	Thread.sleep(5000);
	         //Element on which need to drop.		
	         WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
	         Thread.sleep(5000);		
	         //Using Action class for drag and drop.		
	         Actions act=new Actions(driver);					

		//Dragged and dropped.		
	         act.dragAndDrop(From, To).build().perform();		
	         Thread.sleep(5000);
	         System.out.println("Drag and drop operation successfully completed");
		}
	
}
