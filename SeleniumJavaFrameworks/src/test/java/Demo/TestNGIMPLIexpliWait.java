package Demo;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestNGIMPLIexpliWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.get("https://google.com/");
				//driver.wait(1000);
				driver.manage().window().maximize();
				
				driver.findElement(By.id("L2AGLb")).click();
				//implicit wait
				
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.name("q")).sendKeys("Automation step by step");
				driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
				//explicit wait
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
				element.click();
				System.out.println("test completed successfully");
				driver.close();
				

	}

}
