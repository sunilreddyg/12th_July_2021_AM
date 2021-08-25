package switch_commands.Active_Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Active_Element {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
		driver.switchTo().activeElement().sendKeys("info@gmail.com");
		
		
		/*
		 * Note:--> Active element return of webElement. On webElement what are the action
		 * 			allowed we can use of webElement
		 */

	}

}
