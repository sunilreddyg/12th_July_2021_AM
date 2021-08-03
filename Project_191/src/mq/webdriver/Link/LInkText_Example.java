package mq.webdriver.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LInkText_Example {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Pages")).click();
		
		driver.findElement(By.linkText("Cristiano Ronaldo")).click();
		
		

	}

}
