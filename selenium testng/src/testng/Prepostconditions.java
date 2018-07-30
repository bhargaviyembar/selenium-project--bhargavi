package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Prepostconditions {
	public static WebDriver d;
	@Test (groups="smoke")
	public void setup() {
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("http://google.com");
	}
//	@Test(groups="smoke")
//    public void exit() {
//		d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//		d.quit();
//	}
//		

	}


