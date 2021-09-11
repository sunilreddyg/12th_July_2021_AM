package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_for_Frame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips");
		driver.manage().window().maximize();
		
		
		WebDriverWait wait=new WebDriverWait(driver, 40);
		try {
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("modal_window"));
			System.out.println("Now Controls available at frame");
			
			WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
			Email.clear();
			Email.sendKeys("darshan@gmail.com");
			
			driver.switchTo().defaultContent();
			System.out.println("Now Controls available at mainpage");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		


	}

}
