package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC003 {
	
	WebDriver driver;
	
	@Test
	public void driverInstantiationAndClose() {
		System.setProperty("webdriver.driver.chrome", "/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("priyar");
		driver.findElement(By.name("pass")).sendKeys("password");
		driver.close();
		
	}

}
