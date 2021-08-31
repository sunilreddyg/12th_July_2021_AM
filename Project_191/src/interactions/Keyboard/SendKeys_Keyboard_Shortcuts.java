package interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys_Keyboard_Shortcuts {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		
		WebElement Company_Skills_Domain=driver.findElement(By.xpath("//input[@placeholder='Enter Company, Skill, Domain']"));
		Company_Skills_Domain.click();
		
		WebElement Company=driver.findElement(By.xpath("//input[@id='course']"));
		
		new Actions(driver).click(Company).sendKeys("C").pause(1000).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).perform();
		
		/*
		 * For keyboard action webdriver doesn't throw any exception..
		 */
		
		
		
		

	}

}
