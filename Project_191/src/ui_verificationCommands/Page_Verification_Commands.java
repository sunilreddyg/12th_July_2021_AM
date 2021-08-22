package ui_verificationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verification_Commands {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev");
		driver.manage().window().maximize();
		
		
		//Get Current page title
		String Page_title=driver.getTitle();
		System.out.println("Current window title is --> "+Page_title);
		
		//Get Current Page url
		String Page_url=driver.getCurrentUrl();
		System.out.println("Current window url is --> "+Page_url);
		
		
		//Get current window ID [It is a runtime ID]
		String WinID=driver.getWindowHandle();
		System.out.println("Current Window id is --> "+WinID);
		
		//Get Current window pagesoure
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		
		

	}

}
