package keyboardexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemove {
public static void main(String[] args) throws Exception {
	WebDriver d=new FirefoxDriver();
	d.manage().window().maximize();
	d.get("http://ebay.in");
	WebElement ele=d.findElement(By.linkText("My eBay"));
	Actions act=new Actions(d);
	act.moveToElement(ele).perform();
	Thread.sleep(2000);
	WebElement mes=d.findElement(By.linkText("Messages"));
	//act.moveToElement(mes);
	mes.click();
	
	
}
}
