package framework.Datadriven.Excel;

import java.io.FileInputStream;

public class Target_Excel_Using_TryCatch_Block {

	public static void main(String[] args) {
		
		FileInputStream fi = null;
		try {
			fi=new FileInputStream("TestData\\SampleData.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		if(fi!=null)
		{
			System.out.println("Proceed reading input data");
		}
		
	}

}
