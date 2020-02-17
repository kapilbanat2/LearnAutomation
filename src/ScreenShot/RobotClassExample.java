package ScreenShot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RobotClassExample {

	@Test
	public void fbLogin() throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Brijesh Maurya\\Desktop\\bana selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
    driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("8130749400");		
	driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("@complementrydata&");

	Thread.sleep(2000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	System.out.println("Robot class successfully worked");
}
}
