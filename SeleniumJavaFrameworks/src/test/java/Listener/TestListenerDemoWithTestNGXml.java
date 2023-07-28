package Listener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestListenerDemoWithTestNGXml {
	WebDriver driver = null;
	@Test
	public void test12() {
		System.out.println("we are working test12&&&");
	}
	@Test
	public void test22() {
		System.out.println("we are working test22&&&");
		driver = new ChromeDriver();
		driver.get("https://www.justflight.com/account/login?returnurl=/account");
		driver.findElement(By.id("UserName")).sendKeys("Admin@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin12334");
		driver.close();
	}
	@Test
	public void test32() {
		System.out.println("we are working test32&&&");
		driver = new ChromeDriver();
		driver.get("https://www.justflight.com/account/login?returnurl=/account");
		driver.findElement(By.id("UserName")).sendKeys("Admin@dmail.com");
		driver.findElement(By.id("P")).sendKeys("admin12334");
		driver.close();
	}

	

}
