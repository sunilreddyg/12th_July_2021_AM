package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_Element_Selection_State_With_True_of_False_Condition {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();// TODO Auto-generated method stub
		
		WebElement Female_Radio_btn=driver.findElement(By.xpath("//input[@value='1']"));
		Female_Radio_btn.click();  //we are clicking purposly to check wait commands
		
		
		
		WebDriverWait wait=new WebDriverWait(driver, 50);
		try {
			//Use only for checkbox or radio button selection
			wait.until(ExpectedConditions.elementSelectionStateToBe(Female_Radio_btn, false));
			System.out.println("Checkbox is deselected");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
