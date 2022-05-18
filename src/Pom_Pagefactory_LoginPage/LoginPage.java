package Pom_Pagefactory_LoginPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage {
	
	//Declaration 
	
	@FindBy(xpath = "//img[@class='fb_logo _8ilh img']") private WebElement fb_logo;
	@FindBy(xpath = "//h2[text()='Facebook helps you connect and share with the people in your life.']") private WebElement login_tagline;
	@FindBy(xpath = "//a[text()='Forgotten password?']") private WebElement forgot_pass;
	@FindBy(xpath = "//a[@data-testid='open-registration-form-button']") private WebElement creat_new_acc;
	@FindBy(xpath = "//a[text()='Create a Page']") private WebElement creat_page;
	@FindBy(xpath = "//input[@name='email']") private WebElement email_phone_num;
	@FindBy(xpath = "//input[@name='pass']") private WebElement password;
	@FindBy(xpath = "//button[@name='login']") private WebElement login_btn;
	@FindBys({@FindBy(xpath = "//div[@id='pageFooterChildren']/ul/li")}) private List<WebElement>  footer_links;

	//Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyFacebookLoginPageFblogo() {
		Assert.assertTrue(fb_logo.isDisplayed(), "The facebook login page logo not visible");
		Reporter.log("verifyFacebookLoginPageFblogo");
	}
	
	public void verifyFacebookLoginPageTagline() {
		Assert.assertTrue(login_tagline.isDisplayed(), "The Facebook login page tagline not visible");
		Reporter.log("verifyFacebookLoginPageTagline");
	}
	
	public void verifyFacebookLoginPageForgotPassword() {
		Assert.assertTrue(forgot_pass.isEnabled(), "The Facebook login page forgot password not visible");
        Reporter.log("verifyFacebookLoginPageForgotPassword");
    }
	
	public void verifyFacebookLoginPageCreateNewAcc() {
		Assert.assertTrue(creat_new_acc.isDisplayed(), "The Facebook login page Create new account not visible");
        Reporter.log("verifyFacebookLoginPageForgotPassword");
	}
	
	public void verifyFacebookLoginPageCreatePage() {
        Assert.assertEquals(creat_page.getText(), "Create a Page");
	    Reporter.log("verifyFacebookLoginPageCreatePage");
	}
	
	public void setFacebookLoginPageUserID() {
		Assert.assertTrue(email_phone_num.isDisplayed(), "The Facebook login page email or phone field not visible");
	    email_phone_num.sendKeys("ABCD");
	    Reporter.log("setFacebookLoginPageUserID");
	}
    
	public void setFacebookLoginPassword() {
		Assert.assertTrue(password.isDisplayed(), "The Facebook login page password field not visible");
	    password.sendKeys("123@wer");
	    Reporter.log("setFacebookLoginPassword");
	}
    
	public void clickFacebookLoginLogInButton() {
		Assert.assertTrue(login_btn.isDisplayed(), "The Facebook login page email or phone field not visible");
	    login_btn.click();
	    Reporter.log("clickFacebookLoginLogInButton");
	}

	public void verifyFacebookLogInFooterLink() {
		Assert.assertEquals(footer_links.size(), 30);
		Reporter.log("verifyFacebookLogInFooterLink");
	}
}

