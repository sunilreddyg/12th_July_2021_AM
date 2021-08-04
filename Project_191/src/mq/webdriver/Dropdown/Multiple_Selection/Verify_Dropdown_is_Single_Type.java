package mq.webdriver.Dropdown.Multiple_Selection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_is_Single_Type {

	public static void main(String[] args) throws Exception
	{
		
		/*
		 * FAQ:--> How to verify dropdown is a single or multiple option selection
		 * 			type
		 */
		
		

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		
		//Click select menu link
		driver.findElement(By.xpath("//button[contains(.,'Select Menu')]")).click();
		Thread.sleep(2000);
		
		
		//Verify Dropdown Mutiple option
		boolean flag=new Select(driver.findElement(By.id("exampleFormControlSelect1"))).isMultiple();
		System.out.println("Dropdown Multiple selection state is --> "+flag);
		
		//Verify Dropdown Mutiple option
		boolean flag1=new Select(driver.findElement(By.id("exampleFormControlSelect2"))).isMultiple();
		System.out.println("Dropdown is multiple selection state is --> "+flag1);

	}

}
