package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Changing_Html_Object_Behaviour 
{

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//Enable javascript executor on autmation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		
		WebElement UserName=driver.findElement(By.id("email"));
		
		
		//Change editbox into readonly format
		js.executeScript("arguments[0].setAttribute('readonly','readonly')", UserName);
		Thread.sleep(5000);
		
		
		//Change editbox into Disable format
		js.executeScript("arguments[0].setAttribute('disabled','disabled')", UserName);
		Thread.sleep(5000);
		
		//Change editbox into Hidden format
		js.executeScript("arguments[0].setAttribute('style','display:none')", UserName);
		Thread.sleep(5000);
		
		
		//Change editbox behaviour to visible
		js.executeScript("arguments[0].setAttribute('style','display:inline')", UserName);
		Thread.sleep(5000);
		
		//change editbox behaviour to enable mode and writable mode
		js.executeScript("arguments[0].removeAttribute('readonly','readonly')", UserName);
		js.executeScript("arguments[0].removeAttribute('disabled','disabled')", UserName);
		Thread.sleep(5000);
		
		
		
		

	}

}
