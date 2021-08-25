package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Child_Frame {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//Click Multiple Frame Tab
		WebElement Multiple_Frame_link=driver.findElement(By.xpath("//a[@href='#Multiple']"));
		Multiple_Frame_link.click();
		Thread.sleep(5000);
		
		
		
		//Switch to Parent frame
		WebElement Parent_Frame=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(Parent_Frame);
		System.out.println("your controls under parent frame");
		Thread.sleep(4000);
		
		
		//Switch to child frame
		driver.switchTo().frame(0);
		
		
		//Enter text into child frame
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi");
		
		
		//Get Controls back to parent frame from child frame
		driver.switchTo().parentFrame();
		
		//Get Controls back to page from parent frame
		driver.switchTo().defaultContent();

	}

}
