package Utils;

public class ExcelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir");
		String excelLocation = projectPath+"\\Excel\\Data.xlsx";
		//System.out.println(excelLocation);
		ExcelUtils excel  = new ExcelUtils(excelLocation, "Sheet1");
		System.out.println(excel.getcellDataNumeric(1, 1));
		System.out.println(excel.getcellDataString(1, 0));
		excel.getRowCount();
		excel.getColCount();

	}

}
