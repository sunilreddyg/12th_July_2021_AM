package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_With_FrameID {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("modal_window");     
		//If frame contains id/name property we can define it directly in double quotes
		
		Thread.sleep(4000);
		//Identifying object under frame
		WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
		Email.clear();
		Email.sendKeys("darshan@gmail.com");
		
		//Identifying object under frame
		WebElement TripID=driver.findElement(By.xpath("//input[@id='tripidSecond']"));
		TripID.clear();
		TripID.sendKeys("87668767868");
		
		
		//Get Control back to page
		driver.switchTo().defaultContent(); 
		
		
		//IDentying link under page
		WebElement FeedBack_link=driver.findElement(By.xpath("//a[contains(.,'Feedback')]"));
		FeedBack_link.click();
		
		
		
		
		

	}

}
