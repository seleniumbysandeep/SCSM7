package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WrittingData {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
//get the java representative object of the physical file
FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
//create a workbook or open the Excel file in read mode
Workbook wb = WorkbookFactory.create(fis); 
//get the control of the sheet,then get the control of the row and cell,then type the data
 wb.getSheet("CreateCustomer").getRow(1).getCell(4).setCellValue("fail");
 //convert the java representative object in to physical file
 FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
 //save the workbook 
 wb.write(fos);
 //close the workbook
 wb.close();
	}
}
