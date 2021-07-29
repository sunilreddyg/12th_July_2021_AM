package mq.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Interface 
{

	public static void main(String[] args) 
	{
		
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		//Launch browser
		driver.get("https://www.facebook.com/");	//Load webpage
		driver.manage().window().maximize();  		//maximize browser window [optional]
		
		
		
		/*
		 * 1.WebDriver is a interface class which is designed to manipulate
		 * all browser intstance support by selenium.
		 * 
		 * 2.Webdriver interface can manage cross browser automamtion
		 * 	  where as ChromeDriver,FirfoxDriver --etc instantces need
		 * 	  to implement for individual browsers.
		 */
		
		
		/*
		 * Exceptions:-->
		 * 	=>  WebDriver driver=new ChromeDriver();
		 * 		
		 * 		IllegalStateException:-->
		 * 			When Chromdriver.exe file not located
		 * 			under current system.
		 * 
		 * 	=> driver.get("http://google.com");
		 * 		
		 * 		SessionNotCreated:-->
		 * 			Exception display when browserdriver
		 * 			version mismatch with browser version.
		 * 
		 * 		InvalidArgumentException:-->
		 * 			When Url defined without http:// or https://
		 * 	
		 * 			Invalid:-->    driver.get("www.google.com");
		 * 			Valid:---->	   driver.get("http://google.com");
		 */
		
		
	}

}
