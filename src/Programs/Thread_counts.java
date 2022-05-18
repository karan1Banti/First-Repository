package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Thread_counts {

	@Test (invocationCount = 5 , threadPoolSize = 5)     //without threadpool =50000 mlsec...using threadpool 74670
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sanket\\\\Desktop\\\\shabu\\\\All jar file\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
	}
}

