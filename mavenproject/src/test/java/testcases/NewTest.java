package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {

	
	@Test
	public void testcase1()
	{
	 WebDriver driver=new FirefoxDriver();
	 driver.get("http://google.com");
	}
}
