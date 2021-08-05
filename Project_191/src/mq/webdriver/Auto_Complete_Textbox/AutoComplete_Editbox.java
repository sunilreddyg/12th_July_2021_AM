package mq.webdriver.Auto_Complete_Textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete_Editbox {

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		/*
		 * 1. Enter reference text it display sugessions 
		 * 2. Wait for the sugessions
		 * 3. Select Required sugession
		 */
		
		
		WebElement From_Textbox=driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]"));
		From_Textbox.clear();
		From_Textbox.sendKeys("HYD");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//p[contains(.,'Hyderabad, IN - Rajiv Gandhi International (HYD)')]")).click();
	}

}
