package listboxexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxtest {
public static void main(String[] args) throws Exception{
	WebDriver d=new FirefoxDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.get("https://www.w3schools.com/TAGs/tryit.asp?filename=tryhtml_select_multiple");
	d.switchTo().frame(0);
	WebElement ele=d.findElement(By.name("cars"));
	Select sel=new Select(ele);
	sel.selectByIndex(0);
	Thread.sleep(3000);
	sel.selectByIndex(1);
	Thread.sleep(3000);
	sel.selectByIndex(2);
	Thread.sleep(3000);
	sel.selectByIndex(3);
	Thread.sleep(3000);
	sel.deselectByIndex(3);
	Thread.sleep(3000);
	sel.deselectByIndex(2);
	Thread.sleep(3000);
	sel.deselectByIndex(1);
}
}
