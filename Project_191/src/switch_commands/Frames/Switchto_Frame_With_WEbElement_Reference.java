package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_Frame_With_WEbElement_Reference {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		
		//Switch to frame using webelement reference
		WebElement FrameElement=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(FrameElement);
		System.out.println("Your identification controls under single frame");
		
		
		//Identifying object under frame and performing action on it
		WebElement Textbox=driver.findElement(By.xpath("//input[@type='text']"));
		Textbox.sendKeys("I am just automated");
		
		
		//One Job done under frame it's better to switch controls back to mainpage
		driver.switchTo().defaultContent();
		System.out.println("Your identification controls under page now..");

	}

}
