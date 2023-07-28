package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.GoogleSearchPage;

public class GoogleSearchTest {
	private static WebDriver driver= null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		startOfTest();
		searchGoogle();
		//endOfTest();

	}
	
	public static void startOfTest() {
		 driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
	}
	public static void searchGoogle() throws InterruptedException {
		GoogleSearchPage.accept_Btn(driver).sendKeys(Keys.RETURN);
		//driver.wait(100);
		GoogleSearchPage.search_Txtbox(driver).sendKeys("automation step by step");
		//driver.findElement(By.className("a4bIc")).sendKeys(Keys.ENTER);
		GoogleSearchPage.search_Txtbox(driver).sendKeys(Keys.ENTER);
		//GoogleSearchPage.search_btn(driver).sendKeys(Keys.RETURN);
		
		
	 }
		
	
	public static void endOfTest() {
		driver.close();
	}
	

}
