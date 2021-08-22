package ui_verificationCommands.GetText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Expected_Records_Avaialble_In_Table {

	public static void main(String[] args) 
	{
		
		
		/*
		 * Verify in Today market expected 
		 * Company name was listed 
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/equity");
		driver.manage().window().maximize();
		
		
		//Target table
		WebElement Gainers_table=driver.findElement(By.id("tblMarketToday"));
		//Capture text at Gainers table
		String Table_text=Gainers_table.getText();
		//System.out.println(Table_text);
		
		
		//Verify Expected company available at table list
		if(Table_text.contains("Bajaj Finance"))
			System.out.println("As expected in todays gainers list company name exist");
		else
			System.out.println("Company name doesn't exist in todays gainers list");
		

	}

}
