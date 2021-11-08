package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data_into_Excel {

	public static void main(String[] args) throws Exception 
	{
		
		//Target excel binary file using inputstream
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file is located");
		
		//Target Workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheetAt(0);
		
		
		//Upate existing row and Existing cell
		sht.getRow(1).getCell(2).setCellValue("LINUX");
		
		
		//Update in existing row and New Cell
		sht.getRow(1).createCell(3).setCellValue("3.1.4");
		
		//Update new row and new cell data
		sht.createRow(2).createCell(0).setCellValue("Safari");
		
		//Note:--> The runtime updation only effects in workbook
		
		FileOutputStream fo=new FileOutputStream("TestData\\Output.xlsx");
		book.write(fo);   //Writing cell data into new output file
		book.close();     //Save workbook 
	}

}
