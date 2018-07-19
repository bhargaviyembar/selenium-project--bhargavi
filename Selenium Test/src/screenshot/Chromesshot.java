package screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromesshot {
	public void chromescreen(WebDriver d, String cp) throws Exception {
		File c = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(c, new File("C:\\Users\\Bhargavi Yembar\\Desktop\\selenium screen shots\\" + cp));

	}
	public static void main(String[] args) throws Exception {
		WebDriver d=new ChromeDriver();
		d.get("http://amazon.in");
		d.manage().window().maximize();
		try {
			WebElement ele=d.findElement(By.id("testid"));
			ele.sendKeys("Laptops");
		} catch (Exception e) {
			Chromesshot obj=new Chromesshot();
			obj.chromescreen(d, "cp.png");
			// TODO: handle exception
		}
		
	}
	

}
