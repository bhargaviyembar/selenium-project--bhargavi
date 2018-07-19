package test2;

import java.util.List;

//import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebaydropdownbox {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("http://ebay.in");
		d.manage().window().maximize();
		WebElement ele = d.findElement(By.id("gh-cat"));
		Select sel = new Select(ele);
		List<WebElement> items = sel.getOptions();
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).getText().equals("Shoes")) {
				System.out.println("Shoes found");
				break;
			} else if (i == (items.size() - 1) && !items.get(i).getText().equals("Shoes")) {
				System.out.println("shoes not found");
			}

		}

		// sel.selectByValue("174982");
		// System.out.println("shoes found");
		// System.out.println("Total no of dropdown items are"+items.size());

	}
}
