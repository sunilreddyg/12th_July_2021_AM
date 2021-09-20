package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Options 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		//Identifying location of state drodpown
		WebElement State_Dropdown=driver.findElement(By.xpath("//select[@id='customState']"));
		
		//Identifying group of objects under state dropdown
		List<WebElement> State_Options=State_Dropdown.findElements(By.tagName("option"));
		
		//Iterate for number of list of options
		for (int i = 0; i < State_Options.size(); i++) 
		{
			//Read each object using index number
			WebElement EachOption=State_Options.get(i);
			EachOption.click();
			Thread.sleep(500);
		}
		
		

	}

}
