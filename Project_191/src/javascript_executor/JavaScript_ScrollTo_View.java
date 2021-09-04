package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_ScrollTo_View {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		
		//Enabled javascript exectuor on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		WebElement Messenger_link=driver.findElement(By.linkText("Messenger"));
		js.executeScript("arguments[0].scrollIntoView()", Messenger_link);
	}

}
