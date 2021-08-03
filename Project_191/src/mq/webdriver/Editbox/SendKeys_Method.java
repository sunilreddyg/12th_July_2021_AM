package mq.webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Method {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//Login into account
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Click At admin menu
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		
		
		//typing text into editbox 
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Aravind");
		
		
		//Selecting dropdow option with sendkeys method 
		driver.findElement(By.id("searchSystemUser_userType"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
		driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Ali");
		Thread.sleep(2000);
		driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		
		driver.findElement(By.id("searchSystemUser_status")).sendKeys("123");
		System.out.println("Selected User status");
		
		/*
		 * Sendkeys command ignore exception on keybaord shortcust
		 */

	}

}
