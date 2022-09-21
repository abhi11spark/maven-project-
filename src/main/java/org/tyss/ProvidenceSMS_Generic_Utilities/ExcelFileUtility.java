package org.tyss.ProvidenceSMS_Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	Workbook workbook;

	public void initializeExcel(String excelPath) {
		FileInputStream fisExcel = null;
		try {
			fisExcel = new FileInputStream(excelPath);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			workbook = WorkbookFactory.create(fisExcel);
		} catch (EncryptedDocumentException | IOException e) {

			e.printStackTrace();
		}
	}

	public String getDataFromExcelFile(String sheetName, int rowNumber, int cellNumber) {
		Sheet sheet = workbook.getSheet(sheetName);
		String data = new DataFormatter().formatCellValue(sheet.getRow(rowNumber).getCell(cellNumber));
		return data;
	}
	
	/**
	 * This method is used to fetch the data from the excel based on the key
	 * @param sheetName
	 * @param requiredKey
	 * @return
	 */
	public String getDataFromExcelFile(String sheetName, String requiredKey)
	{
		Sheet sheet = workbook.getSheet(sheetName);
		String value = null;
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			String actualKey = sheet.getRow(i).getCell(3).getStringCellValue();
			if(actualKey.equalsIgnoreCase(requiredKey))
			{
				value = sheet.getRow(i).getCell(3).getStringCellValue();
			}
		}
		return value;
		
	}

	
	
	public void closeExcelWorkbook() {
		try {
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
