package findelements.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Inside_WebtableCell_Using_Reference_Record {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/exchange-traded-funds-etf");
		driver.manage().window().maximize();
		
		//IDentifying Table at webpage
		WebElement Table=driver.findElement(By.id("bestETFLong"));
		
		//Identifying list of rows available at table
		List<WebElement> Rows=Table.findElements(By.tagName("tr"));
		
		boolean flag=false;
		for (int i = 1; i < Rows.size(); i++) 
		{
			//Get Each Row Using Index help
			WebElement DynamicRow=Rows.get(i);
			//Read a text of each dynamic row
			String RowText=DynamicRow.getText();
		
			if(RowText.contains("HDFC-Gold-ETF"))
			{
				flag=true;
				System.out.println("Record available at position is --> "+i);
				new Actions(driver).click(Table).pause(2000).sendKeys(Keys.END).pause(3000).perform();
				List<WebElement> Cells=DynamicRow.findElements(By.tagName("td"));
				Cells.get(8).findElement(By.tagName("a")).click(); //Clicking on invest link at webtable cell
				break;  //Stop Iteration once click on invest button
				
			}
		
		}
		System.out.println("Record available statu is --> "+flag);
		
		
	
	}

}
