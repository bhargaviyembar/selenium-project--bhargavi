package screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tsshot {
public void screen(WebDriver d,String fp)throws Exception {
	File f =((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(f, new File("C:\\Users\\Bhargavi Yembar\\Desktop\\selenium screen shots\\"+fp));
}
public static void main(String[] args) throws Exception{
	WebDriver d=new FirefoxDriver();
	d.get("http://amazon.in");
	d.manage().window().maximize();
	try {
		WebElement ele=d.findElement(By.id("testid"));
	ele.sendKeys("Laptops");
	} catch (Exception e) {
		Tsshot obj=new Tsshot();
		obj.screen(d, "fp.png");
		// TODO: handle exception
	}
}
}
