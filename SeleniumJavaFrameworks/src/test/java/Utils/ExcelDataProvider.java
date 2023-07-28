package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
WebDriver driver;

@Test(dataProvider ="testData")
	public void login(String username, String password) {
		driver = new ChromeDriver();
		driver.get("https://www.justflight.com/account/login?returnurl=/account");
		driver.findElement(By.id("UserName")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		
	}
	
	@DataProvider(name="testData")
	public Object[][] getData() {
		String projectPath = System.getProperty("user.dir");
		String excelLocation = projectPath+"\\Excel\\Data.xlsx";
		Object[][] data= testData(excelLocation,"Sheet1");
		return data;	
	}
	
	
	public  Object[][] testData(String excelLocation, String sheetName) {
		ExcelUtils excel  = new ExcelUtils(excelLocation, sheetName);
		int rowsCount = excel.getRowCount();
		int colCount = excel.getColCount();
		Object[][] sheetData= new Object[rowsCount-1][colCount];
		for(int i =1; i<rowsCount ;i++) {
			for(int j = 0;j<colCount;j++) {
				System.out.print(excel.getcellDataString(i, j)+ " | ");
				sheetData[i-1][j] = excel.getcellDataString(i, j);
				
			}
			System.out.println();
		}
		return sheetData;
	}
}
