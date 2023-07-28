package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportWithTestNG {
	WebDriver driver = null;
	ExtentReports extent;
	
	
	@BeforeSuite
	public void setup() {
		
		 // start reporters
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
    
        // create ExtentReports and attach reporter(s)
         extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

	}
	
	@BeforeTest
	public void startTest() {
	    driver = new ChromeDriver();
       
	}
	
	@Test
	public void googleSearch() throws IOException {
		ExtentTest test = extent.createTest("GoogleSearch", "Validae the search functionality of Google");
		driver.get("https://google.com/");
		
		// log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@Test
	public void googleSearchAgain() throws IOException {
		ExtentTest test = extent.createTest("GoogleSearch", "Validae the search functionality of Google");
		driver.get("https://google.com/");
		
		// log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@AfterTest
	public void endTest() {
		driver.close();
		driver.quit();
	}
	@AfterSuite
	public void tearDown() {
		
		   // calling flush writes everything to the log file
        extent.flush();
	}

}
