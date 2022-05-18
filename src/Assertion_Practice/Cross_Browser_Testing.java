package Assertion_Practice;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser_Testing {

//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanket\\Desktop\\shabu\\All jar file\\driver\\chromedriver.exe");
//	ChromeOptions option = new ChromeOptions();
//	option.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
//	
//	WebDriver driver = new ChromeDriver(option);
//	driver.get("https://www.facebook.com/");
//	driver.quit();

	// 1) open url
	// 2) verify url
	// 3) verify id field
	// 4) verify password field
	// 5) verify log in button

	WebDriver driver;
    @Parameters("browser")
	@Test(priority = 1)
	public void allBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Sanket\\Desktop\\shabu\\All jar file\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("brave")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Sanket\\Desktop\\shabu\\All jar file\\driver\\chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
			driver = new ChromeDriver(option);
		} else {
			System.out.println("You enter wrong browser input option");
		}

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority = 2)
	public void VerifyCurrentUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
		Reporter.log("Url verification");
	}

	@Test(priority = 3)
	public void VerifyPageTitle() {
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		Reporter.log("Page Title verification");
	}

	@Test(priority = 4)
	public void VerifyUsernameField() {
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("PQR");
		Reporter.log("Username Field Verified");

	}

	@Test(priority = 5)
	public void VerifyPasswordField() {
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		Assert.assertTrue(password.isDisplayed());
		password.sendKeys("1234");
		Reporter.log("Password field verified");

	}

	@Test(priority = 9)
	public void VerifyLogInButton() {
		WebElement Login = driver.findElement(By.xpath("//button[@name='login']"));
		Assert.assertTrue(Login.isEnabled());
		Login.click();
		Reporter.log("Login button functionality verified");

		driver.quit();
	}

	@Test(priority = 6)
	public void VerifyLogo() {
		WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		Assert.assertTrue(logo.isDisplayed());
	    Reporter.log("Verified that logo is visible");	
		
	 }
	
	@Test(priority = 7)
	public void VerifyText() {
		WebElement Visibletext = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the peop')]"));
		Assert.assertEquals(Visibletext.getText(), "Facebook helps you connect and share with the people in your life.");
		Reporter.log("Verified text visible is correct");
	}
	
	@Test(priority = 8)
	public void VerifyForgottenLink() {
		WebElement forgottenlink = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		Assert.assertTrue(forgottenlink.isEnabled());
		Reporter.log("Verify link is Enable.");
		forgottenlink.click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Reporter.log("Verify link is clickable");
		driver.navigate().back();
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
