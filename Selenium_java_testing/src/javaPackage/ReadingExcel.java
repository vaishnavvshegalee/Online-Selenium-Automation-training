package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {

//		Specify the location of the Excel file
		File src = new File(
				"E:\\Testing_Course_by_Shammi_jha\\Training Materials\\Training Materials\\Short Notes.xlsx");

//		load the file
		FileInputStream fis = new FileInputStream(src);

//		Load workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);

//		load worksheet
		XSSFSheet sh = wb.getSheet("Sheet1");

//		print the loaded sheet name
//		System.out.println(sh.getSheetName());
		
//		print the merged cell
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
//		for (int i = 1; i < sh.getLastRowNum(); i++) {
//				String srNo = sh.getRow(i).getCell(0).getStringCellValue();
//				String topic = sh.getRow(i).getCell(1).getStringCellValue();
//				String desc = sh.getRow(i).getCell(2).getStringCellValue();
//				System.out.println(srNo+"-"+topic+" : "+ desc);
//		}
		
//		System.out.println(sh.getDefaultColumnWidth());
//		System.out.println(sh.getTopRow());
		
//		print the total nums of rows -1st way (it giving the index starts from 0)
		System.out.println(sh.getLastRowNum()+1);
	
//		print the total nums of rows - 2nd way (by default row will give which is present the left side in any excel file)
		System.out.println(sh.getPhysicalNumberOfRows());
		
//		print the total nums of columns through the any row num - 1st way
		System.out.println(sh.getRow(1).getPhysicalNumberOfCells());
		
//		print the total nums of columns through the any row num - 2nd way
		System.out.println(sh.getRow(1).getLastCellNum());
		
		String s = sh.getRow(5).getCell(1).getStringCellValue();
//		System.out.println(s);
		
		
		
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.xpath("")).sendKeys(s);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		}

}
