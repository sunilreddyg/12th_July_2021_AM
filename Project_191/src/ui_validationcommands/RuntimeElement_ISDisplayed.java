package ui_validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RuntimeElement_ISDisplayed
{

	public static void main(String[] args) throws Exception 
	{
		
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://www.cleartrip.com");  
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
	
		
		/*
		 * Click More options. Expected "Class of travel" and "Preffered
		 * airlines" element should visible at webpage..
		 */
		
		
		
		//target more options link
		WebElement More_options=driver.findElement(By.partialLinkText("More options:"));
		More_options.click();
		Thread.sleep(5000);
		
		WebElement Travel_Class=driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[4]"));
		WebElement Airlines=driver.findElement(By.xpath("//input[@placeholder='Airline name']"));
		
		
		if(Travel_Class.isDisplayed() && Airlines.isDisplayed())
			System.out.println("TestPass, As expected Travel class and Airlines are visible");
		else
			System.out.println("Testfail, Travel and airlines objects are not visible at webpage");
		
		
		
		
		
		
		/*
		 *  => Click More options.when travel class and airlines elements are visible
		 *  => Expected "Class of travel" and "Preffered
		 * 		airlines" elements hide from webpage
		 */
		
		
		
	}

}
