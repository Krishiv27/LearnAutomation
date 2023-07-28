package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.GoogleSearchPageObject;


public class GoogleSearchTestObject {
 static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoogleSearchTestObject searchTestObject = new GoogleSearchTestObject();
		//startOfTest();
		searchTestObject.startOfTest();
		
		GoogleSearchPageObject searchObj = new GoogleSearchPageObject(driver); 
		searchObj.acceptClick();
		searchObj.setSearchGoogle("Automation step by step");
		searchObj.searchGoogleEnter();
		//endOfTest();
		searchTestObject.endOfTest();
		

	}
	public  void startOfTest() {
		 driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
	}
	
		
	
	public  void endOfTest() {
		driver.close();
	}
}
