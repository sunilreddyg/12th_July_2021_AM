package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragging_Element_To_Target 
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://marcojakob.github.io/dart-dnd/basic/");
		driver.manage().window().maximize();
		
		
		WebElement Doc1=driver.findElement(By.xpath("(//img[@class='document'])[1]"));
		WebElement Doc2=driver.findElement(By.xpath("(//img[@class='document'])[2]"));
		WebElement Doc3=driver.findElement(By.xpath("(//img[@class='document'])[3]"));
		WebElement Doc4=driver.findElement(By.xpath("(//img[@class='document'])[4]"));
		
		WebElement Trash_Bin=driver.findElement(By.xpath("//div[contains(@class,'trash')]"));
		
		
		//Create Object for actions
		Actions action=new Actions(driver);
		
		//Performing drag and drop options using direct method
		action.dragAndDrop(Doc1, Trash_Bin).perform();
		action.dragAndDrop(Doc2, Trash_Bin).perform();
		
		//Performing drag and drop options using Mouse Commands
		action.clickAndHold(Doc3).moveToElement(Trash_Bin).release().perform();
		action.clickAndHold(Doc4).moveToElement(Trash_Bin).release().perform();
		
		
		

	}

}
