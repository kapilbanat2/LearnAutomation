import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class VerifyErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Brijesh Maurya\\Desktop\\bana selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(5000);
		
		/*
		driver.findElement(By.xpath("//div[contains(text(),'Use another account')]")).click();
		Thread.sleep(3000);
		*/
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		
		String error_actual=driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		String error_expect="Enter an email or phone number";
		
		System.out.println("Error_actual Message = "+error_actual);
		System.out.println("Error_expact Message = "+error_expect);
		
		//Assert.assertEquals(error_actual, error_expect);
		//Thread.sleep(5000);
		
			
		//Assert.assertTrue(error_actual.contains("Enter an email1"));
		//System.out.println("Error message is displaying correctly1");
		/*
		Thread.sleep(5000);
		String error_actual=driver.findElement(By.xpath("//div[@class='o6cuMc']")).getAttribute("innerHTML");
		Assert.assertTrue(error_actual.contains("Enter an email123 "));
		System.out.println(error_actual);
		
		System.out.println("Assertion successfully passed");
		*/
		
	}

}
