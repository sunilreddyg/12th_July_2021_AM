package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Page_Title {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev");
		driver.manage().window().maximize();
		
		
		String Expected_title="Selenium";
		
		
		//Get Current Window title
		String Actual_title=driver.getTitle();
		
		
		//Verify to verify two strings equal or not
		boolean flag=Actual_title.equals(Expected_title);
		
		
		if(flag==true)
		{
			System.out.println("Expected title presented at browser window");
			
			WebElement Projects=driver.findElement(By.xpath("//span[contains(.,'Projects')]"));
			Projects.click();
			
			//Verifying project page title
			if(driver.getTitle().equals("Projects | Selenium"))
				System.out.println("Project page title verified");
			else
				System.out.println("Project page title not verified");
				
		}
		else
		{
			System.out.println("Wrong title presented at browser window");
		}
		
		
		
		

	}

}
