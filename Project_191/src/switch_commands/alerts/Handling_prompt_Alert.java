package switch_commands.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_prompt_Alert {

	public static void main(String[] args) throws Exception 
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
		
		//Click on click me button [This action will bring prompt alert at webpage]
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(5000);
		
		
		//Read text of alert
		String alert_text=driver.switchTo().alert().getText();
		System.out.println("Alert contained text is -->"+alert_text);
		
		
		//Type Text into alert texbox
		driver.switchTo().alert().sendKeys("Sunil Reddy");
		
		
		
		
		//Close Alert 
		driver.switchTo().alert().accept();
		
		
		
		
		
		

	}

}
