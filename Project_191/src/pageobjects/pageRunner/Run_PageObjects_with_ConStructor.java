package pageobjects.pageRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.pages.FB_Signup;

public class Run_PageObjects_with_ConStructor {

	public static void main(String[] args) 
	{
		
		

		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		FB_Signup signup=new FB_Signup(driver);

		signup.enterfistname("Arjun");
		signup.enterlastname("Krishna");
		signup.enteremailormobile("ArjunKrishan@gmail.com");
		signup.enter_retype_emailormobile("ArjunKrishan@gmail.com");
		signup.enterpassword("Hello1234");
		signup.select_date("17");
		signup.select_month("Dec");
		signup.select_year("1996");
		signup.select_female_gender();
		

	}

}
