package waitcommands;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_for_the_Url_ofpage 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();// TODO Auto-generated method stub
		
	
		try {
			
			//Create object for WebDriverwait
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.urlContains("https://www.facebook.com/"));
			System.out.println("Expected url is verified");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
