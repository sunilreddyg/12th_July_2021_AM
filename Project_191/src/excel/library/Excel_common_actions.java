package excel.library;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_common_actions 
{
	public static String filepath="TestData\\";
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook book;
	public static XSSFSheet sht;
	
	
	/*
	 * keyword:--> Read Excel using sheetname
	 */
	public static void getexcel(String filename, String sheetname)
	{
		try {
			fi=new FileInputStream(filepath+filename);
			book=new XSSFWorkbook(fi);
			sht=book.getSheet(sheetname);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	/*
	 * keyword:--> Read Excel using sheetname
	 */
	public static String readStringcelldata(int row, int  cell)
	{
		String cellData=null;
		try {
			cellData=sht.getRow(row).getCell(cell).getStringCellValue();
			return cellData;
		} catch (Exception e) {
			return cellData;
		}
	}
	
	
	/*
	 * keyword:--> Read Excel using sheetname
	 */
	public static void writecelldata(int row, int  cell,String value)
	{
		try {
			sht.getRow(row).createCell(cell).setCellValue(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * keyword:--> Create New Workbook
	 */
	public static void Create_Workbook(String file_outputname)
	{
		try {
			fo=new FileOutputStream(filepath+file_outputname);
			book.write(fo);
			book.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
