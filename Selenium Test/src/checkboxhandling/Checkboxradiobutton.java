package checkboxhandling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxradiobutton {
public static void main(String[] args) {
	WebDriver d=new FirefoxDriver();
	d.manage().window().maximize();
	d.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons");
	List<WebElement> chkbox=d.findElements(By.xpath("//*[@type='checkbox']"));
for (WebElement state : chkbox) {
	boolean condition=state.isSelected();
	if (!condition==true) {
		state.click();
	}	
}
	
}
}
