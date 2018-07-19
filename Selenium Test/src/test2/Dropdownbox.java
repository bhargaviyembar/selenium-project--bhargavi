package test2;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownbox {
	
	public void closebrowser(WebDriver d,String windowtoclose) {
		Set<String> windowids =d.getWindowHandles();
		for (String id : windowids) {
			d.switchTo().window(id);
			String title=d.getTitle();
			if (title.equals(windowtoclose)) 
			{
				d.close();
				
				
			}
		}
		
	}
	public static void main(String[] args){
		WebDriver d=new FirefoxDriver();
		
		d.get("http://naukri.in");
		d.manage().window().maximize();
		Dropdownbox t=new Dropdownbox ();
		t.closebrowser(d, "Amazon");
		t.closebrowser(d, "Haier");
		t.closebrowser(d, "Virtusa Corporation");} }
		
//		WebElement ele=d.findElement(By.className("_1QZ6fC"));
//		Select sel=new Select(ele);
//		List<WebElement> items=sel.getOptions();
//		for (WebElement item : items) {
//			System.out.println(item.getText());
//		
//		}
//		
//			
//		}
//	}

