import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		// System.setProperty("webdriver.gecko.driver","C:\\Users\\Brijesh Maurya\\Desktop\\bana selenium\\geckodriver.exe");
		
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Brijesh Maurya\\Desktop\\bana selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		String mtext=driver.findElement(By.xpath("//input[@value=\"Log In\"]")).toString();
		System.out.println(mtext);
		
	/*
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("8130749400");		
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("@complementrydata&");
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		Thread.sleep(5000);
		driver.quit();
		*/
		
		/*
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Avneesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Bana");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("jdbkjbfkjba");
		Thread.sleep(2000);
		
		WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
		Select sel_day=new Select(day);
		Select sel_month=new Select(month);
		Select sel_year=new Select(year);
		
		sel_day.selectByVisibleText("6");
		sel_month.selectByVisibleText("Jul");
		sel_year.selectByVisibleText("1990");
		Thread.sleep(5000);
		
		
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		*/
	}

}
