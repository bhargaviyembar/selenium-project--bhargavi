package explicitwaitexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ewexample {
public static void main(String[] args) {
	WebDriver d=new FirefoxDriver();
	d.manage().window().maximize();
	d.get("http://gmail.com");
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebDriverWait wait=new WebDriverWait(d, 10); //explicit wait
	//WebElement ele=d.findElement(By.xpath("//*[text()='Sign In']"));
	//ele.click();
	
	WebElement userid=d.findElement(By.id("identifierId"));
	userid.sendKeys("archana.appy");
	WebElement next=d.findElement(By.xpath("//*[text()='Next']"));
	next.click();
	WebElement pwd=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	pwd.sendKeys("abcde");
	
	}
}
