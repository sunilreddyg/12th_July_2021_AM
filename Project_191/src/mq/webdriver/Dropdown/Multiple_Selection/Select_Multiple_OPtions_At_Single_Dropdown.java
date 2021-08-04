package mq.webdriver.Dropdown.Multiple_Selection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Multiple_OPtions_At_Single_Dropdown {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		
		//Click select menu link
		driver.findElement(By.xpath("//button[contains(.,'Select Menu')]")).click();
		Thread.sleep(2000);
		
	
		//Verify Dropdown Mutiple option
		boolean flag=new Select(driver.findElement(By.id("exampleFormControlSelect2"))).isMultiple();
		System.out.println("Dropdown is multiple selection state is --> "+flag);
		
		if(flag==true)          //If accept only boolean value
		{
			System.out.println("Dropdown is multiple selection type");
			Select MultiSelector=new Select(driver.findElement(By.id("exampleFormControlSelect2")));
			MultiSelector.deselectAll();     //Deselect commands only work on multiple selection dropdown
			MultiSelector.selectByIndex(1);
			MultiSelector.selectByIndex(3);
			MultiSelector.selectByIndex(5);
			
			Thread.sleep(4000);
			
			MultiSelector.deselectByIndex(3);	//Deselect commands only work on multiple selection dropdown
		}
		else                     
		{
			System.out.println("Dropdown is not a multiple selection type");
		}
		
		

	}

}
