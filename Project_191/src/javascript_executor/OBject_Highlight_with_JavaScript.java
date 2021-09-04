package javascript_executor;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class OBject_Highlight_with_JavaScript {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		
		//Enabled javascript exectuor on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("document.getElementById('email').style.backgroundColor ='yellow'");
		
		js.executeScript("document.getElementById('pass').style.outline ='thick solid red'");
		
		
		//Capturing screen and coverting  into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.createDir(new File("screens"));   //Create folder under your project
		FileHandler.copy(src, new File("screens\\image123.png"));
		
		
		

	}

}
