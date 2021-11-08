package excel.library;

public class Run_Excel_keywords {

	public static void main(String[] args) 
	{
		
		Excel_common_actions.getexcel("InputData.xlsx", "config");
		String Browsername=Excel_common_actions.readStringcelldata(1, 0);
		System.out.println(Browsername);
		Excel_common_actions.writecelldata(1, 4, "Hello");
		Excel_common_actions.Create_Workbook("OP.xlsx");
	}

}
