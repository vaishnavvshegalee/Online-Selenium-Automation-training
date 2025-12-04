package javaPackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToExcel {

	public static void main(String[] args) throws Exception {
		
//		location of the excel file
		File src = new File("E:\\Testing_Course_by_Shammi_jha\\Training Materials\\Training Materials\\Short Notes.xlsx");
		
//		load the file 
		FileInputStream fis = new FileInputStream(src);
		
//		load workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
//		load the sheet
		XSSFSheet sheet1 = wb.getSheet("Sheet1");
		XSSFSheet sheet2 = wb.getSheet("Sheet2");
		
		String copy = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(copy);
//		System.out.println(sheet1.getSheetName());
//		System.out.println(sheet2.getRow(0).getCell(0).getStringCellValue());
	}

}
