package webtablesexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Arrivaltimeexample {
	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.cleartrip.com/trains/14553");
		java.util.List<WebElement> ros= d.findElements(By.xpath("//table[@class='results']/tbody/tr"));
		int count=ros.size();
		//WebElement el= d.findElement(By.linkText(""))
		//Select sel = new Select();
		
		//List<WebElement> items = sel.getOptions();
		for (int i = 1; i <=count; i++) {
			java.util.List<WebElement> col=d.findElements(By.xpath("//table[@class='results']/tbody/tr["+i+"]/td"));
			int count2=col.size();
			for (int j = 1; j <=count2; j++) { 
				
				WebElement ele=d.findElement(By.xpath("//table[@class='results']/tbody/tr["+i+"]/td["+j+"]"));
				Select sel = new Select(ele);
				List<WebElement> items = sel.getOptions();
				//if ((items.get(i).getText())==(items.get(j).getText()).equals("Sonipat")) {
					System.out.print("Sonipat");
					System.out.print("--");
					break;
				} else if (i == (items.size() - 1) && !items.get(i).getText().equals("Sonipat")) {
					System.out.println("Sonipat not found");
				System.out.print(ele.getText());
				System.out.print("--");
			}
			System.out.println();
		}	
	}
	
	
}

