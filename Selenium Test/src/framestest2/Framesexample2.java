package framestest2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framesexample2 {
	public static void main(String[] args) {
	//WebDriver d=new ChromeDriver();
		WebDriver d=new FirefoxDriver();
	d.manage().window().maximize();
	d.get("http://paytm.com");
	d.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	WebElement ele= d.findElement(By.className("_3ac-"));
	ele.click();
	d.switchTo().frame(0);
	WebElement frm=d.findElement(By.id("input_0"));
	frm.sendKeys("abcd");
	WebElement pwd=d.findElement(By.id("input_1"));
	pwd.sendKeys("abcd");
	d.switchTo().defaultContent();
	//WebElement cls=d.findElement(By.xpath("//*[@class='_3i6R']"));
	WebElement cls=d.findElement(By.xpath("//*[text()='X']"));
	//d.switchTo().frame(0).close();
	cls.click();
	
	}

}
