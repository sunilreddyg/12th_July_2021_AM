package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaits {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Manage implicit wait
		driver.manage().timeouts()
		.implicitlyWait(50,TimeUnit.SECONDS)             //Manage timeout until object load at htmsource
		.pageLoadTimeout(100,TimeUnit.SECONDS)           //Manage timeout until complete pageobjects load at window
		.setScriptTimeout(100, TimeUnit.SECONDS);        //Manage timeout until sychronized source to load
		
		
		//Load webpage
		driver.get("http://facebook.com");
		
		//Identifying object
		driver.findElement(By.xpath("//input[@id='email1']"));
		
		
		

	}

}
