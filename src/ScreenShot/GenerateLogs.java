package ScreenShot;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.apache.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class GenerateLogs {

	@Test
	public void display() throws InterruptedException {
		// TODO Auto-generated method stub

		Logger logger = Logger.getLogger("GenerateLogs");
		PropertyConfigurator.configure("Log4j.properties");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Brijesh Maurya\\Desktop\\bana selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		logger.info("facebook opened");
	    driver.manage().window().maximize();
	    logger.info("browser maximized");
		Thread.sleep(5000);
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("8130749400");
		logger.info("email id entered");
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("@complementrydata&");
		logger.info("password entered");
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		logger.info("login button clicked");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
		logger.info("clicked on ddl");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		logger.info("clicked on logout button");
		Thread.sleep(5000);
		System.out.println("Operation successfully completed");
		driver.quit();
		
		
	}

}
