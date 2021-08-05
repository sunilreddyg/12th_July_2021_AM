package mq.webdriver.DatePicker;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Data_From_DatePicker {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		//Login into account
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		//clicking Leave header
		driver.findElement(By.linkText("Leave")).click();
		
		
		
		//Click on editbox to open from calendar
		driver.findElement(By.id("calFromDate")).click();
		
		//selecting month from calendar
		new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")))
		.selectByVisibleText("Dec");
		
		//Select Date from date picker
		driver.findElement(By.linkText("22")).click();
		
		
		//click on editbox to open To calendar
		driver.findElement(By.id("calToDate")).click();
		
		//selecting month from calendar
		new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")))
		.selectByVisibleText("Dec");
		
		
		//Select Date from date picker
		driver.findElement(By.linkText("30")).click();
		
		//Selecting checkbox
		driver.findElement(By.id("leaveList_chkSearchFilter_2")).click();
		
	

	}

}
