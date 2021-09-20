package findelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Options_From_Select_Class {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		String Exp_cities[]= 
			{
				"South Andaman",
				"Port Blair",
				"dhfhdkhf",
				"East Siang",
				"Darrang",
				"Arrah",
				"Chandigarh",
				"Durg"
			};
		
		
		
		//Identifying location of state drodpown
		WebElement State_Dropdown=driver.findElement(By.xpath("//select[@id='customState']"));
		
		//Get All Options Under Dropdown 
		List<WebElement> AllOptions=new Select(State_Dropdown).getOptions();
		AllOptions.remove(0);
		
		for (int i = 0; i < 8; i++)
		{
			//Select Each option
			WebElement EachState_Option=AllOptions.get(i);
			//Get StateName
			String StateName=EachState_Option.getText();
			EachState_Option.click();
			
			//Wait until the dropdown options load
			Thread.sleep(4000);
			
			//IDentifying city dropdown
			String All_Cities=driver.findElement(By.id("customCity")).getText();
			
			if(All_Cities.contains(Exp_cities[i]))
				System.out.println("Testpass,for the state --> "+StateName+"  valid city displayed --> "+Exp_cities[i]);
			else
				System.out.println("Testfail,for the state --> "+StateName+"  valid city displayed --> "+Exp_cities[i]);
		}
		
		
		
		
		
		
		
		
	}

}
