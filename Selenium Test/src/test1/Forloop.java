package test1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forloop {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("http://naukri.in");
	d.manage().window().maximize();
	Set<String>windowids=d.getWindowHandles();
	for (String id : windowids) {
		System.out.println(id);
		
	}
	
//cannot be used for loop, to be used for only try catch //finally {
	
//}	
}
}
