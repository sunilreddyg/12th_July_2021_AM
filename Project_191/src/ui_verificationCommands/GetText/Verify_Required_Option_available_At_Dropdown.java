package ui_verificationCommands.GetText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Required_Option_available_At_Dropdown {

	public static void main(String[] args) throws Exception
	{
		
		/*
		 * Scenario:-->
		 * 			Verify Citydropdown displayed City names 
		 * 			according to state selection
		 * 
		 * 			Given site url "https://v1.hdfcbank.com/branch-atm-locator"
		 * 			When user select any state
		 * 			Then verify expected cities listout at City Dropdown
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		//Select State dropdown
		Select State_dropdown=new Select(driver.findElement(By.id("customState")));
		State_dropdown.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(5000);
		
		
		//identifying city dropdown location
		WebElement City_Dropdown=driver.findElement(By.xpath("//select[@id='customCity']"));
		//Get All Option text 
		String Cities=City_Dropdown.getText();
		//System.out.println(Cities);
		
		
		if(Cities.contains("Krishna"))
			System.out.println("Expected City available in dropdown list");
		else
			System.out.println("Expected city not available in dropdown list");
		
		
		
		
		
		

	}

}
