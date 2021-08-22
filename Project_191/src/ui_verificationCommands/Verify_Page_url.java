package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Page_url {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		if(driver.getTitle().equals("OrangeHRM"))
		{
			System.out.println("OrangeHRM title verified");
			
			//clicking forgot account link
			WebElement forgot_account=driver.findElement(By.xpath("//a[@href='/index.php/auth/requestPasswordResetCode']"));
			forgot_account.click();
			
			if(driver.getCurrentUrl().contains("requestPasswordResetCode"))
				System.out.println("Forgot password page url verified");
			else
				System.out.println("Forgot password page url not verified");
			
			
		}
		else
		{
			System.out.println("OrgangeHRM title not presented");
		}
		

	}

}
