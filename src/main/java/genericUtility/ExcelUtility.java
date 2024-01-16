package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this class is to read data from Excel
 * @author Aniruddha Das
 */
public class ExcelUtility {
/**
 * this is a generic method to read data from Excel
 * @param sheetName
 * @param rowNum
 * @param cellNum
 * @return
 * @throws Exception
 */
	public String getDataFromExcel(String sheetName , int rowNum , int cellNum) throws Exception {
		
		FileInputStream fis = new FileInputStream(IconstantUtility.excelPath);
		Workbook book 		=   WorkbookFactory.create(fis);	
		Sheet sh      		=  book.getSheet(sheetName);
		DataFormatter format 	= new DataFormatter();
		String cellValue 	= format.formatCellValue(sh.getRow(rowNum).getCell(cellNum));	
		return cellValue;	
	}
	/**
	 * this is a generic method to read multiple data
	 * @param sheetName
	 * @throws Exception
	 */
	public String  getMultipleDataFromExcel(String sheetName) throws Exception {
		String data = null;
		FileInputStream fis = new FileInputStream(IconstantUtility.excelPath);
		Workbook book 		=   WorkbookFactory.create(fis);	
		Sheet sh      		=  book.getSheet(sheetName);
		DataFormatter format	= new DataFormatter();		
		for(int i = 0 ; i<=sh.getLastRowNum() ; i++)
		{
		Row r =	sh.getRow(i);		
		for(int j = 0 ; j<=r.getLastCellNum() ; j++)
		{
		 data =format.formatCellValue(r.getCell(j));			
		}	
		}
		return data;		
	}
	/**
	 * this is a generic method to write data in excel
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @param data
	 * @throws Exception
	 */
	public void writeDataInExcel(String sheetName ,int rowNum , int cellNum , String data ) throws Exception {
		FileInputStream fis = new FileInputStream(IconstantUtility.excelPath);
		Workbook book 		=   WorkbookFactory.create(fis);	
		Sheet sh      		=  book.getSheet(sheetName);	
		sh.createRow(rowNum).createCell(cellNum).setCellValue(data);	
		FileOutputStream fos = new FileOutputStream(IconstantUtility.excelPath);	
		book.write(fos);	
	}	
}








