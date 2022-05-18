package Pom_Pagefactory_Fb_RegPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage {

//Declaration @Findby method	
	
	@FindBy(xpath = "//a[@title='Sign up for Facebook']")private WebElement sign_up_link;
	@FindBy(xpath = "//img[@class='fb_logo _registrationPage__fbLogo img']")private WebElement registrationPage_fb_logo;
	@FindBy(xpath = "//a[text()='Already have an account?']")private WebElement alredy_acc;
	@FindBy(name = "firstname")private WebElement first_name;
	@FindBy(name = "lastname")private WebElement sure_name;
	@FindBy(name = "reg_email__")private WebElement phone_emailid;
	@FindBy(name = "reg_passwd__")private WebElement password;
	@FindBy(name = "birthday_day")private WebElement birth_date;
	@FindBy(name = "birthday_month")private WebElement birth_month;
	@FindBy(name = "birthday_year")private WebElement birth_year;
	@FindBy(xpath = "//input[@value='2']")private WebElement gender_male;
	@FindBy(xpath = "//input[@value='1']")private WebElement gender_female;
	@FindBy(name = "websubmit")private WebElement submit_button;

	// Intialization ==> declare the class constructor with public access
    // constructor creation
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Usage ==>
	public void clickFacebookSignupLink() {
		sign_up_link.click();
		
	}

	public void verifyRagistraionPageFbLogo() {
		Assert.assertTrue(registrationPage_fb_logo.isDisplayed(), "The logo is not displayed.");
	}

	public void VerifyRagistrationPageAlredyHaveAcc() {
		Assert.assertTrue(alredy_acc.isDisplayed(), "The text is not visible.");
		Assert.assertEquals(alredy_acc.getText(), "Already have an account?");
	}
	
	public void setRegistrationPageFirstName() {
		first_name.sendKeys("ABC");
	}
	
	public void setRegistrationPageLastName() {
		sure_name.sendKeys("ABC@123");
	}
	
	public void setRegistrationPageMobileEmail() {
		phone_emailid.sendKeys("123456789");
	}
	
	public void setRegistrationPagePassword() {
		password.sendKeys("ABC@123@");
	}
	
	public void setRegistrationPageBirthDay() {
		Assert.assertTrue(birth_date.isDisplayed(),"Birthday is not displayed");
		Assert.assertFalse(birth_date.isSelected());
		Select bday = new Select(birth_date);
		bday.selectByVisibleText("19");
	}
	
	public void setRegistrationPageBirthMonth() {
		Assert.assertTrue(birth_month.isDisplayed(),"birthmonth is not displayed");
		Assert.assertFalse(birth_month.isSelected());
		Select bmonth = new Select(birth_month);
		bmonth.selectByVisibleText("Mar");
	}
	
	public void setRegistrationPageBirthYear() {
		Assert.assertTrue(birth_year.isDisplayed(),"birthyear is not displayed");
		Assert.assertFalse(birth_year.isSelected());
		Select byear = new Select(birth_year);
		byear.selectByVisibleText("1974");
	}
	
	
	public void setsetRegistrationPageGender(String gender) {
		
		if(gender.equalsIgnoreCase("male")) {
			gender_male.click();
		}else if(gender.equalsIgnoreCase("female")) {
			gender_female.click();
		}
		
	}
	
	
	public void clickRegistrationPageSubmitBtn() {
		submit_button.click();
	}

}
