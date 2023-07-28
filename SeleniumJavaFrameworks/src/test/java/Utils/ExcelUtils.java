package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	XSSFWorkbook workbook;
	XSSFSheet sheet;
public ExcelUtils(String projectPath,String sheetName) {
	try {
	 
	 workbook = new XSSFWorkbook(projectPath);
		 sheet = workbook.getSheet(sheetName);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

	public int getRowCount() {
		int rowCount =sheet.getPhysicalNumberOfRows();
		System.out.println("no. of rows "+rowCount);
		return rowCount;
	}
	
	public int getColCount() {
		int colCount =sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("no. of cols "+colCount);
		return colCount;
	}
	
	
	public double getcellDataNumeric(int rowNum ,int colNum) {
		return sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
	}
	
	public String getcellDataString(int rowNum ,int colNum) {
		return sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
	}
}
