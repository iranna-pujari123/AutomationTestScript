package dataDrivenFramework;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Exceldata {

	public static String[][] excelTestData() throws Exception
	{
		DataFormatter df= new DataFormatter();
		
		FileInputStream file = new FileInputStream("C:\\Users\\JBK\\Desktop\\LoginPageTestData.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
	    XSSFSheet sheet=	workbook.getSheet("Sheet1");
	    int numberOfRows=sheet.getLastRowNum();
	    System.out.println(numberOfRows);
	   int NumberofColumns= sheet.getRow(0).getLastCellNum();
	   System.out.println(NumberofColumns);
	    String str[][]=new String[numberOfRows][NumberofColumns];
	   for(int i=0;i<numberOfRows;i++)    
	   {
		  XSSFRow row= sheet.getRow(i+1);	  
		   for(int j=0;j<NumberofColumns;j++)      
		   {
			  XSSFCell cell= row.getCell(j);
			  
			str[i][j] =df.formatCellValue(cell);
			   
		   }
	   }
	   return str;
	}	

}
