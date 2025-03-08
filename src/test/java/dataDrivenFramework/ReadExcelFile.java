package dataDrivenFramework;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelFile {

	public static void main(String[] args) throws Exception {
		
		
		DataFormatter df= new DataFormatter();
		FileInputStream file = new FileInputStream("C:\\Users\\JBK\\Desktop\\719 TNS batch\\Simple_Maven_Peoject\\ExcelFiles\\testdata.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
	    XSSFSheet sheet=	workbook.getSheet("TestData");
		//workbook.getSheetAt(0);
	    
	    int numberOfRows=sheet.getLastRowNum();
	    System.out.println(numberOfRows);
	    
	   int NumberofColumns= sheet.getRow(0).getLastCellNum();
	   System.out.println(NumberofColumns);
	   
	   
	  XSSFCell cell = sheet.getRow(4).getCell(1);
	 String data = df.formatCellValue(cell);
	    System.out.println(data);
	}

}
