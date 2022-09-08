package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This is a generic class for data driven testing
 * @author Sandeep
 *
 */
public class FileLib {
/**
 * THis is a generic method to read the data from property file
 * @param key
 * @return
 * @throws IOException
 */
public  String getPropertyData(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./data/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
}
/**
 * THis is a generic method to read the data from Excel file
 * @param sheetname
 * @param row
 * @param cell
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */

public String getExcelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
return data;
}
}

