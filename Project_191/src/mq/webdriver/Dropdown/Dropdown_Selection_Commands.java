package mq.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection_Commands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		
		
		//Selecting dropdown option with visible option name
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("13");

		//Selecting dropdown option with visible option name
		new Select(driver.findElement(By.name("birthday_month"))).selectByVisibleText("Nov");
	}

}
