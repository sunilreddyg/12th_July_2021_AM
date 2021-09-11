package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_for_windows {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		WebElement Instagram_link=driver.findElement(By.linkText("Instagram"));
		Instagram_link.click();   //This link will open new window
		
		WebDriverWait wait=new WebDriverWait(driver, 50);
		
		try {
			wait.until(ExpectedConditions.numberOfWindowsToBe(2));
			System.out.println("second window is opened");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
