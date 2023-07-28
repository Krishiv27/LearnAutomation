package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG_Demo2 {
	WebDriver driver= null;
	@BeforeTest	
	public void startOfGoogle() {	
		//WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://google.com/");
		//driver.wait(1000);
		driver.manage().window().fullscreen();
	}
	@Test
		public void searchGoogle2() {
		driver.findElement(By.id("L2AGLb")).click();
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		}
	
	@Test
	public void searchGoogle3() {
	driver.findElement(By.id("L2AGLb")).click();
	driver.findElement(By.name("q")).sendKeys("Automation step by step");
	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}
	@AfterTest
		public void endOfGoogle() {
		//driver.close();
		
		} 
	

}
