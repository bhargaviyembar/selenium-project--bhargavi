package testng;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import com.thoughtworks.selenium.webdriven.commands.GetTitle;

public class Testngexample {
WebDriver d;
  @Test/*(groups="smoke")*/
  public void openbrowser() {
	  d=new FirefoxDriver();
	
  }
  @Test/*(groups="smoke", dependsOnMethods="openbrowser")*/
  public void openurl() {
	  d.get("http://google.com");
	
  }
  @Test
  public void search() {
	  d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement laptop=d.findElement(By.name("q"));
		laptop.sendKeys("laptops");
		laptop.submit();
		Assert.assertEquals(d.getTitle(), "laptops - Google Search");
		d.quit();
}
  
  
//  @Test/*(groups="smoke", dependsOnMethods= {"openbrowser","openurl"})*/
//  public void pagevalidation() {
//	  Assert.assertEquals(driver.getTitle(), "Google");
//  }
}
