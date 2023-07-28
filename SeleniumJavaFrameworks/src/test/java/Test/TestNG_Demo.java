package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Config.PropertyFile;


public class TestNG_Demo {
 WebDriver driver= null;
	public static String browserName;
	@BeforeTest	
	public void startOfGoogle() {	
		//WebDriverManager.chromedriver().setup();
		 PropertyFile.getConfigProperty();
		if( browserName.equalsIgnoreCase("Chrome"))
		 driver = new ChromeDriver();
		else if (browserName.equalsIgnoreCase("FireFox"))
		 driver = new FirefoxDriver();
		
		driver.get("https://google.com/");
		//driver.wait(1000);
		driver.manage().window().fullscreen();
	}
	@Test
		public void searchGoogle() {
		driver.findElement(By.id("L2AGLb")).click();
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		}
	@AfterTest
		public void endOfGoogle() {
		//driver.close();
		
		} 
	

}
