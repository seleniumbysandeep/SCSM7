package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcel {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
//get the java representative object of the physical file
FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
//create a workbook or open the Excel file in read mode
 Workbook wb = WorkbookFactory.create(fis); 
 //get the control of the sheet,then get the control of the row and cell, then read the data
 String data = wb.getSheet("CreateCustomer").getRow(1).getCell(2).getStringCellValue();	
//print the data on the console
 System.out.println(data);	
	}
}
