package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor_ElementTobe_Select {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();// TODO Auto-generated method stub
		
		
		WebDriverWait wait=new WebDriverWait(driver, 50);
		try {
			//Use only for checkbox or radio button selection
			wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@value='1']")));
			System.out.println("Checkbox is selected");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
