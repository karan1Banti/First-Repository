package Assertion_Practice;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion_practice {
	

	


	@Test
	public void sample6() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanket\\Desktop\\shabu\\All jar file\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Reporter.log("Launch the browser");
		WebElement rv = driver.findElement(By.xpath("//img[@xpath='1']"));
		Assert.assertTrue(rv.isDisplayed());
//		rv.isEnabled();
//		rv.isSelected();
	}
	
}
