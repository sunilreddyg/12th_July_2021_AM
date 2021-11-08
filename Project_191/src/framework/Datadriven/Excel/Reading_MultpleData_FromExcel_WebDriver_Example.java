package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import mq.selenium.library.CommonReusableActions;

public class Reading_MultpleData_FromExcel_WebDriver_Example {

	public static void main(String[] args) throws Exception {
		
		//Target excel binary file using inputstream
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file is located");
		
		//Target Workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheetAt(1);
		
		//Get FirstRow count and LastRow Count
		int FirtRowNum=sht.getFirstRowNum();
		int LastRowNum=sht.getLastRowNum();
		
		System.out.println("Data Started at row is --> "+FirtRowNum);
		System.out.println("Data ended at row is --> "+LastRowNum);
		
		
		CommonReusableActions actions=new CommonReusableActions();
		actions.launch_browser("chrome");
		
		
		//Writing for loop to iterate from start to End row
		for (int i = FirtRowNum+1; i < LastRowNum+1; i++)
		{
			String Username=sht.getRow(i).getCell(0).getStringCellValue();
			String password=sht.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(Username+"  "+password);
			
			
			actions.load_webpage("http://facebook.com");
			actions.Type_text("//input[@id='email']", Username);
			actions.Type_text("//input[@id='pass']", password);
			actions.javawait(2000);
			
		}
		
				

	}

}
