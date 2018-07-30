package testng2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterexample 
{
	WebDriver driver=new ChromeDriver();
	@Parameters("title3")
	@Test
	public void openurl(String title3)
	{
		driver.get("http://google.com");
		String title= driver.getTitle();
	  Assert.assertEquals(title, title3);
	}
@Parameters ({"title1","title2"})
@Test
public void titlesearch(String title1, String title2) {
		WebElement ele=driver.findElement(By.name("q"));
		ele.sendKeys(title2);
		ele.submit();
		Assert.assertEquals(driver.getTitle(), title1);
		driver.quit();
	
	}
	
}
