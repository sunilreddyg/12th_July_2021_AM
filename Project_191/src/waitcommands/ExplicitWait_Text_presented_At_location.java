package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Text_presented_At_location {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		
		
		WebElement Email=driver.findElement(By.id("identifierId"));
		Email.clear();
		Email.sendKeys("sunilreddy@mindqsystems.com"+Keys.ENTER);

		
		//Manage timegap until expected text visible at location..
		By Text_location=By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/h1/span");
		new WebDriverWait(driver, 100).until(ExpectedConditions.textToBePresentInElementLocated(Text_location, "Hi Pranil"));
		System.out.println("Pranil text presented at Element location");
		
		
	}

}
