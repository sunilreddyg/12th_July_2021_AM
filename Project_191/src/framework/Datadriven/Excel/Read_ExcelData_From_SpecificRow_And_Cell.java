package framework.Datadriven.Excel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import mq.selenium.library.CommonReusableActions;

public class Read_ExcelData_From_SpecificRow_And_Cell {

	public static void main(String[] args) throws Exception
	{
		
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File is located");
		
		//Get workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheet("config");
		
		//Target a row using sheet reference
		XSSFRow row=sht.getRow(1);
		
		//Target cell using row reference
		XSSFCell cell=row.getCell(0);
		
		//get charcters from cell
		String browsername=cell.getStringCellValue();
		System.out.println(browsername);
		
		//Using row reference target cell and read characters from cell
		String url=row.getCell(1).getStringCellValue();
		System.out.println(url);
		
		CommonReusableActions actions=new CommonReusableActions();
		actions.launch_browser(browsername);
		actions.load_webpage(url);
		
	}

}
