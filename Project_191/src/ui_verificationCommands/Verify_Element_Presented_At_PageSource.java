package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Presented_At_PageSource {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		
		
	
		/*
		 * Perform action when element presented at source and avoid 
		 * performing action when element not presented at source
		 */
		
		String PageSource=driver.getPageSource();
		
		if(PageSource.contains("email"))
		{
			driver.findElement(By.id("email")).sendKeys("Darshan");
		}
		else
		{
			System.out.println("Element not presented at source");
		}
		
		
		
		/*
		 * We can also verify element presented at source using try catch block..
		 */
		
		
		try {
			
			driver.findElement(By.id("pass2344")).sendKeys("Hello1234");
			System.out.println("Password element presented at source");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("Run Continued");
		
		
		
		
		
		
		
		
		
		

	}

}
