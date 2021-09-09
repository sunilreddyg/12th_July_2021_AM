package javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_asychronized {

	public static void main(String[] args)
	{
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		long start = System.currentTimeMillis();
		
		   js.executeAsyncScript(
		       "window.setTimeout(arguments[arguments.length - 1], 500);");
		  
		System.out.println("Elapsed time: " + (System.currentTimeMillis() - start));  
		
		
		
		
		
		
		
		
		
		

	}

}
