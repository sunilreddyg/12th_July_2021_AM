package mq.webdriver.Auto_Complete_Textbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait_Timeout 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		/*
		 * 1. Enter reference text it display sugessions 
		 * 2. Wait for the sugessions
		 * 3. Select Required sugession
		 */
		
		//Login into account
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Click on PIM header link
		driver.findElement(By.linkText("PIM")).click();
		
		
		WebElement Employee_name=driver.findElement(By.id("empsearch_employee_name_empName"));
		Employee_name.clear();
		Employee_name.sendKeys("D");
		
		driver.findElement(By.xpath("//li[contains(.,'Dominic Chase')]")).click();
		
		
		
		/*
		 * Note:--> whenever your test fail because of nosuchelement exception. Implicitwait
		 * 			release it's backup time to load that object..
		 */
	}

}
