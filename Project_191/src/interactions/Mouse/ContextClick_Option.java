package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_Option 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		wd.manage().window().maximize();
		Thread.sleep(4000);
		
		
		WebElement Button=wd.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral'][contains(.,'right click me')]"));
		new Actions(wd).contextClick(Button).perform();
		
		
		
		WebElement Delete_button=wd.findElement(By.xpath("/html[1]/body[1]/ul[1]/li[5]/span[1]"));
		Delete_button.click();
		Thread.sleep(4000);
		
		String alert_msg=wd.switchTo().alert().getText();
		System.out.println(alert_msg);
		
		//Close alert box
		wd.switchTo().alert().accept();
		
		
		
		
		
		
	}

}
