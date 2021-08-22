package ui_verificationCommands.CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement OneWay_TripType=driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']"));
		
		
		//Get Selected Element X and Y coordinates
		int Obj_x=OneWay_TripType.getLocation().getX();
		int Obj_y=OneWay_TripType.getLocation().getY();
		
		System.out.println("Object X coordinates are ---> "+Obj_x);
		System.out.println("OBject y coordinates are ---> "+Obj_y);
		
		
		if(Obj_x > 100  &  Obj_x < 400)
			System.out.println("Object presented after margin and left side of the page");
		else
			System.out.println("Object not presented after margin");
		
		

	}

}
