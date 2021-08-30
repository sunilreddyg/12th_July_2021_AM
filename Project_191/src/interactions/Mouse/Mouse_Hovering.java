package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hovering {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		//HRM login syntax
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Performing hover action on Main Tab
		WebElement Admin_Main_TAB=driver.findElement(By.xpath("//b[contains(.,'Admin')]"));
		new Actions(driver).moveToElement(Admin_Main_TAB).perform();
		
		//Performing hover action on Sub Tab
		WebElement Admin_User_Management=driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		new Actions(driver).moveToElement(Admin_User_Management).perform();
		
		//Performing click action using mouse interactions 
		WebElement user_managemenet_users=driver.findElement(By.xpath("//a[contains(@id,'viewSystemUsers')]"));
		new Actions(driver).click(user_managemenet_users).perform();
		//Click method can perform directly without using actions class
		

	}

}
