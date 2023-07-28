package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setCapability("acceptInsecureCerts", true);
		
	//	InternetExplorerOptions options = new InternetExplorerOptions();
	//	options.setCapability("acceptInsecureCerts", true);
	//	WebDriver driver = new InternetExplorerDriver(options);
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://google.com/");
		//driver.wait(1000);
		driver.manage().window().maximize();

		driver.findElement(By.id("L2AGLb")).click();
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.close();

	}

}
