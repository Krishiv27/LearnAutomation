package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {
	private  WebDriver driver = null;
	static By clickAcceptBtn = By.id("L2AGLb");
	static By setSearchTxt = By.name("q");
	
	public GoogleSearchPageObject(WebDriver driver){
		this.driver = driver;
	}
	
	
	public void acceptClick() {
		driver.findElement(clickAcceptBtn).click();
	}
	public void setSearchGoogle(String txt) {
		driver.findElement(setSearchTxt).sendKeys(txt);
		
	} 
	
	public void searchGoogleEnter() {
		driver.findElement(setSearchTxt).sendKeys(Keys.RETURN);
	}

}
