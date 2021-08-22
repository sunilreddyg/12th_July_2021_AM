package ui_verificationCommands.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Option_Count_At_Dropdown {

	public static void main(String[] args) 
	{
		
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		//select Dropdown option
		Select State_Dropdown=new Select(driver.findElement(By.id("customState")));
		int State_Count=State_Dropdown.getOptions().size();
		System.out.println(State_Count);
	}

}
