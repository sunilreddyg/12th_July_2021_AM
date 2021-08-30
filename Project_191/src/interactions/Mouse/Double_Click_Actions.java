package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click_Actions {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("http://bridgeqsystems.com/demo.php");
		wd.manage().window().maximize();
		
		
		WebElement Button_Tab=wd.findElement(By.xpath("//button[contains(.,'Buttons')]"));
		Button_Tab.click();
		
		
		WebElement Button=wd.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		new Actions(wd).doubleClick(Button).perform();
		
		
		
		
		
		
	}

}
