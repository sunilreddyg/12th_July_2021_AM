package capture_Screens;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screen_With_Time_Stamp {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		
		//Get System Default Time
		Date date=new Date();    //import java.util;
		//create simple dataformat
		DateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//Cover default system date using date formatter
		String time=df.format(date);
		
		
		WebElement Element=driver.findElement(By.xpath("/html/body"));
		File src=Element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+time+"Homepage.png"));
		
		
		/*
		 * yyyy  -year    	1900-2021
		 * MMM   -month   	Jan-Feb
		 * dd    -day   	 01-31
		 * hh    -hour   	01-12
		 * mm    -minute	00-60
		 * ss    -seconds   01-60
		 * 
		 * in Time stamp forward slash makes sub folder under parent folder
		 */
		
		

	}

}
