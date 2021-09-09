package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_ElementTobe_visible {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();// TODO Auto-generated method stub
		
		//Hide email object for webpage
		//((JavascriptExecutor)driver).executeScript("document.getElementById('email').setAttribute('style','display:none')");
		System.out.println("Email object is hidden");
		
		try {
			//Create object for WebDriverwait
			WebDriverWait wait=new WebDriverWait(driver, 10);
			WebElement Username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
			Username.clear();
			Username.sendKeys("info.darshan@gmail.com");
			System.out.println("username typed into email textbox");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
