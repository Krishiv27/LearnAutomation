package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class ExtentReportersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // start reporters
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("newExtentReport.html");
    
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("GoogleSearch", "Validae the search functionality of Google");
        WebDriver driver = new ChromeDriver();
        test.info("Begiing of the test");
        
		driver.get("https://google.com/");
		test.log(Status.PASS, "browser intiated successfully");
		
		//driver.wait(1000);
		driver.manage().window().maximize();
		driver.findElement(By.id("L2AGLb")).click();
		test.log(Status.PASS, "navigated from intial page");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test.log(Status.PASS, "navigated to searched word page");
		driver.close();
		test.log(Status.PASS, "Browser closed");
		test.info("test completed");
		extent.flush();
	}

}
