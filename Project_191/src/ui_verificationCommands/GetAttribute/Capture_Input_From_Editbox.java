package ui_verificationCommands.GetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Input_From_Editbox {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();
		
		
		//Identifying location
		WebElement Departure_Date_Editbox=driver.findElement(By.id("ctl00_mainContent_view_date1"));
		//Get input value from editbox
		String Ddate=Departure_Date_Editbox.getAttribute("value");
		System.out.println(Ddate);
		
		
		
		
		
	}

}
