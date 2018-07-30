package testng2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import testng.Prepostconditions;

public class Groupingtestngexample extends Prepostconditions{
	//WebDriver d=new FirefoxDriver();
@Test(groups="smoke")
public void laptopssearch() {
	//d.get("http://google.com");
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement laptop=d.findElement(By.name("q"));
	laptop.sendKeys("laptops");
	laptop.submit();
	Assert.assertEquals(d.getTitle(), "laptops - Google Search");
	d.quit();
}
}
