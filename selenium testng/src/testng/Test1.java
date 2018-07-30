package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	public static WebDriver driver;

	@Test(groups="smoke", priority=1)
	public void openurl() {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		// String title= driver.getTitle();
		// Assert.assertEquals(title, "google");
	}

	@Test (groups="smoke", priority=1 )
	public void searchbox() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("india");
		ele.submit();
		Assert.assertEquals(driver.getTitle(), "india - Google Search");

	}
}
