package ui_verificationCommands.GetAttribute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Runtime_Attribute_Value {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Scenario:--> Verify Roundtrip radio button selection
		 * 		Given site url is "http://makemytrip.com"
		 * 		And verify triptype selecton oneway on browser launch
		 * 		When user tap on return date for bigger discounts
		 * 		Then Selection comes to roundtrip from oneway
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://makemytrip.com");
		driver.manage().window().maximize();
		
		
		
		WebElement TripType_oneway=driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']"));
		
		String Oneway_Status=TripType_oneway.getAttribute("class");
		
		if(Oneway_Status.equals("selected"))
		{
			System.out.println("OneWay trip type selected on browser launch");
			
			//Click on Retrun Date
			WebElement Return_Data=driver.findElement(By.xpath("//span[contains(.,'RETURN')]"));
			Return_Data.click();
			Thread.sleep(2000);
			
			
			WebElement TripType_Roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
			String Roundtrip_Status=TripType_Roundtrip.getAttribute("class");
			
			//Verify Roundtrip selection state
			if(Roundtrip_Status.equals("selected"))
				System.out.println("Roundtrip is selected");
			else
				System.out.println("Roundtrip is not selected");
		}
		else
		{
			System.out.println("Oneway trip type not selected on browser launch");
		}
		
		
		

	}

}
