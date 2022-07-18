package com.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	XSSFWorkbook workBook;
	XSSFSheet sheet;
	String TESTDATA_SHEET_PATH = "./testData/Book1.xlsx";

	public ExcelData() {

		File src = new File(TESTDATA_SHEET_PATH);

		try {
			FileInputStream fis = new FileInputStream(src);

			workBook = new XSSFWorkbook(fis);
		} catch (Exception e) {

			System.out.println("Unable to Read Excell File");

		}

	}
/**
 * 
 * @param SheetName
 * @return Total number 
 */
	public int getRowCount(String SheetName) {

		sheet = workBook.getSheet(SheetName);

		return sheet.getPhysicalNumberOfRows();

	}
/**
 * 
 * @param SheetName
 * @return Total number of columns present in the specific sheet 
 */
	
	public int getColumnCount(String SheetName) {

		sheet = workBook.getSheet(SheetName);

		return sheet.getRow(0).getLastCellNum();

	}
	
	/**
	 * 
	 * @param sheetName
	 * @return the whole excel sheet data from that Specific sheet
	 * @throws Exception
	 */	
	public Object[][] DataFromExcell(String sheetName) throws Exception {

		sheet = workBook.getSheet("Sheet1");

		int rows = sheet.getPhysicalNumberOfRows();

		int columns = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rows - 1][columns];

		for (int i = 0; i < rows - 1; i++) {

			for (int j = 0; j < columns; j++) {

				data[i][j] = sheet.getRow(i+1).getCell(j).getStringCellValue();

			}
		}

		return data;
	}

	/**
	 * 
	 * @param sheetIndex
	 * @param row
	 * @param columm
	 * @return the specific cell data from the excel by passing row number and column number
	 */
	
	public String getstringdata(int sheetIndex, int row, int columm) {
		return workBook.getSheetAt(sheetIndex).getRow(row).getCell(columm).getStringCellValue();

	}
	/**
	 * 
	 * @param sheetIndex
	 * @param row
	 * @param columm
	 * @return the specific cell data from the excel by passing row number and column number
	 */
	public double getNumericdata(int sheetIndex, int row, int columm) {
		return workBook.getSheetAt(sheetIndex).getRow(row).getCell(columm).getNumericCellValue();

	}
	/**
	 * 
	 * @param sheetIndex
	 * @param row
	 * @param columm
	 * @return the specific cell data from the excel by passing row number and column number
	 */
	public double getNumericdata(String sheetname, int row, int columm) {
		return workBook.getSheet(sheetname).getRow(row).getCell(columm).getNumericCellValue();

	}
	/**
	 * 
	 * @param sheetIndex
	 * @param row
	 * @param columm
	 * @return the specific cell data from the excel by passing row number and column number
	 */
	public String getstringdata(String SheetName, int row, int columm) {

		return workBook.getSheet(SheetName).getRow(row).getCell(columm).getStringCellValue();

	}
}
