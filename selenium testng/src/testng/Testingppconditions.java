package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testingppconditions {
	WebDriver d=new FirefoxDriver();
@Test(groups="smoke",dependsOnMethods="testng2.Groupingtestngexample.laptopssearch")
public void seleniumhqsearch() {
	d.get("http://google.com");
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
WebElement ele=d.findElement(By.name("q"));
ele.sendKeys("seleniumhq");
ele.submit();
Assert.assertEquals(d.getTitle(), "seleniumhq - Google Search");
d.quit();
}}
