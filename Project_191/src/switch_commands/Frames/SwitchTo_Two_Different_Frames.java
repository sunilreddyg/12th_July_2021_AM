package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchTo_Two_Different_Frames {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://epass.apcfss.in/");
		driver.manage().window().maximize();
		
		
		//Switchting to frame using frame ID/Name property
		driver.switchTo().frame("message");
		
		WebElement Verification_offers=driver.findElement(By.xpath("//a[contains(@href,'colleges.do')]"));
		Verification_offers.click();
		Thread.sleep(4000);
		
		
		//Get COntrols back to mainpage form message frame
		driver.switchTo().defaultContent();
		
		
		
		//Switch to Body Frame using Index Number
		driver.switchTo().frame(5);
		System.out.println("Identification controls available at BodyFrame");
		
		
		
		WebElement Ac_year=driver.findElement(By.xpath("//select[contains(@id,'acyearid')]"));
		new Select(Ac_year).selectByIndex(2);
		
		
		
		
		
		
		
		

	}

}
