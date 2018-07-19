package keyboardexample;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Kbexample {
	public static void main(String[] args) throws Exception {
		WebDriver d = new FirefoxDriver();
		d.get("http://amazon.in");
		d.manage().window().maximize();
		Actions act=new Actions(d);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
}
}
