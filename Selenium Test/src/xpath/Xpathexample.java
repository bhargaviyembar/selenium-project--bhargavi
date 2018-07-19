package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import test1.Forloop;

public class Xpathexample {
	public static void main(String[] args) {
		int a=0;
		WebDriver d=new ChromeDriver();
		d.get("http://ebay.in");
		d.manage().window().maximize();
		d.findElement(By.id("gh-ac")).sendKeys("laptops");
		d.findElement(By.id("gh-btn")).click();
		List<WebElement> laptops=d.findElements(By.xpath("//a[@class='vip']"));
		List<WebElement> Prices=d.findElements(By.xpath("//span[@class='bold']"));
		//List<WebElement> l=d.findElements(By.xpath("//td[contains(@class, )]"));
		//String str;
		for (int i = 1; i <= laptops.size(); i++) {
			System.out.println(laptops.get(i).getText());
			//str=Prices.t;
			System.out.println(Prices.get(i).getText().replaceAll("Rs. ",""));
			a=a+1;
			//System.out.println(l.get(i).getText());
			
		}
		System.out.println("Total no of laptops are"+a);

		
		
	}

}
