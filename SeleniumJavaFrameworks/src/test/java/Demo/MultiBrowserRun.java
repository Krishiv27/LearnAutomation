package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserRun {
	WebDriver driver=null;
	
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			System.out.println("running chrome");
			System.out.println(Thread.currentThread().getId());
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			System.out.println("running Firefox");
			System.out.println(Thread.currentThread().getId());
		}
		else if(browserName.equalsIgnoreCase("InternetExplorer")) {
			driver = new InternetExplorerDriver();
			System.out.println("running InternetExplorer");
			System.out.println(Thread.currentThread().getId());
		}
		
	}
	
	@Test
	public void test1() throws InterruptedException {
		driver.get("https://google.com/");
		Thread.sleep(1000);
	}
	
	@AfterTest
	
	public void tearDown() {
		driver.close();
		driver.quit();
		System.out.println("Test completed");
	}

}
