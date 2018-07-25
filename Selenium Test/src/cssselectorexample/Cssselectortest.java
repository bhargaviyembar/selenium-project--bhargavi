package cssselectorexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cssselectortest {
public static void main(String[] args) {
	WebDriver d=new FirefoxDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.get("http://redbus.in");
	WebElement ele=d.findElement(By.cssSelector("[class='db'][type='text'][id='src']"));
	ele.sendKeys("hyderabad");
}
}
