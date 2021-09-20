package findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement_Reference_Exception_Example {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//Storing page reference into variable
		WebElement Username=driver.findElement(By.id("email"));
		Username.sendKeys("First user");
		
		//Refreshing a page or navigating to new page will Expire data into variable[It leads to stale Element exception]
		driver.navigate().refresh();
		
		
		Username.clear();
		Username.sendKeys("Second User");

	}

}
