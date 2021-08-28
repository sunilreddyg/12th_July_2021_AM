package switch_commands.WIndows;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window 
{
	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		//Get Mainwindow ID
		String MainWindowID=driver.getWindowHandle();
		
		
		//This link open page at newwindow or New TAB
		WebElement Instagram_link=driver.findElement(By.linkText("Instagram"));
		Instagram_link.click();
		Thread.sleep(5000);
		
		//Get All dynamic window id's
		Set<String> AllWindowIDS=driver.getWindowHandles();
		
		//Foreach loop iterate for number of collection of object times and release each time one object to variable
		for (String EachWindowID : AllWindowIDS) 
		{
			driver.switchTo().window(EachWindowID);
		}
		
		
		System.out.println("current focused window title is ---> "+driver.getTitle());
		
		
		//Type Text into Instagram window
		WebElement Insta_Username=driver.findElement(By.xpath("//input[contains(@name,'username')]"));
		Insta_Username.clear();
		Insta_Username.sendKeys("darshan@gmail.com");
		
		
		//After Completed actions at instagram page switch back controls to Facebook page
		driver.switchTo().window(MainWindowID);
		
		
		System.out.println("Current Page title is --> "+driver.getTitle());
		
		
		//Type Text into Instagram window
		WebElement FB_Username=driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		FB_Username.clear();
		FB_Username.sendKeys("darshan@gmail.com");
		
		
		/*
		 * Set:--> Set is a collection framework where store group of obejcts into random order.
		 * 			Note:--> When Collection of objects only two it follow order
		 */
		

	}

}
