package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	private static WebElement element;

	public static WebElement accept_Btn(WebDriver driver) {
	 element =	driver.findElement(By.id("L2AGLb"));
	return element;
	}
	
	public static WebElement search_Txtbox(WebDriver driver) {
		element = driver.findElement(By.name("q"));
		return element;
	}
	public static WebElement search_btn(WebDriver driver) {
		element = driver.findElement(By.name("btnK"));
		return element;
	}
}
