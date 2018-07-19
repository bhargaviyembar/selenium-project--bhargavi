package javascriptexample;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Jsexample {
	public static void main(String[] args) throws Exception{
		WebDriver d=new FirefoxDriver();
		
		d.manage().window().maximize();
		JavascriptExecutor js=((JavascriptExecutor)d);
		
		js.executeScript("window.location='http://ebay.in'");
		js.executeScript("document.getElementById ('gh-ac').value='Laptops'");
		js.executeScript("document.getElementById ('gh-btn').click()");
//		for (int i = 0; i <=5; i++) {
//			js.executeScript("window.scrollBy(0,768)");
//			Thread.sleep(2000);
//		}
//		for (int i = 0; i <=5; i++) {
//			js.executeScript("window.scrollBy(0,-768)");
//			Thread.sleep(2000);
//			
//			}
		Actions act=new Actions(d);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).perform();
		//js.executeScript("history.go(0)");
	
		}
		
		

}
