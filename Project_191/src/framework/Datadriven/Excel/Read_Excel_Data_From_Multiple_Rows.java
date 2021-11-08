package framework.Datadriven.Excel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_Data_From_Multiple_Rows {

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
		
		//Writing for loop to iterate from start to End row
		for (int i = FirtRowNum+1; i < LastRowNum+1; i++)
		{
			String Username=sht.getRow(i).getCell(0).getStringCellValue();
			String password=sht.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(Username+"  "+password);
		}
		
		

	}

}
