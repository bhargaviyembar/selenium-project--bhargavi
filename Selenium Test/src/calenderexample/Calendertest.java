package calenderexample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendertest {
public static void main(String[] args) {
	WebDriver d=new FirefoxDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.get("https://apsrtconline.in/oprs-web/");
	WebElement ele=d.findElement(By.id("txtJourneyDate"));
	ele.click();
	List<WebElement> rows=d.findElements(By.xpath("(//*[@class='ui-datepicker-calendar'])[1]/tbody/tr"));
	for (int i = 1; i <=rows.size(); i++) {
		List<WebElement> cols=d.findElements(By.xpath("(//*[@class='ui-datepicker-calendar'])[1]/tbody/tr["+i+"]/td"));
		for (int j = 1; j <=cols.size(); j++) {
			WebElement deaprtdate=d.findElement(By.xpath("(//*[@class='ui-datepicker-calendar'])[1]/tbody/tr["+i+"]/td["+j+"]"));
			String date =deaprtdate.getText();
			if (date.equals("26")) {
				deaprtdate.click();
			}
			//deaprtdate.click();
		}
	}
	
	
}
}
