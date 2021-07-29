package mq.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("email")).sendKeys("darshan@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Hello12345");

	}

}
