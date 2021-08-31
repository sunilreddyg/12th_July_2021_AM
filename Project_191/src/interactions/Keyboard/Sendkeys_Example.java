package interactions.Keyboard;

import java.rmi.activation.ActivationGroup_Stub;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_Example {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		
		/*
		 * 	Here sendkeys pass keyboard or characters only after selection of element
		 * 
		 *  driver.findElement(By.id("x")).sendKeys("characters");
		 *	driver.findElement(By.id("x")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		 */
		
		
		new Actions(driver).sendKeys("characters").perform();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).pause(3000).sendKeys(Keys.ARROW_DOWN).perform();
		
		
		WebElement Element=driver.findElement(By.id("y"));
		new Actions(driver).sendKeys(Element, "HYd").pause(2000).sendKeys(Keys.ARROW_DOWN)
		.pause(1000).sendKeys(Keys.ARROW_DOWN).perform();
		

	}

}
