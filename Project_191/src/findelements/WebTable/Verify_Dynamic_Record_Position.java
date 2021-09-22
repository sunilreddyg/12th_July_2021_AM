package findelements.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Dynamic_Record_Position 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/equity");
		driver.manage().window().maximize();
		
		//IDentifying Table at webpage
		WebElement Table=driver.findElement(By.id("tblMarketToday"));
		
		//Identifying list of rows available at table
		List<WebElement> Rows=Table.findElements(By.tagName("tr"));
		
		boolean flag=false;
		for (int i = 1; i < Rows.size(); i++) 
		{
			//Get Each Row Using Index help
			WebElement DynamicRow=Rows.get(i);
			//Read a text of each dynamic row
			String RowText=DynamicRow.getText();
		
			if(RowText.contains("NTPC"))
			{
				flag=true;
				System.out.println("Record available at position is --> "+i);
			}
		
		}
		System.out.println("Record available statu is --> "+flag);


	}

}
