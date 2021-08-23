package ui_validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Object_Visibility_Or_Hidden_Status {

	public static void main(String[] args) throws Exception 
	{
		
		
		/*
		 * Testcase:--> 
		 * 			1. Navigate to Registratio page
		 * 			2. Enter invalid Email Address
		 * 			
		 * Expected:-->
		 * 			Retype email should be available at hidden state
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.facebook.com/r.php");  
		driver.manage().window().maximize(); 
		
		
		WebElement Email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Email.sendKeys("darshanqa");  //Valid email id is   darshanqa@gmail.com 
		Thread.sleep(4000);
		
		
		WebElement Retype_email=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		
		//Verify Retype email is Hidden at webpage
		if(!Retype_email.isDisplayed())  //!--Not
		{
			System.out.println("Testpass, Email available at hidden state");
		}
		else
		{
			System.out.println("Testfail, Email is visible at webpage");
		}
		

	}

}
