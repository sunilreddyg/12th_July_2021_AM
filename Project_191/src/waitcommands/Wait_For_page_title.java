package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_page_title {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();// TODO Auto-generated method stub
		
		long start_time=System.currentTimeMillis();
		
		try {
			
			//Create object for WebDriverwait
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.titleIs("Facebook – log in or sign up"));
			System.out.println("Facebook page displayed expected title is presented");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(System.currentTimeMillis()-start_time+"  ---> Time in milliseconds");

	}

}
