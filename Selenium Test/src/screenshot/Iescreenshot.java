package screenshot;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Iescreenshot  {
	public void Iescreen(WebDriver d,String Ip) throws Exception{
		File I=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(I, new File("C:\\Users\\Bhargavi Yembar\\Desktop\\selenium screen shots\\"+Ip));
		
		}
	public static void main(String[] args) throws Exception {
		WebDriver d = new InternetExplorerDriver();
		d.get("http://amazon.in");
		d.manage().window().maximize();
		try {
			WebElement ele=d.findElement(By.id("testid"));
			ele.sendKeys("Laptops");
			
				
						}
				catch (Exception e) {
					Iescreenshot obj=new Iescreenshot();
					obj.Iescreen(d, "Ip.png");
				}
					// TODO: handle exception
				}
}

				