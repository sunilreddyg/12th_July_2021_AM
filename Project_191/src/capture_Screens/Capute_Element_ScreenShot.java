package capture_Screens;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capute_Element_ScreenShot {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		WebElement Element=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/span"));
		File src=Element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\elementusername.png"));

	}

}
