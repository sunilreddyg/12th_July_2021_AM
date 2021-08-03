package mq.webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Outlook_Login_With_Sendkeys_Command {

	public static void main(String[] args) 
	{
		
		//Browser initiation
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		
		//click on Next button
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		
		//Type email into editbox and press Enter Key using keyboard shortcut
		driver.findElement(By.id("i0116")).sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		

	}

}
