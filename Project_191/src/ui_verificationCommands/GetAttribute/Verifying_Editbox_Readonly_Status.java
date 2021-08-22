package ui_verificationCommands.GetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifying_Editbox_Readonly_Status {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Scenario: Verifying departure readonly state
		 * 		Given site url is "https://www.spicejet.com/"
		 * 		
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//Identifying location
		WebElement Departure_Date_Editbox=driver.findElement(By.id("ctl00_mainContent_view_date1"));
		//Capture readonly status
		String Status=Departure_Date_Editbox.getAttribute("readonly");
		
		
		if(!(Status==null))    //!--Not
		{
			if(Status.equals("true"))
			{
				System.out.println("Testpass, Departure editbox is in readonly mode");
			}

		}
		else
		{
			System.out.println("Testfail,Editbox is in writable state");
		}
		
		
	
		

	}

}
