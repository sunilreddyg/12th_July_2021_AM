package switch_commands.WIndows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Requried_Window_When_Multiple_Windows_Are_Opened 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//Capture current Window dynamic id
		String Main_windowID=driver.getWindowHandle();
		
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
		
		
		
		//Get All Dynamic WIndow ID's
		Set<String> AllWindowIDS=driver.getWindowHandles();
		//Using foreach loop iterate for number of windows
		for (String EachWindowID : AllWindowIDS) 
		{
			driver.switchTo().window(EachWindowID);
			
			//Get Current FoCused window tilte
			String runtime_title=driver.getTitle();
			//System.out.println(runtime_title);
			
			if(runtime_title.contains("Railway Seat Availability"))
			{
				break;  //IT stop iteration   [Break will stop iteration when required title found]
			}
			
		}
		
		
		
		System.out.println("Current focused window title is ---> "+driver.getTitle());
		
		
		
		
		
		

	}

}
