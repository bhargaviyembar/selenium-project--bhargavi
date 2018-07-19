package test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import test1.Forloop;

public class Alllinks {
public static void main(String[] args) {
	WebDriver d=new FirefoxDriver ();
	d.manage().window().maximize();
	d.get("http://ebay.in");
	int count=0;
	List<WebElement>links=d.findElements(By.tagName("a"));
	System.out.println("Total no of links on the web page are"+links.size());
	for(WebElement link: links) {
		if (!link.getText().equals("")) {
			System.out.println(link.getText());
			count=count+1;
					
		}
	}
	System.out.println("Total no of links with text are"+count);
}
}
