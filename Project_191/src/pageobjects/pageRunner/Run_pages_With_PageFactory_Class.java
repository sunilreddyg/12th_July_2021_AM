package pageobjects.pageRunner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.pages.OrangeHRM_Home;

public class Run_pages_With_PageFactory_Class {

	public static void main(String[] args)
	{
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		OrangeHRM_Home home=PageFactory.initElements(driver, OrangeHRM_Home.class);
		home.login_username.sendKeys("Admin");
		home.login_password.sendKeys("admin123");
		home.login_submit_button.click();

	}

}
