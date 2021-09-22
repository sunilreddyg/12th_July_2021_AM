package findelements.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_All_DynamicRows_And_Specific_CellData {

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
		
		
		for (int i = 1; i < Rows.size(); i++) 
		{
			//Get Each Row Using Index help
			WebElement SelectedRow=Rows.get(i);
			
			//Get Selected row Cells
			List<WebElement> Cells=SelectedRow.findElements(By.tagName("td"));
			
			//Get Required cell and Read text inside it
			String CompanyName=Cells.get(0).getText();
			String LTP_price=Cells.get(1).getText();
			String TurnOver=Cells.get(4).getText();
			System.out.println(CompanyName+"   "+LTP_price+"    "+TurnOver);
			
		}

	}

}
