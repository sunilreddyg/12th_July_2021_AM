package pageobjects.pageRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import mq.selenium.library.Pom_CommonResuableActions;
import pageobjects.pages.Skynet_HomePage;

public class Run_Using_Common_Reusable_Actions {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		Pom_CommonResuableActions actions=new Pom_CommonResuableActions(driver);
		Skynet_HomePage home=new Skynet_HomePage(driver);
		actions.clickon_element(home.Signin);

	}

}
