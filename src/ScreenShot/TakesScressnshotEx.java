package ScreenShot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TakesScressnshotEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Brijesh Maurya\\Desktop\\bana selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		Utilityy.captureScreenshot(driver, "Facebook opened");
		
	    driver.manage().window().maximize();
	    Utilityy.captureScreenshot(driver, "Browser maximized");
	    
		Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		try {
		driver.findElement(By.xpath("//input[@name=\"email1\"]")).sendKeys("8130749400");	
		Utilityy.captureScreenshot(driver, "email filled");
		
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("@complementrydata&");
		Utilityy.captureScreenshot(driver, "password filled");
		
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		Utilityy.captureScreenshot(driver, "login button clicked");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
		Utilityy.captureScreenshot(driver, "click on logout button");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		Utilityy.captureScreenshot(driver, "click on logout");
		
		System.out.println("Application logout successfully");
		
		Thread.sleep(5000);
		driver.quit();
		}
		catch (Exception e) {
			// TODO: handle exception
			Utilityy.captureScreenshot(driver, "element not found");
			System.out.println("error found");
			
		}
		
		
	}

}
