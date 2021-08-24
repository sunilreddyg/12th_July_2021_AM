package switch_commands.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Alert 
{
	
	public static void main(String args[]) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		//Click on Alert,Frames and windows menu tab
		driver.findElement(By.xpath("//a[@id='v-pills-messages-tab']")).click();
		Thread.sleep(3000);
		
		//Clicking on Alerts Menu
		driver.findElement(By.xpath("//button[contains(.,'Alerts')]")).click();
		Thread.sleep(2000);
		
		//Click on click me button [This action will bring alert at webpage]
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(5000);
		
		//This action will read text presented at alert window
		String alert_msg=driver.switchTo().alert().getText();
		System.out.println(alert_msg);
		
		//This action will click ok button at alert window
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
