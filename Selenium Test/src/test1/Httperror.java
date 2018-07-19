package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//http error with exception handling example
public class Httperror {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		try {

			d.get("www.ebay.in");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		finally {
			d.close();
		}
			}
}