package ui_verificationCommands.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Required_option_Selected_At_Dropdown {

	public static void main(String[] args) 
	{
		
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://v1.hdfcbank.com/branch-atm-locator");
			driver.manage().window().maximize();
			
			//select Dropdown option
			Select State_Dropdown=new Select(driver.findElement(By.id("customState")));
			State_Dropdown.selectByVisibleText("Telangana");
			
			//Verify Required option is selected at dropdown
			String OptionName=State_Dropdown.getFirstSelectedOption().getText();
			System.out.println("Selected Option is --> "+OptionName);
			
			
			
			
			
	}

}
