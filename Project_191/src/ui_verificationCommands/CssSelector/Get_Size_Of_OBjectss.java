package ui_verificationCommands.CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Size_Of_OBjectss 
{
	
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement OneWay_TripType=driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']"));
		
		
		int Object_height=OneWay_TripType.getSize().getHeight();
		System.out.println("Object height is ---> "+Object_height);
		
		
		int Object_width=OneWay_TripType.getSize().getWidth();
		System.out.println("Object width is ----> "+Object_width);
		
		
	}

}
