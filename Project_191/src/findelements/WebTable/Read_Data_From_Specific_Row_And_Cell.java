package findelements.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Data_From_Specific_Row_And_Cell {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/equity");
		driver.manage().window().maximize();
		
		//IDentifying Table at webpage
		WebElement Table=driver.findElement(By.id("tblMarketToday"));
		
		//Identifying list of rows available at table
		List<WebElement> Rows=Table.findElements(By.tagName("tr"));
		
		//Target Specific row using index numbers
		WebElement SelectedRow=Rows.get(4);
		
		//Get Selected row Cells
		List<WebElement> Cells=SelectedRow.findElements(By.tagName("td"));
		
		//Get Required cell and Read text inside it
		String CompanyName=Cells.get(0).getText();
		String LTP_price=Cells.get(1).getText();
		String TurnOver=Cells.get(4).getText();
		System.out.println(CompanyName+"   "+LTP_price+"    "+TurnOver);
		
		
		

	}

}
