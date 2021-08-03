package mq.webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Command {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//Login into account  [Assume this username available by default at texbox]
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtUsername")).sendKeys("SUnil");   //Here sunil text append to admin
		Thread.sleep(5000);
		
		//Clear is a method it clears existing text at editbox 
		driver.findElement(By.id("txtUsername")).clear();
		
		
		/*
		 * Note:-->
		 * 		1. Clear command only usefull for textbox objects 
		 * 			Incase clear command used for other objects like [button,link,dropdown ---etc]
		 * 			webdriver throw immediate exception "InvalidElementState" Exception 
		 * 
		 * 		2. For keybord shortcuts webdriver doesn't throws any exception incase of failure
		 * 		   but clear command throws "Invalid Element State exception"
		 */
		
		
		

	}

}
