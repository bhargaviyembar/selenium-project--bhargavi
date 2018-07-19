package test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.mustache.Value;

public class Selectmethod  {

	
public static void main(String[] args) {
	WebDriver d= new FirefoxDriver();
	d.get("http://amazon.in");
	d.manage().window().maximize();
	WebElement wat=d.findElement(By.id("searchDropdownBox"));
	Select sel=new Select(wat);
	sel.selectByIndex(0);
   sel.selectByValue("search-alias=watches");
    sel.selectByVisibleText("Video Games");
	
	//d.close();
	
	}
}
