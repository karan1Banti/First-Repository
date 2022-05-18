package Assertion_Practice;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Hard_assertion {
SoftAssert soft =  new SoftAssert();
	@Test
	public void sample1() {
		String str="Hi";
		System.out.println(str);
		Reporter.log("sample1");
		soft.assertEquals(str, "Hello");
		
		String str1="Hello";
		System.out.println(str1);
		Reporter.log("sample1");
		soft.assertNotNull(str1);
		soft.assertAll();
	}
	
	@Test
	public void sample2() {
		System.out.println("This is sample2");
	}
}
