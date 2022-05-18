package Pom_Pagefactory_Fb_RegPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest {

	// All the test cases are call here
	
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
	public void FacebookRegistrationPageTest() {
	RegistrationPage rp= new RegistrationPage(driver);
	rp.clickFacebookSignupLink();
	rp.verifyRagistraionPageFbLogo();
	rp.VerifyRagistrationPageAlredyHaveAcc();
	rp.setRegistrationPageFirstName();
	rp.setRegistrationPageLastName();
	rp.setRegistrationPageMobileEmail();
	rp.setRegistrationPagePassword();
	rp.setRegistrationPageBirthDay();
	rp.setRegistrationPageBirthMonth();
	rp.setRegistrationPageBirthYear();
	rp.setsetRegistrationPageGender("Male");
	rp.clickRegistrationPageSubmitBtn();
	}	
	
	@AfterMethod
	public void Teardown() {
		driver.close();
	}
	
	

}
