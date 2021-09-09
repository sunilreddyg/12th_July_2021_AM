package chrome_options;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Chrome_Desired_Capabilites {

	public static void main(String[] args) 
	{
		
		
		
		DesiredCapabilities caps=DesiredCapabilities.chrome();
		caps.setJavascriptEnabled(true);
		caps.setCapability("requireWindowFocus", true);
		caps.setPlatform(Platform.WINDOWS);
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		options.merge(caps); //Merging desired capabilites to chrome options
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://google.com");
		
		
		
		

	}

}
