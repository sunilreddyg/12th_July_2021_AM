package mq.java.Variables.webdriver_example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reusable_methods 
{
	
	String driver_path="drivers\\chromedriver.exe";
	String url="https://opensource-demo.orangehrmlive.com/";
	WebDriver driver=null;
	
	
	public void launch_chrome_browser()
	{
		System.setProperty("webdriver.chrome.driver",driver_path);
		driver=new ChromeDriver();
		System.out.println("chrome browser is launched");
		
	}
	
	public void Load_Webpage()
	{
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("orange hrm url is loaded");
	}

}
