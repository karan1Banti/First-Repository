package Programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class count_program {
//	@Test (invocationCount = 5 , threadPoolSize = 2)

	@Test (priority = 1)
	public void browser_launch() throws EncryptedDocumentException, IOException {	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanket\\Desktop\\shabu\\All jar file\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();	
		driver.get("https://www.facebook.com/login");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
		}
		 
	@Test (priority = 2)
		public void login_credential() throws EncryptedDocumentException, IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanket\\Desktop\\shabu\\All jar file\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver ();	
			driver.get("https://www.facebook.com/login");
			FileInputStream file = new FileInputStream("C:\\Users\\Sanket\\Desktop\\Automate Excell.xlsx");
    	String value = WorkbookFactory.create(file).getSheet("Take1").getRow(1).getCell(0).getStringCellValue();
    	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(value);
		
		FileInputStream file1 = new FileInputStream("C:\\Users\\Sanket\\Desktop\\Automate Excell.xlsx");
    	String value1 = WorkbookFactory.create(file1).getSheet("Take1").getRow(1).getCell(1).getStringCellValue();
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(value1);
        
        driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
        driver.quit();
    	
	}
	
}	
		
		
		
		
		
		
		
		
	


