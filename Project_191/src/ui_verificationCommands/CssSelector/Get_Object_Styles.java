package ui_verificationCommands.CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Object_Styles {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement OneWay_TripType=driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']"));
		
		
		//Read Style for Oneway Triptype
		String Obj_color=OneWay_TripType.getCssValue("color");
		String font_size=OneWay_TripType.getCssValue("font-size");
		String text_transform=OneWay_TripType.getCssValue("text-transform");
		
		System.out.println("object color displayed --> "+Obj_color);
		System.out.println("text size displayed --> "+font_size);
		System.out.println("Text Type  --> "+text_transform);
		
		

	}

}
