package test1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Whexample {
	public void closebrowser(WebDriver d, String windowtoclose) {
	
		Set<String> windowids=d.getWindowHandles();
		for (String id: windowids) 
		{
			d.switchTo().window(id);
			String title= d.getTitle();
	
			if (title.equals(windowtoclose)) {
				d.close();
			}
		}}
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("http://naukri.in");
		d.manage().window().maximize();
		Whexample obj = new Whexample();
		obj.closebrowser(d, "Amazon");
		obj.closebrowser(d, "Haier");
		obj.closebrowser(d, "Virtusa Corporation");
d.close();
	}
}
