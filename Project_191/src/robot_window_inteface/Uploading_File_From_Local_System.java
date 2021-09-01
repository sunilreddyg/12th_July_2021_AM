package robot_window_inteface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploading_File_From_Local_System 
{

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://naukri.com");
		driver.manage().window().maximize();
		
		
		
		WebElement Upload_CV=driver.findElement(By.xpath("//label[@for='file_upload']"));
		Upload_CV.click();
		Thread.sleep(4000);
		
		
		String path="D:\\Sunil_Resume.docx";
		
		//Select String
		StringSelection Spath=new StringSelection(path);
		//Get System clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set Content to clipboard
		clipboard.setContents(Spath, Spath);
		
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		
		 
		 //Copy String to Any writable file using keyboard shortcut 
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		 //Releasing Down Key
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 
		 
		 //Press Enter button
		 robot.keyPress(KeyEvent.VK_ENTER);
		 
		
		 
		
		
		
		

	}

}
