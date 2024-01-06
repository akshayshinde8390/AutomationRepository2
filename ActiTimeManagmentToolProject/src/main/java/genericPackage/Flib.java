package genericPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib 
{
	public void readDataFromExcel(String excelPath,String sheetName,int rowCount,int columnCount) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream(excelPath);
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet(sheetName);
		 Row row = sheet.getRow(rowCount);
		 Cell cell = row.getCell(columnCount);
		 
		 String data=null;
			if(cell.getCellType()==cell.getCellType().STRING)
			{
				data=cell.getStringCellValue();
			}
			else if(cell.getCellType()==cell.getCellType().NUMERIC)
			{
				data=cell.getStringCellValue().valueOf(cell.getNumericCellValue());
			}
	//		return data;
		
			
	}

}
