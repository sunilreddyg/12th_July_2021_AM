package cookies_Example;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adding_Cookies_To_Browser 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		driver.manage().addCookie(new Cookie("ABCD", "687kjdkjfjhdgjf"));
		System.out.println("Cookies is added manually to browser");
	
		driver.manage().deleteCookieNamed("ABCD");
		System.out.println("Cookie is deleted using it's name");
		
		
		driver.manage().deleteAllCookies();
		
		Set<Cookie> allcookies=driver.manage().getCookies();
		for (Cookie cookie : allcookies) 
		{
			System.out.println(cookie.getName());
			System.out.println(cookie.getValue());
		}
		
		
		
		
		
		
		
		

	}

}
