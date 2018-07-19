package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Felemt {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("http://makemytrip.com");
		d.manage().window().maximize();
		d.findElement(By.id("hp-widget__sTo")).sendKeys("goa");
		d.findElement(By.id("searchBtn")).click();
		
		//d.close();

	}
}
