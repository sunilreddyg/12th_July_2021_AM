package mq.webdriver.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinktext {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cleartrip.com/");
		driver.manage().window().maximize();
		
		
		/*
		 * Identifying a link with partial link name
		 */
		
		
		driver.findElement(By.partialLinkText("More options:")).click();

	}

}
