package pageobjects.pageRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.pages.Skynet_HomePage;

public class Run_SkyNet_HomePage 
{

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		
		Skynet_HomePage home=new Skynet_HomePage(driver);
		if(home.Signin.isDisplayed())
		{
			home.click_signin();
		}
		
		
		

	}

}
