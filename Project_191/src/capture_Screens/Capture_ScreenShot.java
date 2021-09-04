package capture_Screens;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_ScreenShot {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		//Capturing screen and coverting  into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.createDir(new File("screens"));   //Create folder under your project
		FileHandler.copy(src, new File("screens\\image.png"));
		
		
		
		/*
		 * Inorder to user fileutils class we need to download and configure
		 * apche common io jar files to project
		 * 		URL:-->	https://mvnrepository.com/artifact/commons-io/commons-io/2.6
		 * 				Click on jar files
		 * 				After download Add jar file to project.
		 * 				
		 */
		
		File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("screens\\image1.png"));
		
		
		
		/*
		 * Disadvantages:-->
		 * 			=> Every time when re run test it override image
		 * 			=> Only capture visible interface it doesn't capture overall page
		 * 			=> Not possible caputre image when alert was presented
		 */
		
		

	}

}
