package mq.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM_Login 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		driver.findElement(By.xpath("//b[contains(.,'PIM')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'empName')]")).sendKeys("Peter Mac");
		driver.findElement(By.xpath("//input[@name='empsearch[id]']")).sendKeys("0007");
		driver.findElement(By.xpath("//input[@id='empsearch_supervisor_name']")).sendKeys("John Smith");
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
	}

}
