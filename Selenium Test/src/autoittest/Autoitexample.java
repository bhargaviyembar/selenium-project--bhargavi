package autoittest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoitexample {
public static void main(String[] args) throws Exception {
	WebDriver d=new FirefoxDriver();
	d.manage().window().maximize();
	d.get("https://www.sendfiles.net/");
	d.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
	WebElement ele=d.findElement(By.linkText("START NOW"));
	ele.click();
	WebElement files=d.findElement(By.xpath("//*[text()='Add Files']"));
	files.click();
	Runtime.getRuntime().exec("cmd /C C:\\Users\\Bhargavi Yembar\\Desktop\\Autoit example\\New AutoIt v3 Script.exe");
	
	
	
	
}
}
