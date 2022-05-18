package Pom_Pagefactory_LoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanket\\Desktop\\shabu\\All jar file\\driver\\chromedriver.exe");	
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}	

	@Test
	public void FacebookLogInPageTest() {
		LoginPage lp = new LoginPage(driver);
		lp.verifyFacebookLoginPageFblogo();
		lp.verifyFacebookLoginPageTagline();
		lp.verifyFacebookLoginPageForgotPassword();
		lp.verifyFacebookLoginPageCreateNewAcc();
		lp.verifyFacebookLoginPageCreatePage();
		lp.setFacebookLoginPageUserID();
		lp.setFacebookLoginPassword();
		lp.clickFacebookLoginLogInButton();
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
