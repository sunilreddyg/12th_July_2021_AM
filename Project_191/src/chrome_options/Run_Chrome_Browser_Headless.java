package chrome_options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Run_Chrome_Browser_Headless {

	public static void main(String[] args) 
	{
		
		/*
		 * https://chromedriver.chromium.org/capabilities
		 */
		
		
		
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		

		//Second method to set headless argument
		//options.addArguments("--headless");
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		System.out.println("browser is launched");
		
		if(driver.getTitle().equals("Facebook – log in or sign up"))
		{
			System.out.println("TItle is verified");
		}
		else
		{
			System.out.println("Title is not verified");
		}
		
		

	}

}
