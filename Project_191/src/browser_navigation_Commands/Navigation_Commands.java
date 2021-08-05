package browser_navigation_Commands;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Navigation_Commands {

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Using navigation command load new page at browser window
		driver.navigate().to("https://www.messenger.com/");
		Thread.sleep(2000);
		
		//Get control back to previous page
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Get control to Next page
		driver.navigate().forward();
		
		
		//Refresh page once
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//Alternative method for refresh a page
		new Actions(driver).sendKeys(Keys.F5);
		
		//Close Single browser window
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
