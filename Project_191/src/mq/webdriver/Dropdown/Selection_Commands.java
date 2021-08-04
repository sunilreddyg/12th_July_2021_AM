package mq.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selection_Commands {

	public static void main(String[] args) 
	{
	
		/*
		 * Note:--> use this syntax when object have select tag 
		 * 			at backend hmtl source
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//Login into account
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Click on PIM header link
		driver.findElement(By.linkText("PIM")).click();
		
		//selecting dropdown option using option name
		new Select(driver.findElement(By.id("empsearch_employee_status")))
		.selectByVisibleText("Part-Time Internship");
		
		
		//Selecting dropdown option using value property
		new Select(driver.findElement(By.id("empsearch_termination")))
		.selectByValue("2");
		
		
		//Selecting dropdown option using index number
		new Select(driver.findElement(By.id("empsearch_job_title")))
		.selectByIndex(5);
		
		
		/*
		 * Using Click method Select Dropdown option.
		 * 		1. Take Xpath for option tag you wish to select
		 * 		2. Identify option tag and click on it
		 */
		
		driver.findElement(By.xpath("//option[@value='7'][contains(.,'Sales & Marketing')]"))
		.click();
		
		
		
		
		
		
		
		
		
		
		

	}

}
