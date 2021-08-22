package ui_verificationCommands.CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Object_Rect {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement OneWay_TripType=driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']"));
		
		
		int Objx=OneWay_TripType.getRect().getX();
		int Objy=OneWay_TripType.getRect().getY();
		int ObjHeight=OneWay_TripType.getRect().getHeight();
		int OBjectWidth=OneWay_TripType.getRect().getWidth();
		
		System.out.println("Object height is --->"+Objx);
		System.out.println("Object width is -----> "+Objy);
		System.out.println("object height is ---> "+ObjHeight);
		System.out.println("Object wdith is ----> "+OBjectWidth);
		
		
		

	}

}
