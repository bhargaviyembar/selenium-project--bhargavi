package test1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.ClickAction;

import com.thoughtworks.selenium.webdriven.commands.Close;

public class Objectidentification {
	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.get("http://ebay.in");
		d.manage().window().maximize();
		d.findElement(By.className("gh-eb-li-a")).click();
		d.close();
	}
}