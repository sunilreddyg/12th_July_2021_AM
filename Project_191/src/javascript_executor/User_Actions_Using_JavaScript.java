package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_Actions_Using_JavaScript {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		
		
		//Enabled javascript executor on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Type text into Editbox using javascript executor
		js.executeScript("document.getElementById('email').value = 'Johnny Bravo'");
		
		//Type text into Editbox using javascript executor
		js.executeScript("document.getElementById('pass').value='Hello12345'");
		
		//Click on object using javascript method [By Using Xpath identification]
		WebElement Login_Btn_Element=driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		js.executeScript("arguments[0].click()", Login_Btn_Element);
		
		
		
		
		

	}

}
