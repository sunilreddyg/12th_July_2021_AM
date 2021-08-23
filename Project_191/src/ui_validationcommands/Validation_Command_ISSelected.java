package ui_validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_Command_ISSelected {

	public static void main(String[] args) 
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://practice.automationtesting.in/my-account/");  
		driver.manage().window().maximize();  
		
		
		WebElement Remember_Me=driver.findElement(By.id("rememberme"));
		System.out.println("Before selection checkbox selection status is ---> "+Remember_Me.isSelected());
		
		
		//Select a checkbox
		Remember_Me.click();
		System.out.println("after selection checkbox selection status is ---> "+Remember_Me.isSelected());
		
		

	}

}
