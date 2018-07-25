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

		for (int i = 1; i <=count; i++) {
			java.util.List<WebElement> col=d.findElements(By.xpath("//table[@class='results']/tbody/tr["+i+"]/td"));
			int count2=col.size();
			for (int j = 1; j <=count2; j++) { 
				
				WebElement ele=d.findElement(By.xpath("//table[@class='results']/tbody/tr["+i+"]/td["+j+"]"));
				String stationname = ele.getText();
				if (stationname.equals("Sonipat(SNP)")) {
					System.out.print(stationname);
					System.out.print("--");
					
					d.findElement(By.xpath("//table[@class='results']/tbody/tr["+i+"]/td[5]"));
					d.findElement(By.xpath("//table[@class='results']/tbody/tr["+i+"]/td[6]"));
					break;
				
				
			}
			
			System.out.print(stationname);
			System.out.print("--");
		}	
			System.out.println();
			
			
	}
	
	}}

